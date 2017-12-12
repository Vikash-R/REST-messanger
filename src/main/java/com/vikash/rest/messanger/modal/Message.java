/**
 * 
 */
package com.vikash.rest.messanger.modal;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author vikky
 *
 */
@XmlRootElement

public class Message {
	
	private long id;
	private String mssg;
	private String author;
	private Date createdOn;
	
	public Message() {
		super();
	}

	public Message(long id, String mssg, String author) {
		super();
		this.id = id;
		this.mssg = mssg;
		this.author = author;
		this.createdOn = new Date();
	}

	@XmlElement
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@XmlElement
	public String getMssg() {
		return mssg;
	}

	public void setMssg(String mssg) {
		this.mssg = mssg;
	}

	@XmlElement
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@XmlElement(name="date")
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
}
