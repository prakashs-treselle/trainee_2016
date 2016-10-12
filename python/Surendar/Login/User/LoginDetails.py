import logging
import datetime
import time
from time import gmtime, strftime
from Connection.DBConn import *
from Configuration.config import *
logging.basicConfig(level=logging.DEBUG)
logger = logging.getLogger(__name__)
class LoginDetails():
#Forgot password for login account
    def forgotPass(self):
        login=raw_input("Enter the login: ")
        newpass=raw_input("Enter the New password: ")
        confirmpass=raw_input("Enter the Confirm password: ")
        conn=DBConn.getconnection(self)
        cursor = conn.cursor()
        cursor.execute("UPDATE page SET password=%s WHERE login=%s",(confirmpass,login))
        conn.commit()
        print("Your new password: ",confirmpass)
        logging.info("\nSuccessfully changed!\n")
        DBConn.closeconnection(self,conn)
#Viewing user account from DB
    def view(self):
        conn=DBConn.getconnection(self)
        cursor=conn.cursor()
        cursor.execute("select * from loginpage;")
        row=cursor.fetchone()
        while row != None:
            data=(datetime.datetime.strptime(row[1], '%d-%m-%Y').strftime(date4))
            print(data)
            row=cursor.fetchone()
        logging.info("\nSuccessfully executed!\n")
        DBConn.closeconnection(self,conn)
