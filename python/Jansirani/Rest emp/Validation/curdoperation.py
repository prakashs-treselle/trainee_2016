import sys
from flask import jsonify
from app import *
sys.path.append('D:/python program/Rest emp/configuration')
from config import *
sys.path.append('D:/python program/Rest emp/DBUtills')
from DBConnection import *
db=DBConnection()

#to add the detail from database
def insert_detail_db(empid,empname):
    try:
        con=db.getConnection()
        cur=con.cursor()
        cur.execute(insertquery,(empid,empname))
        con.commit()
        con.close()
        return jsonify({'Employee_id':empid,'Employee_name':empname,'status':'inserted successfully'})
    except Exception as e:
        return (str(e))

#to delete the detail from the database
def delete_detail_db(empid):
    try:
        con=db.getConnection()
        cur=con.cursor()
        cur.execute(deletequery.format(empid))
        con.commit()
        con.close()
        return jsonify({'Emp_id':empid,'status':'deleted sucessfully'})
    except Exception as e:
	    return (str(e))

#to search data from the database
def search_detail_db(empid):
    try:
        con=db.getConnection()
        cur=con.cursor()
        cur.execute(searchquery.format(empid))
        output=cur.fetchall()
        empList=[]
        for emp in output:
            empDict= {
                'empId': emp[0],
                'empName': emp[1],
                'status':' empid searched sucessfully' 
                }
            empList.append(empDict)
        return jsonify(empDict)
       
    except Exception as e:
	    return (str(e))
                        
#to view the list of empolyee from the db
def view_detail_db():
    try:
        con=db.getConnection()
        cur=con.cursor()
        cur.execute(selectquery)
        resultset=cur.fetchall()
        empList=[]
        for emp in resultset:
            empDict={
                'Empid':emp[0],
                'Empname':emp[1],
                'Status':'sucess'
                }
            empList.append(empDict)
        return jsonify(empList)
    except Exception as e:
	    return (str(e))
        
                        
    
        
