package com.tns.day4.firstpackage;

public class Executor {

	public static void main(String[] args) {
		Base obj = new Base();
		obj.varProtected=2;
		obj.varDefault=1;
		obj.varPublic=3;
		//obj.varPrivate=4;
		
		obj.methodDefault();
		obj.methodProtected();
		obj.methodPublic();
		//obj.methodPrivate();
	}

}
