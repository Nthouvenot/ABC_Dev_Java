package com.crm.formation;

import java.util.Scanner;

/**
 * @author nicolas
 *
 */
public class TestPaireImpaire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		short nbr = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre");
		nbr = sc.nextShort();
		if (nbr % 2 == 0) System.out.println("Ce nombre est pair");
		else System.out.println("Ce nombre est impair");
		sc.close();
		}
}
