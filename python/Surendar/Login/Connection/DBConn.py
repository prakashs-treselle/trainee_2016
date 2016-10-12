import mysql.connector
from Configuration.config import *

class DBConn(object): #Connect to MySQL database
    def getconnection(self):
        conn = mysql.connector.connect(host=ht, database=db,
                                       user=usr, password=psw)
        return conn
    def closeconnection(self,conn):
        conn.commit()
        conn.close()
