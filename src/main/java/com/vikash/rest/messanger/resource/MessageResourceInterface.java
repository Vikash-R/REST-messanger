package com.vikash.rest.messanger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vikash.rest.messanger.modal.Message;

public interface MessageResourceInterface {

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_PLAIN})
	List<Message> getMessage();

	@Path("/{mssgId: \\d+}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	Message getMessage(@PathParam("mssgId")long mssgid);

	@POST
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	Message createMessage(Message msg);
	
	@PUT
	@Path("/{mssgId: \\d+}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	Message updateMessage(@PathParam("mssgId")long mssgId,Message msg);
	
	@DELETE
	@Path("/{mssgId: \\d+}")
	@Produces({MediaType.APPLICATION_JSON})
	default void deleteMessage(@PathParam("mssgId")long mssgId){
		
	}


}