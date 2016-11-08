#DB utilities
ht = 'localhost'
db = 'users'
usr = 'root'
psw  = 'usha'

#MySQL queries
insert = "INSERT INTO register(name,email,password) VALUES(%s, %s, %s)"

userdetails = "INSERT INTO personaldetail(username,fav,dob) VALUES(%s,%s,%s)"

formattypedate = ['%y:%m:%d', '%y/%m/%d', '%y-%m-%d','%b %d,%Y', '%d/%m/%Y']

formattypetime = ['%Y-%m-%d %H:%M:%S %Z', '%H:%M:%S %Y:%m:%d %Z']
