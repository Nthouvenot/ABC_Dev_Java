package com.crm.formation;

import java.util.Scanner;

/**
 * @author nicolas
 *
 */
public class ChoixFormation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String chaine1 = "Vous avez choisi de ";
		final String chaine2 = " suivre la formation : ";
		boolean R = false;
		Scanner sc;
		String choix = "";
		sc = new Scanner(System.in);
		do {
			System.out.println("Choisissez une formation qualifiante parmi les propositions suivantes");
			System.out.println("(C) : CDA");
			System.out.println("(D) : DWWM");
			System.out.println("(R) R�orientation");
			System.out.println("(E) : En cours de r�flexion");
			choix = sc.nextLine();
		} while (!(choix.contentEquals("C") || choix.contentEquals("D") || choix.contentEquals("R")
				|| choix.contentEquals("E")));
		switch (choix) {
		case "C":
			System.out.println(chaine1 + chaine2 + "Concepteur D�veloppeur d'Application");
			break;
		case "D":
			System.out.println(chaine1 + chaine2 + "D�veloppeur Web et Mobile");
			break;
		case "R":
			System.out.println(chaine1 + "vous reorient�");
			break;
		case "E":
			System.out.println("Vous �tes encore en cours de reflexion");
			break;
		}
		sc.close();

	}

}
