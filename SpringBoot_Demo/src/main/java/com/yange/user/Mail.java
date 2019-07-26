package com.yange.user;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mail")
public class Mail extends BaseBean{
	private String email;
	private String title;
	private String text;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
