package com.tns.day4.secondpackage;

import com.tns.day4.firstpackage.Base;

public class Executor2 extends Base {
	
	
	public static void main(String[] args) {
		Base obj = new Base();
		//obj.varProtected=2;
		//obj.varDefault=1;
		obj.varPublic=3;
		//obj.varPrivate=4;
		
		
		//obj.methodDefault();
		//obj.methodProtected();
		obj.methodPublic();
		//obj.methodPrivate();
	}

}
class Executor4 extends Base{
	/*void methodDefault() {
		System.out.println("I am a default method");
		System.out.println("Default Variable:"+varDefault);
	}*/
	public void methodPublic() {
		System.out.println("I am a public method");
		System.out.println("public Variable:"+varPublic);
	}
	/*private void methodPrivate() {
		System.out.println("I am a private method");
		System.out.println("Private Variable:"+varPrivate);
	}*/
	protected void methodProtected() {
		System.out.println("I am a Protected method");
		System.out.println("Protected Variable:"+varProtected);
	}
}
