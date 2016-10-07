#common class to all vehicle classes to define common funtionalities of vehicles
class Vehicle:
    name=""
    def __init__(self,name):
        self.name=name
        print("Yo have selected ",name)
        print( name," is ready to go ")
    def turn(self,name):
        print("Now the",self. name," is turning!!! and decreasing the speed ")
        print("Bing Bong....!!!!!!!!!!!")

    def stop(self,name):
        print(self.name," stoped ")
        print("Open the door and step down carfully")
        print("Thank you")
    
