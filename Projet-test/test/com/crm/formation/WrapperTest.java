package com.crm.formation;

import java.util.Scanner;

public class WrapperTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	String chaine = "";
	int entier = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("entrez un entier");
	chaine = sc.nextLine();
	try
	{
		entier=Integer.parseInt(chaine);
	}
	catch(NumberFormatException nfe)
	{
		System.out.println("Le nombre saisi n'est pas un entier !!!");
	}
	System.out.println(entier);
	sc.close();
	}
}
