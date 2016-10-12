import mysql.connector
from configuration.config import *
class Conn():     
    def getconn():        
        conn=mysql.connector.connect(host=ho1,database=base,user=user1,password=pwd1)        
        return conn
    def closeconn(self,conn):          
        conn.commit()
        conn.close()
