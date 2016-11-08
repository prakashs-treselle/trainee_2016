#DB utilities
ht = 'localhost'
db = 'user'
usr = 'root'
psw  = 'root'

#sender Information
UName = 'freshers2016@tresellesystems.com'       
UPsw = 'fresh@2016'

#Email contents
ft = 'All Computer Weekly Content'
fc = 'Computer Weekly provides the latest news, analysis and opinion of the stories that matter to UK IT leaders and IT professionals.'

#Message status
sent = "select * from emailtrack where status='Sent'"
notsent = "select * from emailtrack where status='Not sent'"

#MySQL queries
insert = "INSERT INTO admin(name,email,date) VALUES(%s, %s, %s)"
track = "select * from admin where email not in(select email from emailtrack)"
