package com.tns.day3;

public class ConstructorDemo {

	public static void main(String[] args) {
		Customer a=new Customer("ram",2567,"bangalore");
		System.out.println(a);
		System.out.println(a.getCustomerName());
		a.setCustomerName("shella");
		System.out.println(a.getCustomerName());
		a.setCustomerCity("hydrabad");
		System.out.println(a);
	}

}
