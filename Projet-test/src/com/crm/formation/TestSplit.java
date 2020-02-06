/**
 * 
 */
package com.crm.formation;

/**
 * @author nicolas
 *
 */
public class TestSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chaine="nicolas, thouvenot";
		String[] nom;
		nom = chaine.split(",");
		System.out.println("Nom : " + nom[0]);
		System.out.println("Preom : " + nom[1]);
	}

}
