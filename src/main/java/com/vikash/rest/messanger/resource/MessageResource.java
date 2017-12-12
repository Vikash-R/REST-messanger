package com.vikash.rest.messanger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vikash.rest.messanger.modal.Message;
import com.vikash.rest.messanger.service.MessageService;
import com.vikash.rest.messanger.service.MessageServiceImpl;

@Path("/messages")
public class MessageResource {
	
	private MessageService mssgService = new MessageServiceImpl();
	
	@GET
	@Produces({MediaType.APPLICATION_XML})
	public List<Message> getMessage(){
		return mssgService.getMessages();
	}
	
	
	@Path("/{mssgId}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessage(@PathParam("mssgId")long mssgid){
		return mssgService.getMessage(mssgid);
	}

}
