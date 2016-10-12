from Emailprocess import *
from Tracker import *

class Driver(EmailUtils,TrackDetails):
    
        print("\t \t SEND MAIL PROCESS \t ")

        def main(self):
            #getting input from user
            reg=int(input( "Is the user wants to Register \n 1. YES\n 2.NO\n"))
            
            while reg==1:

                print("\t1.Add User  \t2.Group email \t3.sent details  \t4.Failed to sent  \t5.exit\n ")
                #getting choice from user 
                ch=int(input("Enter Your Choice"))
                if(ch==1):
                        em.userDetails() #here calling the userDetails
                elif(ch==2):
                        em.emailtrack()
                elif(ch==3):
                    em.sentMail()
                elif(ch==4):
                    em.failedToSent()       
                elif(ch==5):
                    print("**Stop process**")
                    sys.exit(0)
                else:
                    logging.warning("enter the correct choice")
            
        
            
#program execution starts here
if __name__=='__main__':
    em=Driver()
    em.main()
    em=TrackDetails

















    
