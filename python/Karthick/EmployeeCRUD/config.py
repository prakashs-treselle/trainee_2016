#Database details
host1="localhost"
#dbName"EmpolyDB"
user1="root"
password1="root"

#insertquery="""INSERT INTO Empdetail
               # (Emp_Name,Emp_number,Location,Position) VALUES
               # (%s,%s,%s,%s)""",(name,number,location,position)
selectQuery="select * from Empdetail"

deletequery="Delete from Empdetail where Emp_number='{0}';"
