package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement
public class message {
	private String author;
	//particular id numbr related to msg. although it is taking space. we will remove it later on.
	private int id;
	//message content.
	private String message;
	//date of creation
	private Date date;
	//rxn on msg. originally it is null.
	private String status;
	//empty constructors. think of it if the constructor is needed??
	private Map<Integer,comments> commentsmap;
	
	
	public message() {
	}
	
	public message(String author,int id,String message,Date date,String status) {
		this.author=author;
		this.id=id;
		this.message=message;
		this.date=date;
		this.status=status;
		this.commentsmap=new HashMap<>();
	}
	
	//getters and setters method
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date doc) {
		this.date = doc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public Map<Integer, comments> getCommentsmap() {
		return commentsmap;
	}
	public void setCommentsmap(Map<Integer, comments> commentsmap) {
		this.commentsmap = commentsmap;
	}
	
}
