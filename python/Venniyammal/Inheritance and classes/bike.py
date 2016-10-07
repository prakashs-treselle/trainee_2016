from Vehicle import *
from  twowheeler import *
#class to define Bike functions
class bike(Vehicle,twowheeler):
    
    
    def bikeexecution():
        ch=0
        f=False
        speed = 10
        maxspeed=110
        while(ch !=4):
            try:
                print("Provide me an instruction to drive ")
                ch=int(input("\n\t\t 1.To start 2.To increase the  speed 3.To turn 4.To stop the bike "))
                if(ch==1 and f==False):
                    v=Vehicle("bike")
                    f=True
                elif(ch == 2 ):
                    speed=speed+20
                    if(speed<=110):
                         print("Now the bike is running at the speed of ",speed)
 
                    else:
                        print("Running at the Maximum speed" )
                        speed=speed-20
                        continue
                elif(ch==3 and speed<=maxspeed):
                    speed=speed-30
                    if(speed<10):
                        print ("Running at initial speed")
                    else:
                        v.turn("bike")
                        print("Now the Speed is ",speed )
                        speed=speed+10
                        print("turn completed now the bike is running at the speed",speed)
                elif(ch==4):
                    t=twowheeler
                    speed=0
                    t.stop()
                  
            except ValueError:
                print("\n\n***Enter the valid choice***")
                continue
    
        
    
   
   
        
            
