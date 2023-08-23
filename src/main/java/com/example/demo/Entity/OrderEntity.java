package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderEntity {

	@Id
	@GeneratedValue
	private int o_id;
	private String name;
	private String address;
	private int quantity;
	private int pincode;
	private String type_of_delivery;
	
	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderEntity(int o_id, String name, String address, int quantity, int pincode, String type_of_delivery) {
		super();
		this.o_id = o_id;
		this.name = name;
		this.address = address;
		this.quantity = quantity;
		this.pincode = pincode;
		this.type_of_delivery = type_of_delivery;
	}
	
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getType_of_delivery() {
		return type_of_delivery;
	}
	public void setType_of_delivery(String type_of_delivery) {
		this.type_of_delivery = type_of_delivery;
	}
	
}
