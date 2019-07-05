package com.ts.dto;

public class Trainer {
  private String tnrId;
  private String tnrName;
  private String tnrEmail;
  private String tnrPassword;
public Trainer() {
	super();
	
}
public Trainer(String tnrId, String tnrName, String tnrEmail, String tnrPassword) {
	super();
	this.tnrId = tnrId;
	this.tnrName = tnrName;
	this.tnrEmail = tnrEmail;
	this.tnrPassword = tnrPassword;
}
public String getTnrId() {
	return tnrId;
}
public void setTnrId(String tnrId) {
	this.tnrId = tnrId;
}
public String getTnrName() {
	return tnrName;
}
public void setTnrName(String tnrName) {
	this.tnrName = tnrName;
}
public String getTnrEmail() {
	return tnrEmail;
}
public void setTnrEmail(String tnrEmail) {
	this.tnrEmail = tnrEmail;
}
public String getTnrPassword() {
	return tnrPassword;
}
public void setTnrPassword(String tnrPassword) {
	this.tnrPassword = tnrPassword;
}
@Override
public String toString() {
	return "Trainer [tnrId=" + tnrId + ", tnrName=" + tnrName + ", tnrEmail=" + tnrEmail + ", tnrPassword="
			+ tnrPassword + "]";
}


  
}
