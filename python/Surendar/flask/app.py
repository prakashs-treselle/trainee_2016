from flask import Flask, request, jsonify
from config import *
from connection import *
app = Flask(__name__)
db = Connection()

@app.route('/studDetail',methods = ['GET'])
def studDetail():
    sno = request.args.get('sno')
    name = request.args.get('name')
    maths = request.args.get('maths')
    physics = request.args.get('physics')
    chemistry = request.args.get('chemistry')
    data = {"sno":sno,"name":name,"maths":maths,"physics":physics,"chemistry":chemistry}
    #print(data)
    studno = data.get('sno')
    studnm = data.get('name')
    conn = db.getConn()
    cursor=conn.cursor()
    cursor.execute("select * from stut where sno='%s' and name='%s'",(studno,studnm))
    output=cursor.fetchall()
    for row in output:
        newdata={'sno':row[0],'name':row[1],'maths':row[2],'physics':row[3],'chemistry':row[4]}
        maths=row[2]
        physics=row[3]
        chemistry=row[4]
    #return jsonify(newdata)
    
    for key,value in data.items():
        if data["maths"]!=None:
            math=data.get("maths")
            maths=math
        if data["physics"]!=None:
            phys=data.get("physics")
            physics=phys
        if data["chemistry"]!=None:
            chem=data.get("chemistry")
            chemistry=chem
    expectdata={'sno':studno,'name':studnm,'maths':maths,'physics':physics,'chemistry':chemistry}
    return jsonify({"DBdata":newdata,"Expectdata":expectdata})    
    
if __name__ == "__main__":
    app.run(port=2000)
