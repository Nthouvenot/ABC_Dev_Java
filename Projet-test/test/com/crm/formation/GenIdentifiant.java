package com.crm.formation;

import java.util.Scanner;

public class GenIdentifiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String prenom = "";
		String nom = "";
		String login = "";
		String password= "";
		String fpassword = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre prénom :");
		prenom = sc.nextLine();
		System.out.println("Entrez votre nom :");
		nom = sc.nextLine();
		login = prenom.substring(0, 1);
		login = login.toUpperCase();
		login = login + "." + nom.toUpperCase();
		System.out.println("Votre login sera : " + login);
		password = nom.substring(0, 2);
		password = password.toUpperCase();
		password = password + nom.substring(2, nom.length());
		password = password.replace('o', '@');
		fpassword = password.substring(0, password.length() - 1);
		int nombreAleatoire = (int)(Math.random()*9);
		fpassword = fpassword + Integer.toString(nombreAleatoire);		
		System.out.println("Votre mot de passe sera :" + fpassword);
		sc.close();
	}
}
