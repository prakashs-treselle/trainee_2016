from flask import Flask
from flask import Flask, redirect, url_for, request,render_template,jsonify
from connection import *
from config import *
from student import *
import sys
app = Flask(__name__)

def create(result):
    idd=result.get('id1')
    namee=result.get('name1')
    conn=connection.getcon() 
    cur=conn.cursor()
    cur.execute("select * from student where id='{0}' and name='{1}'".format(idd,namee))
    result1=cur.fetchall()
    for row in result1:
        original_details={'id2':row[0],
                          'name2':row[1],
                          'tamil2':row[2],
                          'english2':row[3],
                          'maths2':row[4]}

        TAMIL=row[2]
        ENGLISH =row[3]
        MATHS=row[4]
    for key,value in result.items():
        if result['tamil1']!=None:
            ta=result.get('tamil1')
            TAMIL=ta
        if result['english1']!=None:
            en=result.get('english1')
            ENGLISH=en
        if result['maths1']!=None:
            ma=result.get('maths1')
            MATHS=ma
    expected_details={'stdid':idd,
            'stdname':namee,
            'tamill':TAMIL,
            'english':ENGLISH,
            'mathss':MATHS}
    return jsonify(original_details,expected_details)
