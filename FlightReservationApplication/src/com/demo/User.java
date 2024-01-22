package com.demo;

public class User {

	private String userName;

	private String passWord;

	private String mobileNo;

	private String emailId;

	public User(String userName, String passWord, String mobileNo, String emailId) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
