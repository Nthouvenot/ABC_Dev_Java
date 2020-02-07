/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.CompteBancaire;

/**
 * @author nicolas
 *
 */
public class CompteBancaireApp {

	private static int numeroCompte;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int retour;
		final int SOMMEDEBIT=300;
		final int SOMMECREDIT = 1500;
		CompteBancaire compte1;
		compte1 = new CompteBancaire();
		compte1.setDecouvertAutorise(150);
		
		// initialisation numéro de compte si besoin
		if (compte1.getNumeroCompte().isEmpty()) {
			numeroCompte++;
			compte1.setNumeroCompte(numeroCompte);
			System.out.println("Numéro de compte " + compte1.getNumeroCompte());
		}
		
		//test depot
		if (!compte1.depot(Integer.toBinaryString(numeroCompte), SOMMECREDIT)) {
			System.out.println("Erreur numéro de compte incorrect");
		}
		else {
			
			System.out.println("Depot de "+ SOMMECREDIT + " effectue");
			System.out.println("nouveau solde : " + compte1.getSolde());
		}

		retour = compte1.retrait(Integer.toBinaryString(numeroCompte), SOMMEDEBIT);

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
