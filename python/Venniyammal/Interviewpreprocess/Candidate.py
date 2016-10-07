import csv
import os
import collections
candidate = []
dicte={}
candidatedict =collections.OrderedDict()
idno=10
def getdetails(id):
    
        
    #n = int(input("Enter the number of candidate records:"))
    n=1
    try:
        name =str(input ("Enter candidate name: "))
        name = name.strip()
        name = name.capitalize()
        skill = str(input ("Enter candidate skill: "))
        skill=skill.strip()
        email =str(input ("Enter candidate email: "))
        email=email.strip()
        candidatedict["id"]=id
        candidatedict["name"]=name
        candidatedict["skill"]=skill
        candidatedict["email"]=email
        candidate.append(candidatedict)
        writefile()
    except ValueError:
        print ("you have entered a invalid or incorrect data type ")
    else:
        
        print("success")
            
def writefile():
    if(os.path.isfile('candidate.csv')==False):
        with open('candidate.csv', 'a+') as f:
            fieldnames= ['id','name','skill','email']   
            key = candidatedict.keys()

            w = csv.DictWriter(f,lineterminator = '\n',fieldnames=fieldnames)
            w.writeheader()
            w.writerow(candidatedict)
               
    elif(os.path.isfile('candidate.csv')==True):
        with open('candidate.csv', 'a+') as f:
            fieldnames= ['id','name','skill','email']   
            key = candidatedict.keys()
            w = csv.DictWriter(f,lineterminator = '\n',fieldnames=fieldnames)
            w.writerow(candidatedict)
        
def readline():
    n =int(input("Enter the id"))
    dicte =[]
    cid1=[]
    val =0
    cid=0
    with open ("candidate.csv", 'r+') as f:
        readcsv =csv.reader(f,delimiter = ',')
        for row in readcsv:
            dicte.append(row)
            val=val+1
        for index, detail in enumerate(dicte):
            if index==0:
                print("Reading the file ......")
            else:
                
                str1= str(dicte[index])
                str2 =str1[2:5]
                cid= int(str2)
                cid1.append(cid)
                if cid==n:
                    print("value is present")
                    print(dicte[index])   
                    myfile = open ("result.txt" , "w")
                    myfile.write(str1)
        if n not in cid1:         
            print("record not found")
            print("available ids are:",cid1)



def validate():
       
    dicte =[]
    cid1 =[]
    val =0
    cid=0
    try:
        id1 = int(input ("Enter candidate id(101-999): "))
     
            
        with open ("candidate.csv", 'r+') as f:
            readcsv =csv.reader(f,delimiter = ',')
            for row in readcsv:
                dicte.append(row)
                val=val+1
            for index, detail in enumerate(dicte):
                if index==0:
                    print("")
                else:
                    str1= str(dicte[index])
                    str2 =str1[2:5]
                    cid= int(str2)
                    cid1.append(cid)
            if id1 in cid1:
               print("\t\t ID already Exist......\n\t\t Try again")
            elif  id1 not in cid1:
                getdetails(id1)
                print("")
                        
    except ValueError:
        print("")
    
                    
