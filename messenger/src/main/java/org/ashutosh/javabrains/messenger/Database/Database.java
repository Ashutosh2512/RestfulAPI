package org.ashutosh.javabrains.messenger.Database;

import java.util.HashMap;
import java.util.Map;

import model.message;
import model.profile;

public class Database {
	static private Map<Integer,message> messages=new HashMap<>();
	static private Map<Integer,profile> profiles=new HashMap<>();
	
	public static Map<Integer,message> getmessages(){
		return Database.messages;
	}
	
	public static Map<Integer,profile> getprofiles(){
		return Database.profiles;
	}
}
