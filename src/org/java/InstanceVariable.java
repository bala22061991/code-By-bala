package org.java;

public class InstanceVariable {
	
	 int a;

	private void method() {
		a = 100;
		System.out.println("A value inside method:" + a);

	}

	public static void main(String[] args) {
		
		InstanceVariable i = new InstanceVariable();

		System.out.println("A value before calling method:" + i.a);

		i.method();

		System.out.println("A value after calling method:" + i.a);

		
		
		InstanceVariable e = new InstanceVariable();
		
		System.out.println("A value before calling method:" + e.a);

		e.method();

		System.out.println("A value after calling method:" + e.a);

	}

}
