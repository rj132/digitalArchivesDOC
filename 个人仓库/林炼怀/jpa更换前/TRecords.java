package com.archive.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//案卷级档案信息
@Entity
@Table(catalog="DBArchive")
public class TRecords implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String recordPrefix;   //案卷前缀
	private String recordNo;       //案卷号
	private String unitCode;       //档案馆代码
	private String recordName;     //题名
	private String author;         //责任者
	private String FromToTime;     //起止时间
	private String secretLevel;    //密级
	private Integer number;        //文件件数
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRecordPrefix() {
		return recordPrefix;
	}
	public void setRecordPrefix(String recordPrefix) {
		this.recordPrefix = recordPrefix;
	}
	public String getRecordNo() {
		return recordNo;
	}
	public void setRecordNo(String recordNo) {
		this.recordNo = recordNo;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getRecordName() {
		return recordName;
	}
	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getFromToTime() {
		return FromToTime;
	}
	public void setFromToTime(String fromToTime) {
		FromToTime = fromToTime;
	}
	public String getSecretLevel() {
		return secretLevel;
	}
	public void setSecretLevel(String secretLevel) {
		this.secretLevel = secretLevel;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
