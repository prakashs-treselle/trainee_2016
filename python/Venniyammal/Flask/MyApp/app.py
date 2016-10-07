from flask import Flask, render_template, request
from config import *
import ConnectDB
app = Flask(__name__)

@app.route('/')
def student():
   return render_template('student.html')



@app.route('/result',methods = ['POST', 'GET'])
def result():
   con = ConnectDB.getconnection()
   print(con)
   cr=con.cursor()
   name = request.form['Name']
   pysics = int(request.form['Physics'])
   chemistry = int(request.form['chemistry'])
   Mathematics = int(request.form['Mathematics'])
   total = pysics+chemistry+Mathematics
   print(name)
   avg = total/3
   print(avg)
   qry="INSERT INTO   studentsrecord(Name,Pysics,Chemistry,Maths,Total,Average) VALUES ('%s', '%d', '%d', '%d', '%d','%f' )" % (name,pysics,chemistry,Mathematics,total,avg)
   cr.execute(qry)
   con.commit()  
   print("Successfully inserted")
   con.close()
      #return redirect(url_for('success'))
   return render_template("result.html")
@app.route('/records',methods = ['POST', 'GET'])
def records():
   con = ConnectDB.getconnection()
   cr=con.cursor()
   
   cr.execute(selectrecord)
   result = cr.fetchall()
   print(result)
   return render_template("records.html", result=result)
   
if __name__ == '__main__':
   app.run(debug = True)
