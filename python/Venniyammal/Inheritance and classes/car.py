from Vehicle import *

#class to define car methods
class car(Vehicle):
    def carexecution():
        ch=0
        speed = 10
        maxspeed=150
        f=False
        while(ch !=4):
            try:
                print("Provide me an instruction to drive ")
                ch=int(input("\n\t\t 1.To start 2.To increase the  speed 3.To turn 4.To stop the car "))
                if(ch==1 and f==False):
                    v=Vehicle("car")
                    print("close the doors !!! wear your seat belts")
                    print("car has starte at the speed of ",speed)
                    f=True
                elif(ch == 2 ):
                    speed=speed+20
                    if(speed<=maxspeed):
                        print("Now the car is running at the speed of ",speed)
 
                    else:
                        print("Running at the Maximum speed" )
                        speed=speed-20
                        continue
                elif(ch==3 and speed<=maxspeed):
                    speed=speed-30
                    if(speed<10):
                        print ("Running at initial speed")
                    else:
                        v.turn("car")
                        print("Now the Speed is ",speed )
                        speed=speed+10
                        print("turn completed now the bike is running at the speed",speed)
                elif(ch==4):
                    v=Vehicle("car")
                    v.stop("car")
            except ValueError:
                print("Enter the valid choice")
                continue

        
            
