package com.vikash.rest.messanger.service;

import java.util.List;

import com.vikash.rest.messanger.database.DatabaseClass;
import com.vikash.rest.messanger.modal.Message;

public class MessageServiceImpl implements MessageService {
	
	/* (non-Javadoc)
	 * @see com.vikash.rest.messanger.service.MessageService#getMessages()
	 */
	
	@Override
	public List<Message> getMessages(){		
		return DatabaseClass.getAllmessages();
	}

	@Override
	public Message getMessage(long msgId) {
		return DatabaseClass.getMessage(msgId);
	}
	

}
