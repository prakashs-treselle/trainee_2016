#Get choice from the user
from MailProcess import *
from TrackProcess import *

class Operation(Mail,Track):
     def main(self):
          print ("Mail Process\n")
          x = int(input("Do you want to register 1.Yes 2.No \n"))
          while x==1:
               try:
                    choice = int(input("Enter the choice 1.GET 2.SEND DETAIL 3.MAIL SEND 4.MAIL NOT SEND 5.EXIT\n"))
               except NameError:
                    logging.warn("invalid option...") 
               if choice==1 :
                    logging.info("***Insert data***")
                    p.userMail()
               elif choice==2 :
                    logging.info("***Group mail***")
                    p.trackMail()
               elif choice==3 :
                    logging.info("***Mail send***")
                    p.mailSent()
               elif choice==4 :
                    logging.info("***Mail not send***")
                    p.mailNotSent()
               elif choice==5 :
                    p.exitMail()
               else:
                   logging.info("choose correct option")

#execution begins here
if __name__ == '__main__':
    p = Operation()
    e = Track()
    p.main()
