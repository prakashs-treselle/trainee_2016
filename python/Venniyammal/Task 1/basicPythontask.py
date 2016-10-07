alist =[]
alist1=[]

# function to get values from user 
def listoperation():
    n = int(input("Enter the number of emp records:"))
    try:
        for x in range (n):
            id = int(input ("Enter emp id: "))
            name =str(input ("Enter emp name: "))
            salary = float(input ("Enter emp salary: "))
            alist.append(id)
            alist.append(name)
            alist.append(salary)
           
    except ValueError:
        print ("you have entered a invalid or incorrect data type ")
    else:
        print(alist)

# Showing the alist items
def showlist():

    for i, val in enumerate(alist):
        print (i,val)

# arithmatic operation
def arithmaticoperation():
    a = int(input("Enter A value :"))
    b = int(input("Enter B value :"))
    try:
        c = a+b
        d = a-b
        e = a*b
        f = a/b
    except ArithmeticError:
    	print ("Divide by zero error")
    else:
        print ("added value ",c)
        print ("subtracted value ",d)
        print ("multiplied value ",e)
        print ("divided value ",f)
        alist1.append(c)
        alist1.append(d)
        alist1.append(e)
        alist1.append(f)
        
tuble =(alist,alist1,)

#adding lists values in to tuple
def tubleoperation():
    print (tuble)
    for i, val in enumerate(tuble):
        print (i,val)

# writing the details of list 
def fileoperation():
    myfile = open("recordfortuple.txt","a+")
    myfile.write(str(tuble[0]))
    myfile.write("\n")
    myfile.close()

    
