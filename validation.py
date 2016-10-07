from flask import render_template
from DB.config import *
from DB.ConnectDB import *
from DB import ConnectDB
def access(name,psw):
    try:
       
       if((name == 'vennila') and (psw == 'sripushpa')):
            return render_template("student.html")
       else:
            return "param not gtting"
    except :
            return "sorry page not found"
