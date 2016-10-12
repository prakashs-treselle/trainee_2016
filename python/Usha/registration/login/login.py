
import logging
import mysql.connector
import re
import datetime
from registration.userdetails import *
from connection.connection import *
from config.config import *

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)
class Login(Connection):
    def login(self):
        logging.info("WELCOME TO LOGIN PAGE")
        email = input("Enter your email")
        password = input("Enter the password")
        conn = Connection.getConnection(self) 
        cursor=conn.cursor()
        cursor.execute("select * from register where email='{0}';".format(email))
        data = cursor.fetchall()
        if data:
            logging.info("successfully login to this website")
            print("PERSONAL DETAILS")
            username = input("Your nick name")
            fav = input("Favourite color")
            dob = input("Enter the date of birth in format of '%Y-%m-%d', '%Y.%m.%d', '%Y/%m/%d'")
            cursor.execute(userdetails, (username,fav,dob))
            conn.commit()
            logging.info("Sucessfully completed")
        else:
            logging.info("Incorrect username or password, Please Register and try to login")
        Connection.closeConnection(self,conn)

    def retrieve(self):
        conn = Connection.getConnection(self) 
        cursor=conn.cursor()
        cursor.execute("select * from personaldetail")
        data = cursor.fetchone()
        while True:
            try:
                option = int(input("Enter the choice to display the date format \n1.DATE  \n2.DATE WITH TIME\n"))
                if option==1:
                    break
                if option==2:
                    break
            except ValueError:
                logging.warn("INVALID INPUT")
        if option==1:
            choose = int(input("Enter the choice \n1.%y:%m:%d \n2.%y/%m/%d \n3.%y-%m-%d \n4.%b %d,%Y \n5.%d/%m/%Y\n"))
            if choose==1 :
                print("AFTER FORMAT: ")
                while data is not None:
                    d = datetime.datetime.strptime(data[2], '%Y-%m-%d').strftime(formattypedate[0])
                    print(data[0], data[1],d)
                    data = cursor.fetchone()   
            elif choose==2 :
                print("AFTER FORMAT: ")
                while data is not None:
                    d = datetime.datetime.strptime(data[2], '%Y-%m-%d').strftime(formattypedate[1])
                    print(data[0], data[1],d)
                    data = cursor.fetchone()
                        
            elif choose==3 :
                print("AFTER FORMAT: ")
                while data is not None:
                    d = datetime.datetime.strptime(data[2], '%Y-%m-%d').strftime(formattypedate[2])
                    print(data[0], data[1],d)
                    data = cursor.fetchone()
            elif choose==4 :
                print("AFTER FORMAT: ")
                while data is not None:
                    d = datetime.datetime.strptime(data[2], '%Y-%m-%d').strftime(formattypedate[3])
                    print(data[0], data[1],d)
                    data = cursor.fetchone()
            elif choose==5 :
                print("AFTER FORMAT: ")
                while data is not None:
                    d = datetime.datetime.strptime(data[2], '%Y-%m-%d').strftime(formattypedate[4])
                    print(data[0], data[1],d)
                    data = cursor.fetchone()         
            else:
                logging.warn("choose correct option")

        if option==2:
            choose = int(input("Enter the choice \n1.'%Y-%m-%d %H:%M:%S %Z' \n2.'%H:%M:%S %Y-%m-%d.%Z'\n"))
            if choose==1 :
                print("AFTER FORMAT: ")
                while data is not None:
                    d = datetime.datetime.strptime(data[2], '%Y-%m-%d').strftime(formattypetime[0])
                    print(data[0], data[1],d)
                    data = cursor.fetchone()   
            elif choose==2 :
                print("AFTER FORMAT: ")
                while data is not None:
                    d = datetime.datetime.strptime(data[2], '%Y-%m-%d').strftime(formattypetime[1])
                    print(data[0], data[1],d)
                    data = cursor.fetchone()   
            else:
                logging.warn("choose correct option")         
                 
        Connection.closeConnection(self,conn)

   
    def passwordreset(self):
        conn = Connection.getConnection(self) 
        cursor=conn.cursor()
        logging.info("RESET PASSWORD")
        email = input("Enter your email")
        resetpassword = input("Enter the password")
        cursor.execute("UPDATE register SET password=%s WHERE email=%s",(resetpassword, email))
        conn.commit()
        logging.info("password changed successfully")
        Connection.closeConnection(self,conn)

    def viewall(self):
        conn = Connection.getConnection(self) 
        cursor=conn.cursor()
        cursor.execute("select * from register")
        result = cursor.fetchall()
        logging.info("REGISTERED USERS")
        for row in result:
            print(row)
        Connection.closeConnection(self,conn)

    def search(self):
        conn = Connection.getConnection(self) 
        cursor=conn.cursor()
        logging.info("SEARCH USERS BY EMAIL ID")
        email = input("Enter your email")
        cursor.execute("select * from register where email='{0}';".format(email))
        result = cursor.fetchall()
        for row in result:
            print("\nUSER RECORD:\n", row)
        Connection.closeConnection(self,conn)
        
   
