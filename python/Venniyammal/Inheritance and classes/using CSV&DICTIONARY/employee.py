import csv
import time
import datetime
import os
dict1={}

if os.path.isfile('emp10.csv'):
    with open('emp10.csv', 'a+') as csvfile:
        fieldnames = ['Id','Name','Designation','Doj']
        writer = csv.DictWriter(csvfile,dialect='excel',delimiter=' ',lineterminator='\n', fieldnames=fieldnames)
        #writer.writeheader()
        num_of_employee = int(input("Enter no of employees"))
        print ("No of employees is",num_of_employee)
        for i in range(num_of_employee):
            empid = int(input("Enter the Id:"))
            empname = str(input(" Enter the name:"))
            empdes = str(input(" Enter the designation:"))
            empdoj = datetime.date.today()
        dict1 = {'Id':empid,'Name':empname,'Designation':empdes,'Doj':empdoj}
        writer.writerow(dict1)
else:
    with open('emp10.csv', 'a+') as csvfile1:
        fieldnames = ['Id','Name','Designation','Doj']
        writer = csv.DictWriter(csvfile1,dialect='excel',delimiter=' ',lineterminator='\n', fieldnames=fieldnames)
        writer.writeheader()
        num_of_employee = int(input("Enter no of employees"))
        print ("No of employees is",num_of_employee)
        for i in range(num_of_employee):
            empid = int(input("Enter the Id:"))
            empname = str(input(" Enter the name:"))
            empdes = str(input(" Enter the designation:"))
            empdoj = datetime.date.today()
        dict1 = {'Id':empid,'Name':empname,'Designation':empdes,'Doj':empdoj}
        writer.writerow(dict1)
        csvfile1.close
def increment():    
loop = 1
choice = 0
while loop == 1:
    print("select people:")
    print(" ")
    print("1) Manager")
    print("2) HR")
    print("3) workers")
    print("4) Quit")
    print(" ")
    choice = int(input("Choose your option: "))
    if choice == 1:
        inc=int(input("Enter increment %:"))
        before=int(input("enter before salary:"))
        inc=before+inc
        print("now salary:",inc)
    elif choice == 2:
        inc1=int(input("Enter increment %:"))
        before=int(input("enter before salary:"))
        inc1=before+inc1
        print("now salary:",inc1)
    elif choice == 3:
        inc2=int(input("Enter increment %:"))
        before=int(input("enter before salary:"))
        inc2=before+inc2
        print("now salary:",inc2)
    elif choice == 4:
        loop=0
        #calculation of month salary
def workingday():        
month_date=22
sal=int(input("enter one day salary:"))
print("one day salary:",sal)
lev=int(input("enter nomber of leave days:"))
days=month_date-lev
print("total days:",days)
salary=days*sal
print("your salary:",salary)
#SEARCH ROW
with open('emp10.csv', mode='r') as f:
    reader = csv.reader(f)
    usersearch = input("Enter the searching Id :")
    for num,row in enumerate(reader):
        if usersearch in row[0]:
            print(row)


if __name__ = "__main__":
    increment()
    workingday()
    search()
    exit()
        
