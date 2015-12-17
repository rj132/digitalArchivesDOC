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

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//预约借阅单
@Entity
@Table(catalog="DBArchive")
public class TReserve implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	//记录号
	private String reserveNo;	//预约单编号
	private Date reserveTime;	//预约时间
	private String borrowObjects;	//借阅目的
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TUsers tTUsers_id;	//用户编号
	private String audiuStatus;	//审核状态
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TStaff tTStaff_id;	//审核人
	private Date audiuTimes;	//审核时间
	private String processStatus;	//处理状态
	private String borrowNo;	//预约借阅号
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReserveNo() {
		return reserveNo;
	}
	public void setReserveNo(String reserveNo) {
		this.reserveNo = reserveNo;
	}
	public Date getReserveTime() {
		return reserveTime;
	}
	public void setReserveTime(Date reserveTime) {
		this.reserveTime = reserveTime;
	}
	public String getBorrowObjects() {
		return borrowObjects;
	}
	public void setBorrowObjects(String borrowObjects) {
		this.borrowObjects = borrowObjects;
	}
	public TUsers gettTUsers_id() {
		return tTUsers_id;
	}
	public void settTUsers_id(TUsers tTUsers_id) {
		this.tTUsers_id = tTUsers_id;
	}
	public String getAudiuStatus() {
		return audiuStatus;
	}
	public void setAudiuStatus(String audiuStatus) {
		this.audiuStatus = audiuStatus;
	}
	public TStaff gettTStaff_id() {
		return tTStaff_id;
	}
	public void settTStaff_id(TStaff tTStaff_id) {
		this.tTStaff_id = tTStaff_id;
	}
	public Date getAudiuTimes() {
		return audiuTimes;
	}
	public void setAudiuTimes(Date audiuTimes) {
		this.audiuTimes = audiuTimes;
	}
	public String getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public String getBorrowNo() {
		return borrowNo;
	}
	public void setBorrowNo(String borrowNo) {
		this.borrowNo = borrowNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
