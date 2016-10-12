import mysql.connector
import logging
import sys
import os
import re
import time
import datetime
#from datetime import datetime
from Connection.DBConn import *
from Configuration.config import *
users = {}
status = ""
global name
global login
global dob
global password
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)
#This class will get loginid and password of the appropriate user
class LoginUser(DBConn):
    def register(self):
        num = int(input("Enter your choice..."))
        for i in range(0,num):
            login = raw_input("Create login: ")
            password = raw_input("Create password: ")
            self.valid(login)
            self.validate(password)
            self.loginPage(login,password)
#Add user data in the Database
    def loginPage(self,login,password):
        conn=DBConn.getconnection(self)
        cursor = conn.cursor()
        cursor.execute("INSERT INTO page(login,password) VALUES(%s, %s)",(login,password))
        if login in users: # check if login name exists
            logging.warn("\nLogin name already exist!\n")
        else:
            users[login] = password # add login and password
            logging.info("\nUser created!\n")
        DBConn.closeconnection(self,conn)
#Signin into user account
    def login(self):
        query = ("select * from page;")
        conn=DBConn.getconnection(self)
        cursor = conn.cursor()
        login = raw_input("Enter login name: ")
        password = raw_input("Enter password: ")
        output=cursor.execute(query)
        output=cursor.fetchall()
        # check if user exists and login matches password
        if login in users and users[login] == password:
            logging.info("\nLogin successful!\n")
        else:
            logging.warn("\nUser already present!\n")
        sql = ("select * from loginpage;")
        name = raw_input("Enter person name: ")
        dob = raw_input("Enter dob: ")
        cursor.execute("INSERT INTO loginpage(name,dob) VALUES(%s, %s)",(name,dob))
        c=cursor.execute(sql)
        c=cursor.fetchall()
        logging.info("\nData stored successfully!\n")
        DBConn.closeconnection(self,conn)    
#Here validating the email
    def valid(self,login):
        match = re.match(r'[\w.-]+@[\w.-]+.\w+', login)
        if match != None:
            logging.info("valid login")
        else:
            logging.warn("Invalid login")
            logging.info("Enter your correct login...")
            self.register()
#Here validating the password         
    def validate(self,password):
        match = re.match(r'[A-Za-z0-9@#$%^&+=]{8,}', password)
        if match != None:
            logging.info("valid password")
        else:
            logging.warn("Invalid password")
            logging.info("Enter your correct password...")
            self.register()
#Exit the process           
    def exitLogin(self):         
        logging.info("\nLogout successful!\n")
        sys.exit(0)

