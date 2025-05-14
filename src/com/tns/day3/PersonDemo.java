package com.tns.day3;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name:");
		String name=sc.next();
		System.out.print("Enter the income:");
		int income=sc.nextInt();
		System.out.print("Enter the age:");
		int age=sc.nextInt();
		System.out.print("Enter the gender:");
		String gender=sc.next();
		System.out.print("Enter the tax:");
		int tax=sc.nextInt();
		sc.close();
		
		Person p=new Person();
		p.setPersonNmae(name);
		p.setIncome(income);
		p.setAge(age);
		p.setGender(gender);
		p.setTax(tax);
		
		System.out.println(p);
	}

}
