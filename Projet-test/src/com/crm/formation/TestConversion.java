package com.crm.formation;

/**
 * @author nicolas
 *
 */
public class TestConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//----------------------------------------		
		//cast implicite
		int x=0;
		short z=12;
		x=z;
		System.out.println(x);
		// cast explicite
		int x2=65526;
		short z2=0;
		z2=(short) x2;
		System.out.println(z2);
		System.out.println();
//----------------------------------------
		long l1 = 123456789;
		long l2 = 123456788;
		float f1 = l1;
		float f2 = l2;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println();
		System.out.println(l1-l2);
		System.out.println(f1-f2);
//----------------------------------------
	}

}
