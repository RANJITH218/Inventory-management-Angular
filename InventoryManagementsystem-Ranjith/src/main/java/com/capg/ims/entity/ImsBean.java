package com.capg.ims.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")
public class ImsBean {
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int Supplier_id;
	
	private String customer_name;
	
	private double Address;
	
	public int getSupplier_id() {
		return Supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		Supplier_id = supplier_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public double getAddress() {
		return Address;
	}

	public void setAddress(double address) {
		Address = address;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	private String contact_number;

	