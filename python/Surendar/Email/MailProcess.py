#Getting the valid email from the user and send them welcome mail to that user...
import mysql.connector
import logging
import smtplib
import datetime
import time
import sys
import re
from smtplib import SMTPException
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
from connection import *
from config import *
global status
global date
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)
#This class will insert name and email of the appropriate user
class Mail(Connection):
    def userMail(self):
        num = int(input("Enter as your choice..."))
        for z in range(0,num):
            #geting name from user
            name = raw_input("Enter your name:")
            email = raw_input("Enter your email:")
            print ('Name:',name)
            print ('Email:',email)
            #here getting the mail from config file
            username = UName       #Gmail userName
            password = UPsw        #Gmail password
            self.validate(email)
            self.userExist(email)
            self.insertMail(name,email,UName)

#Add the user data in Database
    def insertMail(self,name,email,UName):
            date = datetime.date.today()
            conn = Connection.getConnection(self)
            cursor = conn.cursor()
            cursor.execute(insert ,(name,email,date))
            Connection.closeConnection(self,conn)
            logging.info("User records are stored successfully")
            #self.trackMail(name,email,UName,date)  

#Send mail to the user
    def sendMail(self,name,email):
        try:
            server = smtplib.SMTP('smtp.gmail.com', 587)
            server.starttls()
            msg = MIMEMultipart()
            msg['From'] = UName
            msg['To'] = email
            msg['Subject'] = ft
            #header = 'To:' + email + '\n' + 'From:' + UName + '\n' + 'Subject:' + ft + '\n'
            #logging.debug(header)
            bodytext=("Hi " + name + "\n" + fc +"\n")
            msg.attach(MIMEText(bodytext, 'plain'))
            footer = ('\n'+'\n'+'\t\n'+"Thanks and Regards,\n"+"Freshersteam. \n"+"Tech = <Python> : "+"Creator = <Surendar>\n")
            msg.attach(MIMEText(footer,'plain'))
            text = msg.as_string()
            server.login(UName,UPsw)                # login detail        
            server.sendmail(UName, email, text)       # send the mail
            logging.info("Email sent to %s at %s" %(name, email))
            logging.info("successfully sent")
            status = 'Sent'
        except SMTPException:
            logging.warn("not successfully sent...")
            status = 'Not sent'
            #self.trackMail(name,email,date,status)
            logging.warn("Error exception is occured...")
        return status 

#Here validating the email
    def validate(self,email):
        match = re.match(r'[\w.-]+@[\w.-]+.\w+', email)
        if match != None:
            logging.info("valid mail...")
        else:
            logging.warn("Not valid mail...")
            print ("Enter the correct email...")
            self.userMail()

#Check the DB whether user already exist or not in database
    def userExist(self,email):
        conn = Connection.getConnection(self) 
        cursor=conn.cursor()
        cursor.execute("select * from admin where email='{0}';".format(email))
        data = cursor.fetchall()
        for row in data:
            print row[0], row[1]
        if data:
            logging.warn("Already user exist...")
            self.userMail()
        else:
            logging.info("New user")
        Connection.closeConnection(self,conn)

#Using track whether the mail is sent to the particular user
    def trackMail(self):
        dict1 = {}
        conn = Connection.getConnection(self)
        cursor = conn.cursor()
        cursor.execute(track)
        output=cursor.fetchall()
        print(output)
        for (name,email,date) in output:
            row="{},{},{}".format(name,email,date)
            dict1=row.split(",")
            name=dict1[0]
            email=dict1[1]
            localtime = time.localtime()
            sent_date = time.strftime("%x", localtime)
            sent_time = time.strftime("%H:%M", localtime)
            status = self.sendMail(name,email) 
            cursor.execute("insert into emailtrack values(%s,%s,%s,%s,%s)",(name,email,sent_date,sent_time,status))
            conn.commit()
            logging.info("Record added successfully...")
        Connection.closeConnection(self,conn)

#Exit the mail
    def exitMail(self):         
        print("**Thank u**")
        sys.exit(0)

