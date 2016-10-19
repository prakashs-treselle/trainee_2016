#Get choice from the user
import sys
import re
from registration.userdetails import *
from login.login import *
global choice

class Operation():
     def main(self):
          logging.info("Startup class: WELCOME TO REGISTRATION")
          user = User()
          logindetail = Login()
          print ("REGISTRATION\n")
          while True:
               try:
                    count = int(input("Do you want to register 1.Yes 2.Exit \n"))
                    if count == 1:
                         break
                    elif count == 2:
                         sys.exit(0)
                    else:
                         logging.warn("Give valid input")
               except ValueError:
                    logging.warn("invalid option, String not allowed...")

          while count==1:
               try:
                    choose = int(input("\nEnter the choice \n1.REGISTER \n2.LOGIN \n3.DATE FORMAT \n4.RESET PASSWORD \n5.VIEWALL \n6.SEARCH \n7.EXIT\n"))
                    choice = choose
                    if choice==1 :
                         logging.info("***Insert data***")
                         user.userdetail()
                    elif choice==2 :
                         logindetail.login()
                    elif choice==3 :
                         logindetail.retrieve()
                    elif choice==4 :
                         logindetail.passwordreset()
                    elif choice==5 :
                         logindetail.viewall()
                    elif choice==6 :
                         logindetail.search()   
                    elif choice==7 :
                         sys.exit(0)
                    else:
                         logging.warn("choose correct option")
               except ValueError:
                    logging.warn("invalid option")
               
#execution begins here
if __name__ == '__main__':
    operation = Operation()
    operation.main()
