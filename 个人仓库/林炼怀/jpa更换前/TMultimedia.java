package com.archive.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//多媒体文件级档案信息
@Entity
@Table(catalog="DBArchive")
public class TMultimedia implements Serializable{	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	//记录号
	private String unitCode;	//档案馆代码
	private String archiveNo;	//编号
	private String name;	//题名
	@Lob
	private String illustrate;	//详细说明
	private String mediaType;	//多媒体类型
	@OneToOne(fetch=FetchType.LAZY)
	private TEdocument tTEdocument_id;	//电子文档号
	private String author;	//责任者
	private String times;	//时间
	private String notions;	//附注
	private String status;	//状态
	private String isFree;  //是否免费
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getArchiveNo() {
		return archiveNo;
	}
	public void setArchiveNo(String archiveNo) {
		this.archiveNo = archiveNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIllustrate() {
		return illustrate;
	}
	public void setIllustrate(String illustrate) {
		this.illustrate = illustrate;
	}
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public TEdocument gettTEdocument_id() {
		return tTEdocument_id;
	}
	public void settTEdocument_id(TEdocument tTEdocument_id) {
		this.tTEdocument_id = tTEdocument_id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getNotions() {
		return notions;
	}
	public void setNotions(String notions) {
		this.notions = notions;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIsFree() {
		return isFree;
	}
	public void setIsFree(String isFree) {
		this.isFree = isFree;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
