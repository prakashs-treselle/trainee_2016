


from flask import Flask, render_template, request,flash,jsonify,json
from Services.crud import *
from Services.validation import *
from Services import crud
from Services import validation

app = Flask(__name__)


@app.route("/records", methods=["GET"])
def records():
    
    valuedict={}
    valueDict={}
    param= request.args['param']
    data= param.split(",")
    for value in data:
        data2 = value.split(":")
        valuedict = {data2[0]:data2[1]}
        valueDict.update(valuedict)
    values=selectRecords(valueDict)
    return values

if __name__ == '__main__':
   app.run(debug = True, port=9069)
