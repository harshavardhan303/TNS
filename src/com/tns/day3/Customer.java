package com.tns.day3;

public class Customer {
private String customerName;
private int customerid;
private String customerCity;

public Customer(String customerName, int customerid, String customerCity) {
	
	this.customerName = customerName;
	this.customerid = customerid;
	this.customerCity = customerCity;
}

public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomerCity() {
	return customerCity;
}
public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", customerid=" + customerid + ", customerCity=" + customerCity
			+ "]";
}



}
