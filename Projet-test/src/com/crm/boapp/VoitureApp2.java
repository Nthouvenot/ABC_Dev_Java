/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Voiture;

/**
 * @author nicolas
 *
 */
public class VoitureApp2 {

	static Voiture voiture;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine;
		int saisie=0;
		boolean ok= true;
		Scanner sc = new Scanner(System.in);
		voiture = new Voiture();
		//---------------------------------------------------------------------------
		do {
			// Affiche etat voiture + vitesse
			if(voiture.getEnRoute()) System.out.println("Etat voiture : demarrer");
			else System.out.println("Etat voiture : arreter");
			System.out.println("Vitesse actuelle : " + voiture.getVitesse());
			
			// Menu
			System.out.println("*********Menu*********");
			System.out.println("**1) Saisir info******");
			System.out.println("**2) Afficher info****");
			System.out.println("**3) Demarrer Voiture*");
			System.out.println("**4) Accelerer********");
			System.out.println("**5) Ralentir*********");
			System.out.println("**6) Klaxonner********");
			System.out.println("**7) Arreter**********");
			System.out.println("**8) Quitter**********");
			System.out.println("**********************");
			System.out.println("Saisissez votre choix");
			do {
				chaine = sc.next();
				try {
					saisie = Integer.parseInt(chaine);
					} catch (Exception e) {
					System.out.println("Entrez un nombre");
					ok=false;
					}
				} while(!ok);
			//---------------------------------------------------------------------------
			switch(saisie) {
			
			case 1: saisirInfo(); break;
			case 2: afficherInfo(); break;
			case 3: voiture.demarrer(); break;
			case 4: accelerer(); break;
			case 5: ralentir(); break;
			case 6: voiture.klaxonner(); break;
			case 7: voiture.arret(); break;
			case 8: System.out.println("Sortie du programme...");break;
			default : System.out.println("Erreur");
			}
		} while(!(saisie == 8));
	}
	
	/**
	 *constructor with no param 
	 */
	public VoitureApp2() {
		
		voiture = new Voiture();
	}
	
	/**
	 *Saise des informations de la voiture 
	 */
	private static void saisirInfo() {
		
		Scanner sc = new Scanner(System.in);
		int saisieInt;
		String saisie = " ";
		System.out.println("Entrez la marque de la voiture");
		voiture.setMarque(sc.next());
		System.out.println("Entrez la couleur");
		voiture.setCouleur(sc.next());
		System.out.println("Entrez le nombre de porte :");
		saisieInt = sc.nextInt();
		if(saisieInt == 4 || saisieInt == 5) voiture.setNombreDePorte(saisieInt);
		System.out.println("Dispose de la boite automatique (O/N)");
		saisie = sc.next();
		if(saisie.equals("O")) voiture.setBoiteAuto(true);
		else if(saisie.equals("N")) voiture.setBoiteAuto(false);
		System.out.println("Entrez le prix :");
		voiture.setPrix(sc.nextInt());
	}
	
	private static void afficherInfo() {
		System.out.println("Info sur la voiture :");
		System.out.println("Marque : " + voiture.getMarque());
		System.out.println("Couleur : " + voiture.getCouleur());
		System.out.println("Nombre de porte : " + voiture.getNombreDePorte());
		System.out.print("boite auto : ");
		if(voiture.getBoiteAuto()) System.out.println("oui");
		else System.out.println("non");
		System.out.println("Prix : " + voiture.getPrix() + " euro");
	}
	
	private static void accelerer() {
		
		Scanner sc =new Scanner(System.in);
		int vitesse;
		String typeRoute;
		System.out.println("Entrez la valeur de l'acceleraation en Km/h");
		vitesse = sc.nextInt();
		System.out.println("Entrez le type de route");
		typeRoute = sc.next();
		voiture.accelerer(vitesse, typeRoute);
	}
	
	private static void ralentir() {
		
	}
}
