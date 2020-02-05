/**
 * 
 */
package com.crm.boapp;

import java.util.Date;
import java.util.Scanner;

import com.crm.bo.Personne;


/**
 * @author nicolas
 *
 */
public class PersonneApp2 {

	/**
	 * @param argss
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date DateNaissance;
		String chaine = "", chaine2="", chaine3="", chaine4="";
		int nbr = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le nombre de personne");
		nbr = sc.nextInt();
		Personne tabPers[] = new Personne[nbr];

		// Instanciation des objet de type Personnes
		for (int i = 0; i < nbr; i++) {
			tabPers[i] = new Personne();
		}
		// Demande les noms de chaque personne
		int i=0;
		for (Personne p :  tabPers) {
			System.out.println("entrez les information de la personne n°" + i);
			System.out.println("Entrez le nom");
			chaine = sc.next();
			tabPers[i].setNom(chaine);
			System.out.println("Entrez le prenom");
			chaine2 = sc.next();
			tabPers[i].setPrenom(chaine2);
			System.out.println("Entrez le surnom");
			chaine3 = sc.next();
			tabPers[i].surnom = chaine3;
			i++;
		}
		// Raffiche les donnée de chaque personne saisi
		i=0; //réinitialisation du compteur
		for (Personne p :  tabPers) {
			System.out.println("les information de la personne n°" + i);
			System.out.println("Nom : " + tabPers[i].getNom());
			System.out.println("Prenom : " + tabPers[i].getPrenom());
			System.out.println("Surnom : " + tabPers[i].surnom);
			i++;
		}
		sc.close();
	}

}
