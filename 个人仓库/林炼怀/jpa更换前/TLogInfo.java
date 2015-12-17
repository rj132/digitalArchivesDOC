package com.archive.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//日志信息
@Entity
@Table(catalog="DBArchive")
public class TLogInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	//记录号
	@ManyToOne(fetch=FetchType.LAZY)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TStaff tTStaff_id;	//用户编号
	private Date loginTime;	//登录时间
	private Date logoutTime;	//退出时间
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public TStaff gettTStaff_id() {
		return tTStaff_id;
	}
	public void settTStaff_id(TStaff tTStaff_id) {
		this.tTStaff_id = tTStaff_id;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public Date getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
