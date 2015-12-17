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

//资料档案信息
@Entity
@Table(catalog="DBArchive")
public class TMaterial implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	//记录号
	private String unitCode;	//档案馆代码
	private String materialTypeString;	//资料类别
	private String contentType;	//内容类别
	private String name;	//题名
	private String author;	//作者
	@OneToOne(fetch=FetchType.LAZY)
	private TEdocument tTEdocument_id;	//电子文档号
	private String isbn;	//ISBN
	private String publisher;	//出版社
	private String times;	//时间
	@Lob
	private String subjectAbstract;	//提要
	private String nations;	//附注
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
	public String getMaterialTypeString() {
		return materialTypeString;
	}
	public void setMaterialTypeString(String materialTypeString) {
		this.materialTypeString = materialTypeString;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public TEdocument gettTEdocument_id() {
		return tTEdocument_id;
	}
	public void settTEdocument_id(TEdocument tTEdocument_id) {
		this.tTEdocument_id = tTEdocument_id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getSubjectAbstract() {
		return subjectAbstract;
	}
	public void setSubjectAbstract(String subjectAbstract) {
		this.subjectAbstract = subjectAbstract;
	}
	public String getNations() {
		return nations;
	}
	public void setNations(String nations) {
		this.nations = nations;
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
