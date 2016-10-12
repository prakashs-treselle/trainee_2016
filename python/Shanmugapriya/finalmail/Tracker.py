import logging
import datetime
import time

from dbcon import *
from config import *

logging.basicConfig(level=logging.DEBUG)
logger = logging.getLogger(__name__)


class TrackDetails():
      
    #details of mail sended person   
    def sentMail(self):
        con=connection.dbconnection(self)  
        cursor=con.cursor()
        cursor.execute(sent)
        result=cursor.fetchall()
        if result:
            for (name,emailid,send_date,send_time,status) in result:
                row="{},{},{},{},{}".format(name,emailid,send_date,send_time,status)
                print (row)
        else:
            logging.info( "Record Empty")
        connection.closeConnection(self,con)
        
    #Display the details for mail sended persons
    def failedToSent(self):
        con=connection.dbconnection(self)  
        cursor=con.cursor()
        cursor.execute(fail)
        result=cursor.fetchall()
        if result:
            for (name,emailid,send_date,send_time,status) in result:
                row="{},{},{},{},{}".format(name,emailid,send_date,send_time,status)
                print (row)
            else:
                logging.info( "Record Empty")
            connection.closeConnection(self,con)
