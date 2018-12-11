package org.ashutosh.javabrains.messenger.Services;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.ashutosh.javabrains.messenger.Database.Database;

import java.util.Iterator;

import java.util.ArrayList;
import java.util.Calendar;

import model.message;


public class messageService {
	Database d=new Database();
	Map<Integer,message> messages=d.getmessages();
	
	public messageService() {
		messages.put(1, new message("Ashutosh",1,"my frst creation",new Date(),"sending"));
		messages.put(2, new message("Ashutosh",2,"my secnd creation",new Date(),"sending"));
		messages.put(3, new message("Ashutosh",3,"my thrd creation",new Date(),"sending"));
	}
	
	public List<message> getAllmessages(){
        return new ArrayList<message>(messages.values());
    }
	
	public message getMessage(int id) {
		if(id<=0) {
			return null;
		}
		return messages.get(id);
	}
	
	public message addMessage(message m) {
		messages.put(m.getId(), m);
		return m;
		
	}
	
	public message updateMessage(message m) {
		if(m.getId()<=0) {
			message m1=new message();
			return m1;
		}
		messages.replace(m.getId(), m);
		
		return m;
	}
	
	public message removeMessage(int id) {
		
		return messages.remove(id);
	}
	
	public List<message> getAllMessageforYear(int year){
		List<message> ls1=new ArrayList<message>();
		Calendar cal=Calendar.getInstance();
		for(message m:messages.values()) {
			cal.setTime(m.getDate());
			if(cal.get(Calendar.YEAR)==year) {
				ls1.add(m);
			}
			
		}
		return ls1;
	}
	
	public List<message> paginatedmessages(int start,int size){
		List<message> ls2=new ArrayList<>(messages.values());
		if(start+size>ls2.size()) {return new ArrayList<message>();}
		
		return ls2.subList(start, start+size);
		
	}
}
