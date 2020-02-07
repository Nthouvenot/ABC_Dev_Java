/**
 * 
 */
package com.crm.bo;

/**
 * @author nicolas
 *
 */
public class CompteBancaire {

	private boolean state;
	private String numeroCompte;
	private int decouvertAutorise;
	private int solde;
	
	/**
	 * @return numeroCompte
	 */
	
	public CompteBancaire() {
		
	numeroCompte="";
	decouvertAutorise=150;
	solde=0;
	state=false;
	}
	
	/**
	 * @return state
	 */
	public boolean getState() {
		
		return state;
	}
	
	/**
	 * @param state
	 */
	public void setState(boolean state) {
		
		this.state = state;
	}
	
	public String getNumeroCompte() {

		return numeroCompte;
	}

	/**
	 * @param numeroCompte
	 */
	public void setNumeroCompte(int numeroCompte) {

		this.numeroCompte = Integer.toString(numeroCompte);
	}
	
	/**
	 * @return decouvertAutorise
	 */
	public String getDecouvertAutorise() { 
		
		return Integer.toString(decouvertAutorise);
	}
	
	/**
	 * @param decouvertAutorise
	 */
	public void setDecouvertAutorise(int decouvertAutorise) {
		
		this.decouvertAutorise = decouvertAutorise;
	}

	/**
	 * @return solde
	 */
	public String getSolde() {

		return Integer.toString(solde);
	}

	/**
	 * @param solde
	 */
	public void setSolde(int solde) {

		this.solde = solde;
	}

	/**
	 * @param numeroCompte
	 * @param somme
	 * @return reussi true or false
	 */
	public boolean depot(String numeroCompte, int somme) {

		if (this.numeroCompte.contentEquals(numeroCompte)) {

			this.solde += somme;
			return true;
		} else
			return false;
	}

	/**
	 * @param numeroCompte
	 * @param somme
	 * @return resultat opération 0 réussi, 1 compte incorrect, -1 découvert
	 */
	public int retrait(String numeroCompte, int somme) {

		int resultat = 0;
		if (this.numeroCompte.contentEquals(numeroCompte)) {
			resultat = this.solde - somme;
			if ((resultat - decouvertAutorise) > 0) {
				this.solde = resultat;
				return 0;
			}
			return -1;
		} else
		return 1;
	}
}
