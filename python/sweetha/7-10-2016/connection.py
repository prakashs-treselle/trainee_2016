import mysql.connector
from config import *
#DataBase connection class
class connection:
    def getcon():
        con = mysql.connector.connect(user=user1, password=password1,host=host1,database='mysql')
        return con
    def closeconnection(self,con):
        con.commit()
        con.close()
 
