package com.vikash.rest.messanger.service;

import java.util.ArrayList;
import java.util.List;

import com.vikash.rest.messanger.modal.Message;

public class MessageServiceImpl implements MessageService {
	
	/* (non-Javadoc)
	 * @see com.vikash.rest.messanger.service.MessageService#getMessages()
	 */
	@Override
	public List<Message> getMessages(){
		Message m1 = new Message(101, "First message", "author1");
		Message m2 = new Message(102, "Second message", "author2");
		Message m3 = new Message(103, "Third message", "author3");
		Message m4 = new Message(104, "Fourth message", "author4");
		Message m5 = new Message(105, "Fifth message", "author5");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		return list;
	}

}
