/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class TypePrimitifTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0, b = 0, r = 0;
		int choix;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Choisissez une opération");
			System.out.println("1: +");
			System.out.println("2: -");
			System.out.println("3: *");
			System.out.println("4: /");
			System.out.println("5: quitter");
			choix = sc.nextInt();
		} while (choix > 5);
		if (choix != 5) {
			System.out.println("Entrez un nombre entier");
			a = sc.nextDouble();
			System.out.println("entrez un nombre entier");
			b = sc.nextDouble();
			switch (choix) {
			case 1:
				r = a + b;
				break;
			case 2:
				r = a - b;
				break;
			case 3:
				r = a * b;
				break;
			case 4:
				r = a / b;
				break;
			}
			System.out.print("le résualt de l'opération est : ");
			System.out.println(r);
		}
		sc.close();
	}

}
