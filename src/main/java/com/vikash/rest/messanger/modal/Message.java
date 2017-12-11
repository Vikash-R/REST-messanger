/**
 * 
 */
package com.vikash.rest.messanger.modal;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author vikky
 *
 */
@XmlRootElement
public class Message {
	
	private int id;
	private String mssg;
	private String author;
	private Date createdOn;
	
	public Message() {
		super();
	}

	public Message(int id, String mssg, String author) {
		super();
		this.id = id;
		this.mssg = mssg;
		this.author = author;
		this.createdOn = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMssg() {
		return mssg;
	}

	public void setMssg(String mssg) {
		this.mssg = mssg;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
}
