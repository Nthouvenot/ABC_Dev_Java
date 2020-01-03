package com.crm.formation;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class LectureClavierTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez un texte");
		str = sc.nextLine();
		System.out.print("valeur de la chaine ");
		System.out.println(str);
		sc.close();
	}

}