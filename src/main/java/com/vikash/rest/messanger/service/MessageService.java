package com.vikash.rest.messanger.service;

import java.util.List;

import com.vikash.rest.messanger.modal.Message;

public interface MessageService {

	List<Message> getMessages();
	Message getMessage(long msgId);
	long createMessage(Message msg);

}