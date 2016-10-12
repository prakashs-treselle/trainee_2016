//pojo class

import java.io.Serializable;

public class BookDetails 
{
	private String bookid;
	private String bookname;
	private String author;
	private String publisher;
	private String stock;

	public BookDetails()
	{
	bookid="";
	bookname="";
	author="";
	publisher="";
	stock = "";
	}
	
	public BookDetails(String bookid, String bookname, String author, String publisher, String stock)
	{
	 this.bookid=bookid;
	 this.bookname=bookname;
	 this.author=author;
	 this.publisher=publisher;
	 this.stock=stock;
	 }

	public String getBookId()
	{
	return bookid;
	}
	public String getBookName()
	{
	return bookname;
	}
	public String getAuthor()
	{
	return author;
	}
	public String getPublisher()
	{
	return publisher;
	}
	public String getStock()
	{
	return stock;
	}
	public void setBookId(String id)
	{
	this.bookid = id;
	}
	public void setBookName(String name)
	{
	this.bookname= name;
	}
	public void setAuthor(String author)
	{
	this.author=author;
	}
	public void setPublisher(String publisher)
	{
	this.publisher= publisher;
	}
	public void setStock(String stock)
	{
	this.stock= stock;
	}
}




