import sys
sys.path.append('D:/python program/newjson/dbconnection')
from custdetails import *
sys.path.append('D:/python program/newjson/configure')
from config import *
from app import *
def CustDetail(c_id,c_name):
    try:
        conn =db.dbconnect()
        cursor = conn.cursor()
        cursor.execute("""INSERT INTO jsonTable
               (custid,custname) VALUES
               (%s,%s)""",(c_id,c_name))
        conn.commit()
        conn.close()
        return jsonify({'Customer_id':c_id,'Customer_name':c_name})
    except Exception as e:
        return (str(e))
    
def deleteDetail(customerid):
    try:
        conn =db.dbconnect()
        cursor = conn.cursor()
        cursor.execute(deletequery.format(customerid))
        conn.commit()
        conn.close()
        return jsonify({'Customer_id':customerid,'INFO':'Id will be deleted'})
    except Exception as e:
        return (str(e))
