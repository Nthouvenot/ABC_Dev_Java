/**
 * 
 */
package com.crm.boapp;

import java.util.Vector;

import com.crm.bo.Personne;

/**
 * @author nicolas
 *
 */
public class VectorApp {

	/**
	 * @param args
	 */
	@SuppressWarnings({"unused","rawtypes"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector groupe = new Vector();
		Personne michael = new Personne("Mickael", "Jordan");
		Personne lebron = new Personne("lebron", "James");

		groupe.addElement(michael);
		groupe.addElement(lebron);
		
		Personne unBasketteur1 = (Personne) groupe.get(0);
		System.out.println(unBasketteur1.getNom());
		
		System.out.println("Mon equipe a :" + groupe.size() + " joueurs");
		Personne kobe = new Personne("kobe", "Bryan");
		groupe.addElement(kobe);
		System.out.println("Mon equipe a :" + groupe.size() + " joueurs");
		System.out.println("Le joueur lebron James est a la " + (groupe.indexOf(lebron)+1) + " position");
		lebron.surnom = "The king";
		
		Personne lebronModif = (Personne)groupe.get(1);
		System.out.println("Le surnom de Lebron James est " + lebronModif.surnom);
		
	}
}