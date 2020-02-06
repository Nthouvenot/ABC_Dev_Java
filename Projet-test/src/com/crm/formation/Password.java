package com.crm.formation;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String LOGIN = "CRM";
		final String PASSWORD = "sdfsdfsdf";
		
		String login = "";
		String password = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre login");
		login = sc.nextLine();
		System.out.println("Entrez votre mot de passe");
		password = sc.nextLine();
		if (login.equals(LOGIN) && password.equals(PASSWORD))
			System.out.println("Login sucess");
		else
			System.out.println("Login Failed");
		sc.close();
	}

}
