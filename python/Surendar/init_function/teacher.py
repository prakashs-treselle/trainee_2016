import csv
import mysql.connector

class Person:         #Represents any school member.
    def __init__(self, name, age):
        self.name = name
        self.age = age
    def __iter__(self):
        return self

class Teacher(Person): #Represents a teacher.
    def __init__(self, name, age, salary):
        Person.__iter__(self, name, age)
        self.salary = salary
    def __iter__(self):
        return self

  
def main():
    #try:
        num = int(input("Enter nos of teacher:"))
        for i in range(num):
            name = raw_input("Enter your Name:")
            age = raw_input("Enter your Age: ")
            salary = raw_input("Enter your Salary:")
            school = Teacher(name, age, salary)
            print ('Name',school.getName())
            print ('Age',school.getAge())
            print ('Salary',school.getSalary())
            conn = mysql.connector.connect(host='localhost', database='teacher', user='root', password='root')
            cursor = conn.cursor()
            cursor.execute("INSERT INTO teach(name,age,salary) VALUES(%s, %s, %s)" , (name,age,salary))
            conn.commit()
            sql = "select * from teach;"
            cursor.execute(sql)
        for x,y in itertools.izip(["Name","Age","Salary"],[name,age,salary]):
            print x,y
        with open("Teacher.csv", "w") as csvfile:
            csv_writer = csv.writer(csvfile,delimiter=',',lineterminator='\n')
            csv_writer.writerow([i[0] for i in cursor.description]) # write headers
            csv_writer.writerows(cursor)
            conn.close()
if __name__ == '__main__':
    main()

