package com.vikash.rest.messanger.resource;

import java.util.List;

import javax.ws.rs.Path;

import com.vikash.rest.messanger.modal.Message;
import com.vikash.rest.messanger.service.MessageService;
import com.vikash.rest.messanger.service.MessageServiceImpl;

@Path("/messages")
public class MessageResource implements MessageResourceInterface {
	
	private MessageService mssgService = new MessageServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.vikash.rest.messanger.resource.MessageResourceInterface#getMessage()
	 */
	@Override
	public List<Message> getMessage(){
		return mssgService.getMessages();
	}
	
	
	/* (non-Javadoc)
	 * @see com.vikash.rest.messanger.resource.MessageResourceInterface#getMessage(long)
	 */
	@Override
	public Message getMessage(long mssgid){
		return mssgService.getMessage(mssgid);
	}

	/* (non-Javadoc)
	 * @see com.vikash.rest.messanger.resource.MessageResourceInterface#createMessage(com.vikash.rest.messanger.modal.Message)
	 */
	@Override
	public long createMessage(Message msg){
		return mssgService.createMessage(msg);
	}
}
