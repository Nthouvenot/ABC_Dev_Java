package com.crm.formation;

public class OperateurTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maVariableInt;
		maVariableInt = 36;
		System.out.println("maVariableInt");
		System.out.println(maVariableInt);
		
		int maVariableInt2;
		maVariableInt2 = maVariableInt;
		System.out.println("maVariableInt2");
		System.out.println(maVariableInt2);
		
		int maVariableInt3;
		maVariableInt3 = maVariableInt2 = maVariableInt = 58;
		System.out.println("maVariableInt");
		System.out.println(maVariableInt);
		System.out.println("maVariableInt2");
		System.out.println(maVariableInt2);
		System.out.println("maVariableInt3");
		System.out.println(maVariableInt3);
	}

}
