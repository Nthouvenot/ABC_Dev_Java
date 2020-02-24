/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Voiture;

/**
 * @author nicolas
 *
 */
public class VoitureApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voiture voiture1 = new Voiture("Renault", "noire", 5, true, 25000, false, 0);
		//Affichage voiture + etat
		//---------------------------------------------------------------------------
		System.out.print("Vous avez une " + voiture1.getMarque() + " " + voiture1.getCouleur());
		System.out.print(" " + voiture1.getNombreDePorte() + " porte");
		if(voiture1.getBoiteAuto()) {
			System.out.println(" boite automatique");
		} else {
			System.out.println(" boite manuelle");
		}
		System.out.print("Etat voiture : ");
		if(voiture1.getEnRoute()) {
			System.out.println("moteur demarrer");
		} else {
			System.out.println("moteur arreter");
		}
		System.out.println("vitesse en cours " + voiture1.getVitesse() + "Km/h");
		//---------------------------------------------------------------------------
		// test classe Voiture
		//---------------------------------------------------------------------------
		System.out.println("Procédure de test :");
		voiture1.demarrer();
		if(voiture1.getEnRoute()) {
			System.out.println("Voiture demarrer");
		} else {
			System.out.println("Panne moteur");
		}
		//---------------------------------------------------------------------------
		System.out.println("Acceleration de 50 Km/h ...");
		for(int i=0; voiture1.getVitesse() != 50; i++) {
			voiture1.accelerer(10, "Ville");
			System.out.println("vitesse de la voiture :" + voiture1.getVitesse() + " Km/h");			
		}
		System.out.println("La voiture roule a " + voiture1.getVitesse() + " Km/h");
		//---------------------------------------------------------------------------
		System.out.println("Acceleration de 30 Km/h ...");
		for(int i=0; voiture1.getVitesse() != 80; i++) {
			voiture1.accelerer(10, "VoieExpress");
			System.out.println("vitesse de la voiture :" + voiture1.getVitesse() + " Km/h");
		}
		System.out.println("La voiture roule a " + voiture1.getVitesse() + " Km/h");
		voiture1.klaxonner();
		//---------------------------------------------------------------------------
		System.out.println("La voiture ralenti");
		for(int i1=0; voiture1.getVitesse() != 0; i1++) {
			voiture1.ralentir(10);
			System.out.println("vitesse de la voiture :" + voiture1.getVitesse() + " Km/h");
		}
		System.out.println("Arret moteur");
		voiture1.arret();
		if(!voiture1.getEnRoute()) {
			System.out.println("moteur arreter");
		}
		//---------------------------------------------------------------------------
		
	}
}
