from app import *
import sys
sys.path.append('D:/python program/Rest emp/Validation')
from uservalidate import *
from curdoperation import *

def addDetail(empid,empname):
    eid=isDigit(empid)
    ename=isString(empname)
    if(eid==1 and ename==1):
        return insert_detail_db(empid,empname)
    elif(eid!=1 and ename!=1):
        return isAlphanumeric()
    elif(eid!=1):
        return eid
    else:
        return ename
    
def deleteId(empid):
    eid=isDigit(empid)
    if(eid==1):
        return delete_detail_db(empid)
    else:
        return eid

def searchData(empid):
    eid=isDigit(empid)
    if(eid==1):
        return search_detail_db(empid)
    else:
        return eid
def viewData():
    return view_detail_db()

