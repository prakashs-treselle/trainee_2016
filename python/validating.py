'''Here calculating given marks for particular user id and name
will provided by the server
'''
import sys
import re
sys.path.append('C:\Users\Karthik\Desktop\resmodify\DButilities')
from empCRUD import *
from app import *

def searchData(stud):
    #return jsonify(stud)
    #tam=None
    #eng=None
    #math=None
    sid=stud.get("studid")
    name=stud.get("studentname")
    conn =db.dbconnect()
    cursor=conn.cursor()
    cursor.execute(searchquery.format(sid,name))
    output=cursor.fetchall()
    for row in output:
        defaultDict={
             'studid':row[0],'studentname':row[1],'Tamil':row[2],'English':row[3],'maths':row[4],'Total':row[5]
               }
        tam=row[2]
        eng=row[3]
        math=row[4]
    conn.close()
        
    for key,value in stud.items():
         if stud["Tamil"]!=None:
             tamil1=stud.get("Tamil")
             tam=tamil1
         if stud["English"]!=None:
             eng1=stud.get("English")
             eng=eng1
         if stud["maths"]!=None:
             maths1=stud.get("maths")
             math=maths1
    val=validatt(tam,eng,math)
    Totalsum=totcalc(tam,eng,math)
    expectDict={
             'studid':sid,'studentname':name,'Tamil':tam,'English':eng,'maths':math,'Total':Totalsum
               }
    return jsonify({"default":defaultDict,"expecded":expectDict})

#Here calculating the total marks 
def totcalc(tam,eng,math):
    total=int(tam)+int(eng)+int(math)
    return total


def validatt(tam,eng,math):

    tamil1=isDigit(tam)
    eng1=isDigit1(eng)
    math1=isDigit2(math)
    if tamil1==1 and eng1==1 and math1==1:
        return insertDetail(tam,eng,math)
    elif stuID!=1 and stuName!=1 and math1!=1:
        return nonfoun()
    

def isDigit(tam):
    messages={
          'status': 'invalid',
          'message': 'tamil mark is not  digit'
                }
    if  re.match("^([0-9])*$",tam):
        status=1
        return status
    else:
        return jsonify(messages)
   

def isDigit1(eng):
    messages={
          'status': 'invalid',
          'message': 'mark2 is not  digit'
                }
    if  re.match("^([0-9])*$",eng):
        status=1
        return status
    else:
        return jsonify(messages)

def isDigit2(math):
    messages={
          'status': 'invalid',
          'message': 'mark2 is not  digit'
                }
    if  re.match("^([0-9])*$",math):
        status=1
        return status
    else:
        return jsonify(messages)
    
def nonfoun(error=None):
    message={
            'status': '404',
            'message': 'NOT EXIST'
            }
    return jsonify(message)
                
