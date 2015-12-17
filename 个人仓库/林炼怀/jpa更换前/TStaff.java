package com.archive.jpa;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

//工作人员
@Entity
@Table(catalog="DBArchive") 
public class TStaff implements Serializable{
	/**
	 * 工作人员
	 * TStaff
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	private String s_username;
	private String s_number;
	private String s_password;       
	private String s_realname;
	private String s_phone;
	private String s_grant;
	private String s_unitCode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getS_username() {
		return s_username;
	}
	public void setS_username(String s_username) {
		this.s_username = s_username;
	}
	public String getS_number() {
		return s_number;
	}
	public void setS_number(String s_number) {
		this.s_number = s_number;
	}
	public String getS_password() {
		return s_password;
	}
	public void setS_password(String s_password) {
		this.s_password = s_password;
	}
	public String getS_realname() {
		return s_realname;
	}
	public void setS_realname(String s_realname) {
		this.s_realname = s_realname;
	}
	public String getS_phone() {
		return s_phone;
	}
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	public String getS_grant() {
		return s_grant;
	}
	public void setS_grant(String s_grant) {
		this.s_grant = s_grant;
	}
	public String getS_unitCode() {
		return s_unitCode;
	}
	public void setS_unitCode(String s_unitCode) {
		this.s_unitCode = s_unitCode;
	}

	
}


