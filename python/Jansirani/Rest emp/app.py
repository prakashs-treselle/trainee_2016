from flask import request,Flask
import sys
sys.path.append('D:/python program/Rest emp/Implementation')
from app_service import *

app = Flask(__name__)

# get from the employee details
@app.route('/getDetail')
def getDetail():
    empid = request.args['userid']
    empname = request.args['username']
    return addDetail(empid,empname)
#delete from the employee detail
@app.route('/deleteDetail')
def deleteDetail():
    empid=request.args['id']
    return deleteId(empid)
#search from the particular employee detail
@app.route('/searchDetail')
def searchDetail():
    empid=request.args['id']
    return searchData(empid)
#view from the list of employee details
@app.route('/view')
def viewDetail():
    return viewData()
    
    

if __name__ == '__main__':
    app.run(debug=False,port=8005)
