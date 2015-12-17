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

//文件级档案信息
@Entity
@Table(catalog="DBArchive")
public class TFiles implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	//记录号
	private String filePrefix;	//文档前缀
	private Integer pieceNo;	//件号
	private String unitCode;	//档案馆代码
	@OneToOne(fetch=FetchType.LAZY)
	private TEdocument tTEdocument_id;	//电子文档号
	private String name;	//题名
	private String fileNo;	//文件编号
	private String author;	//责任者
	private String attachName;	//附件名
	private String docVersion;	//稿本
	private String docType;	//文种
	private Integer pages;	//页数
	private String times;	//时间
	private String carrierType;	//载体类型
	private String secretLevel;	//密级
	private String subjectTerms;	//档案主题词
	@Lob
	private String subjectAbstract;	//档案提要
	private String notions;	//附注
	private String status;	//状态
	private String isFree;  //是否免费
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFilePrefix() {
		return filePrefix;
	}
	public void setFilePrefix(String filePrefix) {
		this.filePrefix = filePrefix;
	}
	public Integer getPieceNo() {
		return pieceNo;
	}
	public void setPieceNo(Integer pieceNo) {
		this.pieceNo = pieceNo;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public TEdocument gettTEdocument_id() {
		return tTEdocument_id;
	}
	public void settTEdocument_id(TEdocument tTEdocument_id) {
		this.tTEdocument_id = tTEdocument_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFileNo() {
		return fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAttachName() {
		return attachName;
	}
	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}
	public String getDocVersion() {
		return docVersion;
	}
	public void setDocVersion(String docVersion) {
		this.docVersion = docVersion;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getCarrierType() {
		return carrierType;
	}
	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
	}
	public String getSecretLevel() {
		return secretLevel;
	}
	public void setSecretLevel(String secretLevel) {
		this.secretLevel = secretLevel;
	}
	public String getSubjectTerms() {
		return subjectTerms;
	}
	public void setSubjectTerms(String subjectTerms) {
		this.subjectTerms = subjectTerms;
	}
	public String getSubjectAbstract() {
		return subjectAbstract;
	}
	public void setSubjectAbstract(String subjectAbstract) {
		this.subjectAbstract = subjectAbstract;
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
