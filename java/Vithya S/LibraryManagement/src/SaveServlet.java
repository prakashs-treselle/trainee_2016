//Servlet program
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;                          
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SaveServlet")  
public class SaveServlet extends HttpServlet 
{  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{  
	
	try
	{
        response.setContentType("text/html");                //write the text in html format
        PrintWriter out=response.getWriter();  
          
        String bookid  = request.getParameter("bookid");     //get all the values from book records1
        String bookname = request.getParameter("bookname");
        String author= request.getParameter("author");
        String publisher=request.getParameter("publisher");
        String stock=request.getParameter("stock");
   
        BookDetails bd=new BookDetails();                   //set the values by user input
		bd.setBookId(bookid);
		bd.setBookName(bookname);
		bd.setAuthor(author);
		bd.setPublisher(publisher);
		bd.setStock(stock);
		BookRecords1 br=new BookRecords1();		
        int status=br.save(bd);  
        if(status>0)
		{  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }
		else
		{  
            out.println("Sorry! unable to save record");  
        }  
        out.close(); 		
    }
	catch(Exception e)
	    {
          e.printStackTrace();
		}
	 
    }  
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	 {
	 }
  
}  