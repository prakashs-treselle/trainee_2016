'''In this class Establishing a
database connection''' 
import mysql.connector
from config import *


class connection(object):

    def dbconnection(self):
        con = mysql.connector.connect(host=ht,
                                           database='mailrecords',
                                           user=un,
                                           password=pswd1)
        return con
    #method for closing a connection
    def closeConnection(self,con): 
        con.commit()
        con.close()
         
