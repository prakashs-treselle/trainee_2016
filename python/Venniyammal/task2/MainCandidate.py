import Candidate

def main():
    
        ch = int(input("press 1 to post a record press 2 to get record"))
        if ch==1:
            Candidate.validate()
           
        elif ch==2:
            Candidate.readline()
        else:
            print("Thank you!!")
if __name__ == "__main__":
    ch=0
    ch = int (input("Enter your choice \n 1.continue the process \t 2.Exit from the process"))
    while(ch!=2):
        
        if(ch==1):
            main()
            ch = int (input("Enter your choice \n 1.continue the process \t 2.Exit from the process"))
        
