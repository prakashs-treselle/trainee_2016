#Connect to MySQL database
import mysql.connector
from Config.config import *

class Connection():
    def getConn(conn):
        conn = mysql.connector.connect(host=ht, database='record',
                                       user=usr, password=psw)
        return conn
    def closeConn():
        conn.commit()
        conn.close()
