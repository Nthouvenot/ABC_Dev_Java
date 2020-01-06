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
		
		int somme1;
		somme1 = 5+6;
		System.out.println(somme1);
		
		int somme2;
		somme2 = somme1 + 7;
		System.out.println(somme2);
		
		int multiplication;
		multiplication = somme2 * 8;
		System.out.println(multiplication);
		
		double multiplication2;
		multiplication2 = 1.5*4.2;
		System.out.println(multiplication2);
		
		int soustraction;
		soustraction = 6-4;
		System.out.println(soustraction);
		
		double modulo;
		modulo = (12%8);
		System.out.println(modulo);
	    }

}
