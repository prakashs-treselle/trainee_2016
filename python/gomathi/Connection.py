import mysql.connector
from mysql.connector import Error
from config import *
class Connection:
    conn = None
    try:
        
        def getconnection(self):
            conn = mysql.connector.connect(host=hostname1,
                                               database=databasename,
                                               user='root',
                                               password='admin123')
            return conn
    except Error as e:
            print(e)
            def closeconnection(self,conn):
                conn.close
