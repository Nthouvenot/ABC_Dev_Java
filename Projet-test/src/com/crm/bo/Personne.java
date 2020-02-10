package com.crm.bo;

import java.util.Date;

/**
 * @author nicolas
 *
 */
public class Personne {

	// Attributs
	public String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;
	
	
	// Méthodes
	/**
	 * Constructor with no param
	 */
	public Personne() {
		
	}
	
	
	/**
	 * @param nom
	 * @param prenom
	 */
	public Personne(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}
	/**
	 * Cette méthodes renvoie la valeur de l'attribut nom
	 * @return nom
	 */
	public String getNom() {

		return nom;
	
	}

	/**
	 * Methode qui modifie la valeur de l'attribut nom
	 * @param n nouveau nom
	 */
	public void setNom(String nom) {
		
		this.nom = nom;
		
	}
	

	/**
	 * Cette méthodes renvoie la valeur de l'attribut prenom
	 * @return prenom
	 */
	public String getPrenom() {
		
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		
		this.prenom = prenom; 
	}
	
	public void afficherDetails() {
		
		System.out.println("Vous étes " + nom + " " + prenom + " (" + surnom + ")");
	}
	
	public void afficherDetails(String lang) {
		
		if(lang.contentEquals("anglais")) {
			
			System.out.print("You are ");
		}
		else if(lang.contentEquals("francais")) {
			
			System.out.print("Vous etes ");
		}
		
		System.out.println(nom + " " + prenom + " (" + surnom + ")");
	}
}