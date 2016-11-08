#Using track whether the mail is sent to the particular user
import logging
import datetime
import time
from connection import *
from config import *

logging.basicConfig(level=logging.DEBUG)
logger = logging.getLogger(__name__)

#Using track whether the mail is sent to the particular user
#displays the user to whom the mail is sent
#displays the user to whom mail is not sent
class Track():    
    def mailSent(self):
        conn = Connection.getConnection(self)  
        cursor = conn.cursor()
        cursor.execute(sent)
        result = cursor.fetchall()
        if result:
            for (name,email,send_date,send_time,status) in result:
                row="{},{},{},{},{}".format(name,email,send_date,send_time,status)
                print(row)
        else:
            logging.info("Null records")
        Connection.closeConnection(self,conn)
        
    def mailNotSent(self):
        conn = Connection.getConnection(self)  
        cursor = conn.cursor()
        cursor.execute(notsent)
        result = cursor.fetchall()
        if result:
            for (name,email,send_date,send_time,status) in result:
                row="{},{},{},{},{}".format(name,email,send_date,send_time,status)
                print(row)
        else:
            logging.info("Null records")
        Connection.closeConnection(self,conn)
    
        
          

        
