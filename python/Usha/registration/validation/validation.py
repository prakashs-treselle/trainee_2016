from registration.userdetails import *
import re
#validation for email

class Validate():
    def validatemail(self, email):
        userinfo = User()
        match = re.match(r'[\w.-]+@[\w.-]+.\w+', email)
        while match != None:
            logging.info("valid mail")
            break
        else:
            logging.warn("Not valid mail")
            print ("Enter the valid email")
            userinfo.userdetail()
            

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
