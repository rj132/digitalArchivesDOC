package com.archive.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//借还信息
@Entity
@Table(catalog="DBArchive")
public class TCheckout implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	//记录号
	//指定当前实体字段名为borrowNo_id，参考的外键名为borrowNo
	@OneToOne(cascade = CascadeType.ALL, optional = false,fetch=FetchType.EAGER)
	private TReserve tTreserve;   // 
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
	private Date borrowTimes;  //借阅时间
	private Date returnTimes;	//还回时间
	private String returnStatus;	//还回状态
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TStaff tTStaff_loan;   //借出处理人
	@ManyToOne(fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.NO_ACTION)
	private TStaff tTStaff_return;   //还回处理人
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public TReserve gettTreserve() {
		return tTreserve;
	}
	public void settTreserve(TReserve tTreserve) {
		this.tTreserve = tTreserve;
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
	public Date getBorrowTimes() {
		return borrowTimes;
	}
	public void setBorrowTimes(Date borrowTimes) {
		this.borrowTimes = borrowTimes;
	}
	public Date getReturnTimes() {
		return returnTimes;
	}
	public void setReturnTimes(Date returnTimes) {
		this.returnTimes = returnTimes;
	}
	public String getReturnStatus() {
		return returnStatus;
	}
	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}
	public TStaff gettTStaff_loan() {
		return tTStaff_loan;
	}
	public void settTStaff_loan(TStaff tTStaff_loan) {
		this.tTStaff_loan = tTStaff_loan;
	}
	public TStaff gettTStaff_return() {
		return tTStaff_return;
	}
	public void settTStaff_return(TStaff tTStaff_return) {
		this.tTStaff_return = tTStaff_return;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
