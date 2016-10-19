#Establishihg the database connection
#Creating a connection
#Closing a connection

import mysql.connector
from config.config import *

#Connect to MySQL database
class Connection(object):
    def getConnection(self):
        conn = mysql.connector.connect(host=ht, database='users',user=usr, password=psw)
        return conn
    def closeConnection(self,conn):
        conn.commit()
        conn.close()
