import re
from flask import jsonify
#from app import *


#validate empid is digit or not
def isDigit(empid):
    messages={
            'status': 'invalid',
            'message': 'empid is not  digit'
            }
    if re.match("^([0-9])*$",empid):
        status=1
        return status
    else:
        return jsonify(messages)
#validate name is string or not
def isString(empname):
    message={
            'status': 'invalid',
            'message': 'it is not sting'
            }
    if re.match("^([a-zA-Z])*$",empname):
        status=1
        return status
    else:
        return jsonify(message)
def isAlphanumeric():
    message = {
            'message': 'alphanumeric value'
            }
    resp = jsonify(message)
    return resp
