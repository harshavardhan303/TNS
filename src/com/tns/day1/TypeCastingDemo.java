package com.tns.day1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//implicit conversion
		byte b=10;
		int i=b;
		System.out.println(i);
		
		//explicit conversion
		float f1=34.56f;
		int f2=(int) f1;
		System.out.println(f2);
		
		//implicit
		int a=10;
		float c=a;
		System.out.println(c);
		
		//explicit
		double d1=1.765546988d;
		float d2= (float)d1;
		System.out.println(d2);
		
	}

}
