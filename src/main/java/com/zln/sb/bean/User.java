package com.zln.sb.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
private String name;
@JsonIgnore//返回值中不显示密码字段
private String pwd;
@JsonProperty("account")//返回值中字段phone指定显示名为account，防止黑客攻击
private String phone;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String name, String pwd, String phone) {
	super();
	this.name = name;
	this.pwd = pwd;
	this.phone = phone;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}





}
