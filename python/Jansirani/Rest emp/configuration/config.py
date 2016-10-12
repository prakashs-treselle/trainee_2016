# Database username,password
hostname='localhost'
databasename='EmpInfo'
user='root'
pwd='root'
# databse queries
selectquery="Select * from Empdetail"
insertquery="""INSERT INTO Empdetail(empid,empname) VALUES (%s,%s)"""
deletequery="DELETE FROM Empdetail WHERE empid = '{0}'"
searchquery="SELECT * FROM Empdetail WHERE empid='{0}'"
