package com.vikash.rest.messanger.database;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vikash.rest.messanger.modal.Message;
import com.vikash.rest.messanger.modal.Profile;

public class DatabaseClass {

	private static long mssgId=1;
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	static{
		messages.put(new Long(1), new Message(1,"First Message","Author1"));
		profiles.put(new Long(1), new Profile(1, "profile 1", "firstName", "lastName"));
	}
	
	public static List<Message> getAllmessages() {
		return new ArrayList<>(DatabaseClass.messages.values());
	}


	public static Message getMessage(long mssgId) {
		return DatabaseClass.messages.get(mssgId);
	}
	
	public static Message createMeessage(Message msg){
		msg.setId(++mssgId);
		msg.setCreatedOn(new Date());
		messages.put(new Long(msg.getId()), msg);
		return getMessage(new Long(msg.getId()));
	}


	public static Message updateMeessage(Message msg) {
		msg.setCreatedOn(new Date());
		messages.put(new Long(msg.getId()), msg);
		return msg;
	}
	

}
