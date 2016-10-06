from flask import Flask, render_template, request, flash
from flask import Flask , jsonify
from mysql.connector import connection
from DB.config import *
from DB.ConnectDB import *
from DB import ConnectDB
import collections

#service to select a entire record from the DB   
def selectRecords():
    dictResult={}
    try:
      
      dictResult =collections.OrderedDict()
      con = ConnectDB.getconnection()
      cr=con.cursor()
      cr.execute(searchRecord.format(132,"appu"))
      results = cr.fetchall()
      for row in results:
          dictResult={"Id":row[0],"Name":row[1],"Physics":row[2],"Chemistry":row[3],"Mathematics": row[4],"total":row[5],"Average":row[6]}
      con.close()
      print(dictResult)
    except ValueError:
        print("error")
        
selectRecords()
