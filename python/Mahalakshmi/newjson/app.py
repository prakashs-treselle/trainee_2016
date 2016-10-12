from flask import request,Flask
from flask import jsonify
import sys
import re
sys.path.append('D:/python program/newjson/configure')
from config import *
sys.path.append('D:/python program/newjson/dbconnection')
from dbcon import *
sys.path.append('D:/python program/newjson/services')
from validating import *
sys.path.append('D:/python program/newjson/dbconnection')
from custdetails import *

app = Flask(__name__)
db = conection()

@app.route('/login')
def login():
    customerid = request.args['custid']
    customername = request.args['custname']
    #customernumber=request.args['customerno']
    #customerpassword = request.args['custpass']
    return addinfo(customerid,customername)

@app.route('/delete')
def delete():
    customerid = request.args['custid']
    return deleteid(customerid)

if __name__ == '__main__':
    app.run(port=8999)

