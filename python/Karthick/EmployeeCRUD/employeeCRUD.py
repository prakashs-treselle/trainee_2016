'''In this program using web app in flask and
performing insert,display,delete operations'''
from flask import Flask
from flask import Flask, redirect, url_for, request,flash
from dbcon import *
from config import *
from flask import render_template
from flask import redirect
import sys
import re

app = Flask(__name__)
app.secret_key = 'some_secret'
db = conection()


@app.route('/')
def home():
     return render_template("home.html")

@app.route('/save')
def mainpage():
     return render_template("save.html")

#inserting the empolyee details in database and doing validation
@app.route('/insert',methods = ['POST', 'GET'])
def insert():
      error=None    
      try:
           name = request.form['nm']
           if not re.match("^[A-Za-z]*$", name):
                #error="invalid type pls give correct value"
                flash('Invalid type of "Name" field,enter the correct value')
                return redirect(url_for('mainpage'))
               
           number = request.form['num']
           if not re.match("^[0-9]*$", number):
                flash('Invalid type of "NUMBER" field,enter the correct value')
                return redirect(url_for('mainpage'))

           location = request.form['loc']
           if not re.match("^[A-Za-z]*$", location):
                flash('Invalid type of "Location" field,enter the correct value')
                return redirect(url_for('mainpage'))

           position = request.form['po']
           if not re.match("^[A-Za-z]*$", position):
                flash('Invalid type of "Job Title" field,enter the correct value')
                return redirect(url_for('mainpage'))

           conn =db.dbconnect()
           cursor = conn.cursor()
           cursor.execute("""INSERT INTO Empdetail
                   (Emp_Name,Emp_number,Location,Position) VALUES
                   (%s,%s,%s,%s)""",(name,number,location,position))
           conn.commit()
           conn.close()
           return redirect(url_for('mainpage'))
      except ValueError:
           print("Invalid values ")
     
#displaying the details in web browser    
@app.route('/views',methods = ['POST', 'GET'])
def view():
     try:
          assign=request.form
          conn =db.dbconnect()
          cursor=conn.cursor()
          cursor.execute("select * from Empdetail")
          output=cursor.fetchall()
          conn.close()
          return render_template("views.html",result=output)
     except Exception as e:
          return (str(e))
     
#deleting the detail in database
@app.route('/delete',methods = ['POST', 'GET'])
def deletefun():
      return render_template("delete.html")     

@app.route('/delete1',methods = ['POST', 'GET'])
def delete1():
      number = request.form['nm']
      conn =db.dbconnect()
      cursor=conn.cursor()
      cursor.execute(deletequery.format(number))
      conn.commit()
      conn.close()
      return "deleted"
#seraching the employee details using number     
@app.route('/search',methods = ['POST', 'GET'])
def searchfun():
      return render_template("search.html")
     
@app.route('/search1',methods = ['POST', 'GET'])     
def search1():
     try:
          number = request.form['nm']
          conn =db.dbconnect()
          cursor=conn.cursor()
          cursor.execute( "select * from Empdetail where Emp_number='{0}';".format(number))
          row = cursor.fetchall()
          #return "searched"
          #conn.close()
          return render_template("search.html",result=row)
     except ValueError:
           print("Invalid values ")
     
     
#execution starts here   
if __name__ == "__main__":
     app.run(debug=True,port=9000)
