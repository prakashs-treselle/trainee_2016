from mysql.connector import connection
from config import *
def getconnection():
        con = connection.MySQLConnection(user=dbuser, password=dbpassword,
                                 host=dbhost,
                                 database=dbdatabase)
        print("connection created")
        return con
    
    #cr=con.cursor()
    #cr.execute("create table candidatedict(ID int,name varchar(30),email varchar(20),skill varchar(10),salary float, salaryexp float);")
    #cr.execute("CREATE TABLE Persons(PersonID int,LastName varchar(255),FirstName varchar(),Address varchar(255),City varchar(255));")
    
