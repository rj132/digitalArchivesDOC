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

//资源受访情况
@Entity
@Table(catalog="DBArchive") 
public class TVisited implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	//记录号
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TFiles tTFiles_id;	//预约文件级档案编号
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TMaterial tTMaterial_id; //预约资料档案编号
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TRecordsFile tTRecordsFile_id; //预约案卷文件档案编号
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TMultimedia tTMultimedia_id; //预约多媒体文件档案编号
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TUsers tTUser_id;	//用户编号
	private Date downDate;	//获取时间
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public TFiles gettTFiles_id() {
		return tTFiles_id;
	}
	public void settTFiles_id(TFiles tTFiles_id) {
		this.tTFiles_id = tTFiles_id;
	}
	public TMaterial gettTMaterial_id() {
		return tTMaterial_id;
	}
	public void settTMaterial_id(TMaterial tTMaterial_id) {
		this.tTMaterial_id = tTMaterial_id;
	}
	public TRecordsFile gettTRecordsFile_id() {
		return tTRecordsFile_id;
	}
	public void settTRecordsFile_id(TRecordsFile tTRecordsFile_id) {
		this.tTRecordsFile_id = tTRecordsFile_id;
	}
	public TMultimedia gettTMultimedia_id() {
		return tTMultimedia_id;
	}
	public void settTMultimedia_id(TMultimedia tTMultimedia_id) {
		this.tTMultimedia_id = tTMultimedia_id;
	}
	public TUsers gettTUser_id() {
		return tTUser_id;
	}
	public void settTUser_id(TUsers tTUser_id) {
		this.tTUser_id = tTUser_id;
	}	
	public Date getDownDate() {
		return downDate;
	}
	public void setDownDate(Date downDate) {
		this.downDate = downDate;
	}
	
}
