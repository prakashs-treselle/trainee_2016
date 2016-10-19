import mysql.connector
import logging
import csv

class Number():
    def sort(self,conn):
        n = int(raw_input("Enter the number do you want..."))
        cursor = conn.cursor()
        for z in range(n):
            try:
                number = int(raw_input("enter the number:"))
                cursor.execute("""INSERT INTO num(number) VALUES("%s")""" %(number))
                conn.commit()
            except ValueError:
                logging.warn("enter the correct input...")
            else:
                logging.info("success...")
    def fetchSort(self,cursor): 
        query = ("select * from num;")
        try:
            output = cursor.execute(query)
            output = cursor.fetchall()
            print (output)
            data_list  = []
            new_list = []
            for x in output:
                data_list.append(x)
            while data_list :
                minimum  = data_list[0]
                for x in data_list :
                    if x > minimum :
                        minimum  = x
                new_list.append(minimum )
                data_list .remove(minimum )
            for res in new_list[0:5]:
                print(res)
                with open('sorted.csv', 'a') as csvfile:
                    csv_writer = csv.writer(csvfile,dialect='excel', delimiter=',', lineterminator='\n')
                    csv_writer.writerow(res)
            print("\nData written into csv")
        except ValueError:
            logging.warn("error:unable to fetch input")
def main():
    conn = mysql.connector.connect(host='localhost', database='sorting', user='root', password='root')
    cursor = conn.cursor()
    s = Number()
    s.sort(conn)
    s.fetchSort(cursor)
    #conn.close()

if __name__ == '__main__':
    main()
   
    

