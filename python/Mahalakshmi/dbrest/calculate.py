from flask import request,Flask
from flask import jsonify
import sys
import re
from config import *
from dbconnect import *
from viewdb import *

app = Flask(__name__)
db = dbconnect()
def manipulate(dict1):
    custidd=dict1.get("cust_id")
    custnamee=dict1.get("cust_name")
    conn =db.function()
    cursor=conn.cursor()
    cursor.execute("SELECT * FROM saletable WHERE cust_id='{0}' and cust_name='{1}'".format(custidd,custnamee))
    output=cursor.fetchall()
    for row in output:
        consistant_rate={
              'cust_id':row[0],
              'cust_name':row[1],
              'apple':row[2],
              'mango':row[3],
              'guava':row[4],
              'banana':row[5],
              'total':row[6]
               }
        applee=row[2]
        mangoo=row[3]
        guavaa=row[4]
        bananaa=row[5]
    conn.close()
    return checkCondition(dict1,consistant_rate,applee,mangoo,guavaa,bananaa,custidd,custnamee)

def checkCondition(dict1,consistant_rate,applee,mangoo,guavaa,bananaa,custidd,custnamee):
        
    for key,value in dict1.items():
         if dict1["apple"]!=None:
             ap=dict1.get("apple")
             applee=ap
         if dict1["mango"]!=None:
             ma=dict1.get("mango")
             mangoo=ma
         if dict1["guava"]!=None:
             gu=dict1.get("guava")
             guavaa=gu
         if dict1["banana"]!=None:
             ba=dict1.get("banana")
             bananaa=ba
             
    Totalsum=totcalc(applee,mangoo,guavaa,bananaa)
    expect_rate={
             'cust_id':custidd,
             'cust_name':custnamee,
             'apple':applee,
             'mango':mangoo,
             'guava':guavaa,
             'banana':bananaa,
             'total' :Totalsum
               }
    return jsonify({"Default_rate":consistant_rate,"Expected_rate":expect_rate})

def totcalc(applee,mangoo,guavaa,bananaa):
          total=int(applee)+int(mangoo)+int(guavaa)+int(bananaa)
          return total
