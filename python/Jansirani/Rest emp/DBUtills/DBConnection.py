import mysql.connector
import sys
sys.path.append('D:/python program/Rest emp/configuration')
from config import *
'''
to establishing database connection
'''
class DBConnection(object):
    def getConnection(self):
        conn= mysql.connector.connect(host=hostname,
                                           database=databasename,
                                           user=user,
                                 password=pwd)
        return conn 
    def closeConnection(self):
        conn.commit()
        conn.close()
        
