from Vehicle import *

#class to define lorry methods
class lorry(Vehicle):
    def lorryexecution():
        ch=0
        speed = 10
        maxspeed=150
        f=False
        while(ch !=4):
            try:
                
                
                print("Provide me an instruction to drive ")
                ch=int(input("\n\t\t 1.To start 2.To increase the  speed 3.To turn 4.To stop the lorry "))
                if(ch==1 and f==False):
                    v=Vehicle("lorry")
                    print("close the doors !!! wear your seat belts")
                    print("lorry has starte at the speed of ",speed)
                    f=True
                elif(ch == 2 ):
                    speed=speed+20
                    if(speed<=maxspeed):
                        print("Now the lorry is running at the speed of ",speed)
 
                    else:
                        print("Running at the Maximum speed" )
                        speed=speed-20
                        continue
                elif(ch==3 and speed<=maxspeed):
                    speed=speed-30
                    if(speed<10):
                        print ("Running at initial speed")
                    else:
                        v.turn("lorry")
                        print("Now the Speed is ",speed )
                        speed=speed+10
                        print("turn completed now the bike is running at the speed",speed)
                elif(ch==4):
                    v=Vehicle("Lorry")
                    v.stop("lorry")
            except ValueError:
                print("Enter the valid choice")
                continue

        
            
