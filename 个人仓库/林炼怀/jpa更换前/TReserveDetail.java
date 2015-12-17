package com.archive.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//预约借阅详细信息
@Entity
@Table(catalog="DBArchive")
public class TReserveDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	//记录号
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TReserve tTReserve_id;	//预约单号
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public TReserve gettTReserve_id() {
		return tTReserve_id;
	}
	public void settTReserve_id(TReserve tTReserve_id) {
		this.tTReserve_id = tTReserve_id;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
