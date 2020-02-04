/**
 * 
 */
package com.crm.app;

import java.util.Scanner;

import com.crm.bo.Personne;

/**
 * @author nicolas
 *
 */
public class PersonneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne pers = new Personne();
		pers.surnom = "nico";
		pers.setNom("Thouvenot");
		pers.setPrenom("nicolas");
		
		System.out.println("Bienvenue " + pers.getNom() + " (" + pers.surnom + ")");
		
		pers.afficherDetails();
		
		String chaine = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre nom");
		chaine = sc.nextLine();
		pers.setNom(chaine);
		System.out.println("Entrez votre prenom");
		chaine = sc.nextLine();
		pers.setPrenom(chaine);
		System.out.println("Entrez votre surnom");
		pers.surnom = sc.nextLine();
		
		pers.afficherDetails();
		sc.close();
	}

}
