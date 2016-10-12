import mysql.connector
from config import *
class dbconnect(object):
    def function(self):
            conn = mysql.connector.connect(host=host1,
                                               database=database1,
                                               user=user1,
                                               password=password1)
            return conn
   # def closeconn(self,conn):
            #conn.commit()
            #conn.close()
