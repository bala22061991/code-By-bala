package org.java;

public class TryCatch {

	public static void main(String[] args) {
		
		
		
		try {
			System.out.println(4/2);
			
		try {
			String s = null;
			System.out.println(s.charAt(1));
	
		} 
		catch (NullPointerException e) {
			System.out.println("NullPointerException");
			e.printStackTrace();
		}
		finally {
			System.out.println("bala");	
			}
		}catch (Exception e) {
			System.out.println("Arthematic Exception");
		}
		finally {
			System.out.println("bala");	
		}
	}

}
