from flask import Flask, render_template, request, url_for, jsonify
import mysql.connector
import re
from Connect.connection import *
from Config.config import *

app = Flask(__name__)
db = Connection()
@app.route('/')
def home():
   return render_template("home.html")

@app.route('/enternew')
def new_employee():
   return render_template("employee.html")

@app.route('/addrec',methods = ['POST', 'GET'])
def addrec():
   if request.method == 'POST':
      nm = request.form['nm']
      addr = request.form['addr']
      pin = request.form['pin']
      mob = request.form['mob']
      match = re.match('^[A-Za-z]*$', nm)
      if match != None:
         conn = db.getConn()
         cur = conn.cursor()
         cur.execute("INSERT INTO employee(name,addr,pin,mob) VALUES(%s, %s, %s, %s)" ,(nm,addr,pin,mob))
         conn.commit()
         return jsonify({'Status':'True'})
      else:
         return jsonify({'Status':'False'})
      #finally:
          #return render_template("result.html",msg = msg)
          #db.closeConn()

@app.route('/list',methods = ['POST', 'GET'])
def addlist():
   conn = db.getConn()
   cur = conn.cursor()
   cur.execute("select * from employee;")
   rows = cur.fetchall();
   lists = []
   for row in rows:
      data = {'name':row[0],'addr':row[1],'pin':row[2],'mob':row[3]}
      lists.append(data)
   return jsonify(lists)
   #db.closeConn()
   #return render_template("list.html",rows = rows)

if __name__ == '__main__':
   app.run(debug = True, port=5550)
