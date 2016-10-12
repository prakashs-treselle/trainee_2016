#Getting the valid email from the user and send them welcome mail to that user...
import mysql.connector
import logging
import datetime
import re
from connection.connection import *
from config.config import *
global date

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

#User details 
class User(Connection):
    def userdetail(self):
        #geting details from user
        email = input("Enter your email")
        self.validatemail(email)
        while True:
            name = input("Enter your name:")
            if name.isalpha():
                break
            if name.isdigit():
                logging.error("Enter the valid user name.")
               
        while True:
            password = input("Enter the password")
            if re.match(r'[A-Za-z0-9@#$%^&+=]{8,}', password):
                logging.info("Password you entered is correct")
                break
            else:
                logging.warn("Password you entered is incorrect")
        self.userExist(email)
        self.insertMail(name,email,password)

#Insert user details in database
    def insertMail(self,name,email,password):
            conn = Connection.getConnection(self)
            cursor = conn.cursor()
            cursor.execute(insert ,(name,email,password))
            Connection.closeConnection(self,conn)
            logging.info("User records are stored successfully")

    def validatemail(self, email):
        match = re.match(r'[\w.-]+@[\w.-]+.\w+', email)
        while match != None:
            logging.info("valid mail")
            break
        else:
            logging.warn("Not valid mail")
            self.userdetail()
            

#Check the DB whether user already exist or not in database
    def userExist(self,email):
        conn = Connection.getConnection(self) 
        cursor=conn.cursor()
        cursor.execute("select * from register where email='{0}';".format(email))
        data = cursor.fetchall()
        for row in data:
            print(row)
        if data:
            logging.warn("Already user exist")
            self.userdetail()
        else:
            logging.info("New user")
        Connection.closeConnection(self,conn)





