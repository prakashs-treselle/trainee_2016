#Student Program
from flask import Flask
from flask import Flask, redirect, url_for, request,render_template,jsonify
from connection import *
from config import *
import sys
from std import *
app = Flask(__name__)

@app.route('/details',methods=['GET'])
def details():
    idd=request.args.get('id')
    name=request.args.get('name')
    tamil=request.args.get('tamil')
    english=request.args.get('english')
    maths=request.args.get('maths')
    result={'id1':idd,
            'name1':name,
            'tamil1':tamil,
            'english1':english,
            'maths1':maths}
    return create (result)

if __name__ == '__main__':
   app.run(port=7777,debug = True)
    
