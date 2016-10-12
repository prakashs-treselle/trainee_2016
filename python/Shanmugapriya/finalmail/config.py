#MailId and password
mailid1="freshers2016@tresellesystems.com"
pswd="fresh@2016"



#Database details
ht="localhost"
un="root"
pswd1="root"
database='mailrecords'
tracker="select * from emailbox where emailid not in(select emailid from trackertable)"
insertquery="""INSERT INTO emailbox(name,emailid,date) VALUES(%s,%s,%s)"""
trackquery="INSERT INTO trackertable values(%s,%s,%s,%s,%s)"


#Message status

sent="select * from trackertable where status='sent'"
fail="select * from trackertable where status='Notsent'"
