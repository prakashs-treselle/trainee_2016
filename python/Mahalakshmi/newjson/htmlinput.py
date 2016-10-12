from flask import Flask
from flask import Flask, redirect, url_for, request
from flask import flash
import sys
sys.path.append('D:/python program/newjson/configure')
from config import *
sys.path.append('D:/python program/newjson/dbconnection')
from dbcon import *
from flask import render_template
from flask import redirect
import re

app = Flask(__name__)
db = conection()
@app.route("/")
def home():
     return render_template("home.html")

@app.route('/summit')
def mainpage():
     return render_template("summit.html")
     

@app.route('/login',methods = ['POST', 'GET'])
def login():
  try:
      number = request.form['num']
      if not re.match("^([0-9])*$",number):
            flash('Enter the valid number')
      #return redirect(url_for('mainpage'))
      name = request.form['nm']
      conn =db.dbconnect()
      cursor = conn.cursor()
      cursor.execute("""
                INSERT INTO jsonTable
                (name,number) VALUES
                (%s,%s)""" ,(name,number))
      conn.commit()
      conn.close()
      
      return redirect(url_for('mainpage'))
      #flash("Enter the valid number")
  except Exception as e:
      return (str(e))
      
@app.route('/views',methods = ['POST', 'GET'])
def view():
  try:
      assign=request.form
      conn =db.dbconnect()
      cursor=conn.cursor()
      cursor.execute("select * from jsonTable")
      output=cursor.fetchall()
      conn.close()
      
      return render_template("views.html",assign=output)
  except Exception as e:
      return (str(e))
@app.route('/deletepage',methods=['POST','GET'])
def delete_data():
      return render_template("delRecords.html")
@app.route('/delete',methods=['POST','GET'])
def delete():
  try:
      name = request.form['nm']
      conn=db.dbconnect()
      cursor=conn.cursor()
      cursor.execute("DELETE FROM jsonTable WHERE name='{0}'".format(name))
      conn.commit()
      conn.close()
      return "The record is deleted!!!"
  except Exception as e:
      return (str(e))
   
if __name__ == "__main__":
     app.secret_key = 'super secret key'
     app.run()(debug=True)
