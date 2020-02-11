package com.crm.boapp;

import java.util.Scanner;
import java.util.Vector;

import com.crm.bo.CompteBancaire;

public class CompteBancaireAmeliorer {

	private static int numeroCompte;
	private static Vector<CompteBancaire> compte;
	private static CompteBancaire compte1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation et definition
		int retour=0;
		String saisie="";
		CompteBancaire compte1;
		compte = new Vector<CompteBancaire>(1);
		compte.add(new CompteBancaire());
		compte1 = compte.get(0);
		
		Scanner sc = new Scanner(System.in);
		// initialisation numéro de compte si besoin
		if (!compte1.getState()) {
			numeroCompte++;
			compte1.setNumeroCompte(numeroCompte);
			System.out.println("Vous avez le compte N°" + compte1.getNumeroCompte());
			compte1.setState(true);
		}
		// Création et gestion menu
		do {
			// if(retour != 0) sc.next();
			System.out.println("***Saisisser une opération***");
			System.out.println("1) Consulter mon solde");
			System.out.println("2) Faire un depot");
			System.out.println("3) Faire un retrait");
			System.out.println("4) Creer un compte");
			System.out.println("5) Afficher nombre de compte");
			System.out.println("6) Quitter");
			System.out.println("Votre choix ?");
			saisie = sc.next();
			try {

				retour = Integer.parseInt(saisie);

			} catch (Exception e) {

				System.out.println("Veuillez saisir un nombre");
			}
			switch (retour) {
				case 1: {
					System.out.println("Vous avez un solde de " + compte1.getSolde());
					break;
				}
				case 2: {
					operation(retour, compte1);
					break;
					}
				case 3: {
					operation(retour, compte1);
					break;
				}
				case 4: {
					numeroCompte++;
					compte.add(new CompteBancaire());
					compte1 = compte.get(compte.size()-1); // Selction du dernier compte creer
					compte1.setNumeroCompte(numeroCompte);
					System.out.println("Vous avez le compte N°" + compte1.getNumeroCompte());
					break;
				}
				case 5: {
					System.out.println("Nombre de compte : " + numeroCompte);
				}
			}
		}
		while(!(retour==6));
		sc.close();
	}
	
	static void operation(int op, CompteBancaire compte1) {
		boolean ok=false;
		int sommeInt=0;
		String nbrCompte="", somme;
		Scanner sc= new Scanner(System.in);
		if(op == 2) {
			System.out.println("Faire un dépot");
			System.out.println("Veuillez entrez le numero de compte");
			nbrCompte = sc.next();
			// Saisie de la somme
			do {
				System.out.println("Veuillez entrez la somme");
				somme = sc.next();
				try {
				sommeInt = Integer.parseInt(somme);
				ok=true;
				}
				catch(Exception e) {
				System.out.println("Veuillez saisir un nombre");
				}
			}
			while(!ok);
			if(compte1.depot(nbrCompte, sommeInt)) {
				System.out.println("La somme a ete depose sur le compte " + nbrCompte);
			}
			else {
				System.out.println("Numéro de compte incorrect");
			}
			}
		else if(op == 3) {		
		int retour = compte1.retrait(nbrCompte, sommeInt);
		// test retrait
		if (retour == 0) {

			System.out.println("Le compte a été debité de 300 euros");
			System.out.println("Nouveau solde : " + compte1.getSolde() + " euros");
		} else if (retour > 0) {

			System.out.println("Erreur numéro de compte incorrect");
		} else
			System.out.println("Vous n'avez pas les fond suffisant");
	}
			
			
	}
	//sc.close();
}