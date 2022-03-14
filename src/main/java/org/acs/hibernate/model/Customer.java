package org.acs.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Customer {
	
	@Id
	@Column(name = "cid", length = 20)
	private int customerId;
	
	@Column(name = "cname", length = 50)
	private String customerName;
	
	@Column(name = "mnumber", length = 10)
	private long mobileNumber;
	
	@Column(name = "mail", length = 30)
	private String mail;
	
	
	@OneToMany(targetEntity = Items.class , cascade = CascadeType.ALL)
	@JoinColumn(name = "cid" ,referencedColumnName = "cid")
	private List  items;


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public List getItems() {
		return items;
	}


	public void setItems(List items) {
		this.items = items;
	}
	
	
	

}
