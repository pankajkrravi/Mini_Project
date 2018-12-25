package com.goomo.app;

public class b extends A {
	
	// static int a = 10;

	public int ASDF() {
		return A.a = 25;
	}

	//static int a = 10;

	public static void main(String[] args) {
		b bb=new b();
		int res=bb.ASDF();
		System.out.println(res);
		System.out.println(a);
	}

}