from car import *
from lorry import *
from bike import *

def main():
    ch=0
    try:
       while( input("Do you want to continue Y to yes N to no")=="y"):
            ch = int (input("\n\t\t Welcome to Treselle Travels \n we have the Following vehicles \n\t1.Car\n\t2.Bike\n\t3.Lorry\n\t\t&***Enter you choice*** "))
            if(ch==1):
                car.carexecution()
            elif(ch==2):
                bike.bikeexecution()
            elif(ch==3):
                lorry.lorryexecution()
    except ValueError:
        print("\n\n***Enter the valid choice***")
           

if __name__ == "__main__":
    main()
            
