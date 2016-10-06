   from flask import Flask, render_template, request, flash
   from flask import Flask , jsonify
   from mysql.connector import connection
   from DB.config import *
   from DB.ConnectDB import *
   from DB import ConnectDB
   import collections
   
   app.secret_key="Secret"
   #service to select a entire record from the DB   
   def selectRecords(valueDict):
      
      ph=None
      che=None
      mathsmark=None
      
      try:
         sid = valueDict.get("id")
         sID = int(sid)
         sName= valueDict.get("name")
         dictResult =collections.OrderedDict()
         con = ConnectDB.getconnection()
         cr=con.cursor()
         cr.execute(searchRecord.format(sID,sName))
         results = cr.fetchall()
         
         for row in results:
             dictResult={"Id":row[0],"Name":row[1],"Physics":row[2],"Chemistry":row[3],"Mathematics": row[4],"total":row[5],"Average":row[6]}
             ph=row[2]
             che=row[3]
             mathsmark=row[4]
         con.close()
         if("ph" in valueDict):
            phVar=valueDict.get('ph')
            ph=int(phVar)
         if("che" in valueDict):
            cheVar=valueDict.get('che')
            che= int(cheVar)
         if("maths" in valueDict):
            mVar=valueDict.get('maths')
            mathsmark= int(mVar)
         totalAvg=calculate(ph,che,mathsmark)
         total = totalAvg.get("Total")
         avg = totalAvg.get("Avg")
         expected={"Id":sID,"Name":sName,"Physics":ph,"Chemistry":che,"Mathematics": mathsmark,"total":total,"Average":avg}
         return jsonify({"Default":dictResult,"Expected":expected})
      except ValueError:
         error = "You have entered incorrect mark "
         flash(exception)
         return render_template("failed.html",error=error)

      
   def calculate(ph,Chemistry,mathsmark):
      total = ph+Chemistry+mathsmark
      avg = total/3
      totalAvg= {"Total":total,"Avg":avg}
      return totalAvg
