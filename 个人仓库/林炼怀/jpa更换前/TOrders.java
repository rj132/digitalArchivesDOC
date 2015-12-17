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

//订单
@Entity
@Table(catalog="DBArchive")
public class TOrders implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	//记录号
	private String orderNo;	//订单编号
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TUsers tTUsers_id;	//用户编号
	private Date orderTime;	//订单时间
	private String objects;	//订购目的
	private String payStatus;	//付费状态
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public TUsers gettTUsers_id() {
		return tTUsers_id;
	}
	public void settTUsers_id(TUsers tTUsers_id) {
		this.tTUsers_id = tTUsers_id;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getObjects() {
		return objects;
	}
	public void setObjects(String objects) {
		this.objects = objects;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
