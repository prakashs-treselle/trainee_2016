""" This class is used to get user input and send mail to the required user and trackking the user for report""" 

import smtplib
import mysql.connector
import re
import sys
import logging
import datetime
import time

from dbcon import *
from config import *
from smtplib import SMTPException
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
global status
global flag

logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

class EmailUtils(connection):
   
    
    def userDetails(self):
        em=EmailUtils()
        #getting input from user for selecting number of user
        n=int(input("Enter the no of user"))
        for i in range(0,n):
            #geting name from user
            name=input("Enter the Name ")
            #here getting the mailid from config file
            mailid=mailid1
            emailid=input("Enter the receiver Email_ID ")
            self.validateUser(emailid)
            self.userExits(emailid)
            self.insertRecord(name,emailid,mailid1)

#Add the user data in Database
            
    def insertRecord(self,name,emailid,mailid1):
            date = datetime.date.today()
            con=connection.dbconnection(self)
            cursor=con.cursor()
            cursor.execute(insertquery,(name,emailid,date))
            connection.closeConnection(self,con)
            logging.info("Connection success")
            #calling the sendMail()
            #self.emailtrack(emailid,name,date)
                    
       
#This method will send the Mail to the appropriate user
    def sendMail(self,emailid,name):
        try:
            mail = smtplib.SMTP('smtp.gmail.com', 587)
            mail.starttls()
            msg = MIMEMultipart()
            msg['From'] = mailid1
            msg['To'] = emailid
            msg['Subject'] = ("Welcome to Tech Awareness Context")
            bodytext=("Hi " +name+ "\n\t\t You will Tech Awareness related email for next 10 days.")
            msg.attach(MIMEText(bodytext, 'plain'))
            footer=("\n\nTech: <Python>\n Creator: <Shanmugapriya>")
            msg.attach(MIMEText(footer,'plain'))
            
            logging.info("This block will be executed")
            #login and sending mail to the user
            text = msg.as_string()
            mail.login(mailid1,pswd)
            mail.sendmail(mailid1,emailid,text)
            flag=1
            logging.info("Message send successfully!")
            status='sent'
        except SMTPException:
             logger.warning("Error... mail will not sent")
             status='Notsent'
             #self.emailtrack(name,emailid,date,status)
             logger.warning("Error")
             
        return status    
         

#Mailid Validation
    def validateUser(self,emailid):
        match = re.match(r'[\w.-]+@[\w.-]+.\w+', emailid)
        if match:
            print ("valid email :", match.group())
        else:
            logging.warning('Invalid Email_id=%s',emailid )
            print ("not valid:Give the correct Email_ID\n\n")
            self.mailProcess()
            #self.main()



    def userExits(self,emailid):
        con=connection.dbconnection(self)  
        cursor=con.cursor()
        cursor.execute("select * from emailbox where emailid='{0}';".format(emailid))
        output=cursor.fetchall()
        
        if output:
            logging.info("user exist")
            self.userDetails()
        else:
            logging.info("new user")
        connection.closeConnection(self,con)

#tracking the details of emailbox and stored it in trackertable
    def emailtrack(self):
        dic={}
        con=connection.dbconnection(self)  
        cursor=con.cursor()
        cursor.execute(tracker)
        result=cursor.fetchall()
       
        print(result)
        for (name,emailid,date) in result:
            row="{},{},{}".format(name,emailid,date)
            dic=row.split(",")
            name = dic[0]
            emailid = dic[1]
            localtime   = time.localtime()
            send_date  = time.strftime("%x", localtime)
            send_time  = time.strftime("%H:%M", localtime)
            #getting status from passmail method and return the status
            status=self.sendMail(emailid,name)
            cursor.execute(trackquery,(name,emailid,send_date,send_time,status))  
            con.commit()
            logging.info("Record saved in trackertable")
        connection.closeConnection(self,con)
