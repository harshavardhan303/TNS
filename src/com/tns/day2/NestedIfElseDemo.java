package com.tns.day2;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a=10,b=20,c=5;
		if(a>b) {
			if(a>c) {
				System.out.println("a holds the largest number");
			}else {
				System.out.println("c holds the largest number");
			}
		}else {
			if(b>c) {
				System.out.println("b holds the largest number");
			}
			else {
				System.out.println("c holds the largest number");
			}
		}
	}

}
