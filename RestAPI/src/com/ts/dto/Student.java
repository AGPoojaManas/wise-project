package com.ts.dto;

public class Student {
	private String studId;
    private String studName;
    private String email;
    private String password;
	public Student() {
		super();
	}
	public Student(String studId, String studName, String email, String password) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.email = email;
		this.password = password;
	}
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", email=" + email + ", password=" + password
				+ "]";
	}
	
    
}
