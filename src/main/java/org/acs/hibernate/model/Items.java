package org.acs.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Items {
    @Id
    @Column(name = "iid" ,length = 25)
	private int itemId;
    
    @Column(name = "iname" ,length = 30)
	private String itemName;
    
    @Column(name = "iprice" ,length = 25)
	private double itemPrice;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
    
    
}
