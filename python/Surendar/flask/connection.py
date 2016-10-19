#Connect to MySQL database
import mysql.connector
from config import *

class Connection(object):
    def getConn(self):
        conn = mysql.connector.connect(host=ht, database='detail',
                                       user=usr, password=psw)
        return conn
    def closeConn(self,conn):
        conn.commit()
        conn.close()
