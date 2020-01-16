package com.crm.formation;

public class BoucleTestContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x=-5; x<=5; x++) {
			if( x==0 ) {
				System.out.println("division par 0");
				continue;
			}
			System.out.println(1.0/x);			
		}
	}

}
