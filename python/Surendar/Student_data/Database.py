#STUDENT DETAILS
import csv
import sys
import os
import os.path
dict1 = {}
global total
global average
#Insert the students_data 
def insert_data():
    student = int(input("Please enter nos of student..."))
    for i in range(0,student):
        rollno =int(input("Enter the rollno..."))
        validate(rollno)
        name=raw_input("Enter the name...")
        maths = int(input("Enter the maths mark..."))
        science = int(input("Enter the science mark..."))
        social = int(input("Enter the social mark..."))
        total = int(maths)+int(science)+int(social)     #Calculation
        average = (total)/3
        print "Total...",total
        print "Average...",average
        dict1[i] = {'Rollno':rollno,'Name':name,'Maths':maths,'Science':science,'Social':social,'Total':total,'Average':average}
        #Check the file	
        if (os.path.isfile("Student.csv")):
            with open("Student.csv", 'a') as csvfile:
                fieldnames = ['Rollno','Name','Maths','Science','Social','Total','Average']
                writer = csv.DictWriter(csvfile,lineterminator='\n',fieldnames=fieldnames)
                writer.writerow({'Rollno':rollno,'Name':name,'Maths':maths,'Science':science,'Social':social,'Total':total,'Average':average})	    	
        else:
            with open("Student.csv", 'a') as csvfile:
                fieldnames = ['Rollno','Name','Maths','Science','Social','Total','Average']
                writer = csv.DictWriter(csvfile,lineterminator='\n',fieldnames=fieldnames)
                writer.writeheader()
                writer.writerow({'Rollno':rollno,'Name':name,'Maths':maths,'Science':science,'Social':social,'Total':total,'Average':average}) 
           
        if average<=35:
            out1 = open('fail.txt','a')
            print "you are fail..."
            out1.write(str(rollno))
            out1.write("\t")
            out1.write((name))
            out1.write("\t")
            out1.write(str(maths))
            out1.write("\t")
            out1.write(str(science))
            out1.write("\t")
            out1.write(str(social))
            out1.write("\t")
            out1.write(str(total))
            out1.write("\t")
            out1.write(str(average))
            out1.write("\n")
            out1.close()
        elif average>=35 and average<=80:
            out2 = open('avg.txt','a')
            print "you are average..."
            out2.write(str(rollno))
            out2.write("\t")
            out2.write((name))
            out2.write("\t")
            out2.write(str(maths))
            out2.write("\t")
            out2.write(str(science))
            out2.write("\t")
            out2.write(str(social))
            out2.write("\t")
            out2.write(str(total))
            out2.write("\t")
            out2.write(str(average))
            out2.write("\n")
            out2.close()
        else:
            out3 = open('pass.txt','a')
            print "you are pass..."
            out3.write(str(rollno))
            out3.write("\t")
            out3.write((name))
            out3.write("\t")
            out3.write(str(maths))
            out3.write("\t")
            out3.write(str(science))
            out3.write("\t")
            out3.write(str(social))
            out3.write("\t")
            out3.write(str(total))
            out3.write("\t")
            out3.write(str(average))
            out3.write("\n")
            out3.close()
    print("Update is completed")
#Get the Details		
def get_data():
    with open('Student.csv') as csvfile ,open('Details.txt', 'a') as csvfile1:
        reader = csv.DictReader(csvfile)
        for row in reader:
            print(row['Rollno'], row['Name'],row['Maths'], row['Science'], row['Social'], row['Total'], row['Average']) 
            csvfile1.write(str(row))
            csvfile1.write('\n')

#Search the Data		
def search_data():
    num = raw_input("Enter the Rollno...")
    with open('Student.csv', 'rb') as csvfile:
        reader = csv.DictReader(csvfile)
        rows=[row for row in reader if row['Rollno']==num]
        for row in rows:
            print row

#validating the user input
def validate(rollno):
    with open('Student.csv', 'r') as csvfile:
        reader = csv.reader(csvfile,delimiter=',')
        for row in reader:
            for field in row:
                if field == rollno:
                    print "User presents already"
                    main()

#Exit the data
def exit_data():
    print("**Thank u**")
    sys.exit(0)

#Get choice from the user
def main():
    print("STUDENT DETAILS\n")
    m = int(raw_input("\t Choose your option \n Press 0 to start\tPress 1 to stop\n"))
    while m == 0:
            choice = int(input("Enter the choice\n1.Insert 2.Get 3.Search 4.Exit\n"))
            if(choice==1):
                print("***Insert data***")
                insert_data()
            elif(choice==2):
                print("***Get data***")
                get_data()
            elif(choice==3):
                print("***Search data***")
                search_data()
            elif(choice==4):
                exit_data()
            else:
                print("Select the correct choice")

#Execution process
if __name__ == "__main__":
    main()
    

