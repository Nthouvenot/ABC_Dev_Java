package com.crm.formation;

import java.util.Scanner;

/**
 * @author nicolas
 *
 */
public class ReductionSncf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Entrez votre age");
		age = sc.nextInt();
		if(age>=15 && age<=25) System.out.println("Vous avez droit a une r�duction de 30%");
		else if(age>60) System.out.println("Vous avez droit a une reduction de 50%");
		else System.out.println("Vous n'avez droit a aucune r�duction");
		System.out.println("R�sulat if non imbriqu�");
		
		// m�thode sans else if
		if(age>=15 && age<=25 || age>60) {
			if(age<=25) System.out.println("Vous avez droit a une r�duction de 30%");
			if(age>60) System.out.println("Vous avez droit a une reduction de 50%");
		}
			else System.out.println("Vous n'avez droit a aucune r�duction");
			System.out.println("R�sulat imbriqu�");
		sc.close();
	}
	
}
