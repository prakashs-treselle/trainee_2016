from flask import Flask, request, flash, url_for, redirect, render_template ,jsonify
import mysql.connector
import sys
from connection.conn import *
import re
app = Flask(__name__)


@app.route('/',methods=['GET','POST'])
def register():
    #hello()
    return render_template('login.html')
@app.route('/register', methods=['GET', 'POST'])    
def insert():
        name = request.form['name']
        passward = request.form['passward']
        match = re.match(r'[\w.-]+@[\w.-]+.\w+', name)
        if match!=None:
            conn=Conn.getconn()   
            cursor=conn.cursor()
        
            cursor.execute("INSERT INTO login6(name,passward) VALUES (%s,%s)",(name,passward))
            conn.commit()
            return jsonify({'status':'success'})
        else:
            return jsonify({'status':'failed'})

        
        
        
        #return jsonify({'status':'success'})

        #return render_template('hello.html')
@app.route('/hello1',methods=['GET','POST'])
def view():
    conn=Conn.getconn()   
    cursor=conn.cursor()
    cursor.execute("select * from login6")
    result=cursor.fetchall()
    l=[]
    for row in result:
        page={'username':row[0],'passward':row[1]}
        l.append(page)
       # list1 = [
        #{'status':'success'}
    
    return jsonify(success=l)
    #return jsonify(l)
        
if __name__ == '__main__':
   app.run(port=4007,debug = True)

    
