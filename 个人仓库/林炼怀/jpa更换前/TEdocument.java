package com.archive.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//电子文档信息
@Entity
@Table(catalog="DBArchive")
public class TEdocument implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long id;	//记录号
	private Integer fileSize;	//文件大小
	private String fileFormat;	//文件格式
	private String filePath;	//保存路径
	private String name;
	private String savedName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getFileSize() {
		return fileSize;
	}
	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileFormat() {
		return fileFormat;
	}
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSavedName() {
		return savedName;
	}
	public void setSavedName(String savedName) {
		this.savedName = savedName;
	}
	
}
