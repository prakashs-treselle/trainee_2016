from flask import request,Flask
from flask import jsonify
import sys
import re
from config import *
from dbconnect import *
from calculate import *

app = Flask(__name__)
@app.route("/expect" ,methods=['GET'])
def expect():
    customerid = request.args.get('custid')
    customername = request.args.get('custname')
    app=request.args.get('apple')
    man=request.args.get('mango')
    goa=request.args.get('guava')
    ban=request.args.get('banana')
    dict1={
        'cust_id':customerid,
        'cust_name':customername,
        'apple':app,
        'mango':man,
        'guava':goa,
        'banana':ban
        }
    return manipulate(dict1)
    
if __name__ == "__main__":
     app.run(host='0.0.0.0',port=8999)

   

