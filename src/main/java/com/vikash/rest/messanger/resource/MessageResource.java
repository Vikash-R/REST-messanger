package com.vikash.rest.messanger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vikash.rest.messanger.modal.Message;
import com.vikash.rest.messanger.service.MessageServiceImpl;

@Path("/messages")
public class MessageResource {
	
	@GET
	@Produces({MediaType.APPLICATION_XML})
	public List<Message> getMessage(){
		return new MessageServiceImpl().getMessages();
	}

}
