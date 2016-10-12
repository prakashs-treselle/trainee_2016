'''In this class Establishing a
database connection''' 
import mysql.connector
from config import *

class conection(object):

    def dbconnect(self):
        conn = mysql.connector.connect(host=host1,
                                           database="jsonDb",
                                           user=user1,
                                           password=password1)
        return conn
    #method for closing a connection
    def closeConnec(self,conn): 
        conn.commit()
        conn.close()
         
