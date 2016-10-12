'''doing validation for emailId'''


import sys
import re
sys.path.append('D:/python program/newjson/dbconnection')
from custdetails import *
from app import *

def addinfo(customerid,customername):
    c_id=isDigit(customerid)
    c_name=isString(customername)
    if c_id==1 and c_name==1:
        return CustDetail(customerid,customername)
    elif c_id!=1 and c_name!=1:
        return nonfoun()

def deleteid(customerid):
    c_id=isDigit(customerid)
    if c_id==1: 
        return deleteDetail(customerid)
    elif c_id!=1: 
        return nonfoun()
    
def isDigit(customerid):
    messages={
            'status': 'invalid',
            'message': 'customerid is not  digit'
            }
    if  re.match("^([0-9])*$",customerid):
        status=1
        return status
    else:
        return jsonify(messages)
   
def isString(customername):
    message={
            'status': 'invalid',
            'message': 'it is not sting'
            }
    if  re.match("^([a-zA-Z])*$",customername):
        status=1
        return status
    else:
        return jsonify(message)

def nonfoun(error=None):
    message={
            'status': '404',
            'message': 'NOT EXIST'
            }
    return jsonify(message)
                
