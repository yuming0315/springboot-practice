package com.douzone.mysite.vo;

import java.util.Date;

public class GuestBookVo {
	private Long no;
	private String name;
	private String password;
	private String content;
	private String regDate;
	
	
	@Override
	public String toString() {
		return "GuestBookVo [no=" + no + ", name=" + name + ", password=" + password + ", content=" + content
				+ ", regDate=" + regDate + "]";
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
