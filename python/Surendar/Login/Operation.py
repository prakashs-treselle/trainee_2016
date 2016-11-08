#Get choice from the user
from Page.Login import *
from User.LoginDetails import *

class Operation(LoginUser,LoginDetails):
    def main(self):
        print ("Registration Process\n")
        status = int(input("Do you want to register? 1.Yes 2.No \n"))
        while status == 1:
            try:
                choice = int(input("Enter the choice 1.Register 2.Login 3.Forgotpass 4.View 5.Exit \n"))
            except NameError:
                logging.warn("invalid option")
            if choice == 1:
                logging.warn("**Register your account**")
                s.register()
            elif choice == 2:
                logging.warn("**Login your account**")
                s.login()
            elif choice == 3:
                logging.warn("**Forgotpass your account**")
                s.forgotPass()
            elif choice == 4:
                logging.warn("**View your account**")
                s.view()
            elif choice == 5:
                logging.warn("**Logout your account**")
                s.exitLogin()
            else:
                logging.info("choose correct option")
#execution begins here
if __name__ == '__main__':
    s = Operation()
    s.main()
