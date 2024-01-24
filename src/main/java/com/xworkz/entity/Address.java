package com.xworkz.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "student_address")
public class Address {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addressId;
	@Column(length = 50 ,name = "place")
	private String place;
	@Column(name = "pincode")
	private int pincode;
	@Column(name = "added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate ;
	@Transient
	private double x;
	
	public Address() {
		System.out.println("address object is created");
	}

	public Address(int addressId, String place, int pincode, Date addedDate, double x) {
		super();
		this.addressId = addressId;
		this.place = place;
		this.pincode = pincode;
		this.addedDate = addedDate;
		this.x = x;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", place=" + place + ", pincode=" + pincode + ", addedDate="
				+ addedDate + ", x=" + x + "]";
	}
	
}
