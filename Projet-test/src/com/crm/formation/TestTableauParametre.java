package com.crm.formation;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author nicolas
 *
 */
public class TestTableauParametre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> tab = new Vector<Integer>(1);
		String scan="";
		Scanner sc = new Scanner(System.in);
		System.out.println("tapez q une fois que vous avez saisi tout les éléments");
		do {
		System.out.println("Entrez un entier");
		scan = sc.nextLine();
		
		if(!scan.contentEquals("q")) {
			try
			{
				tab.add(Integer.parseInt(scan));
			}
			catch(Exception e)
			{
				System.out.println("Ce n'est pas un nombre");
			}
		}
		}
		while(!scan.contentEquals("q"));
		System.out.println("resultat de l'additon de tout les éléments du tableau " + calculElementTableau(tab));
		sc.close();
	}
	
	public static int calculElementTableau(Vector<Integer> tab)
	{
		int result=0;
		for(int i=0;i<tab.size();i++) {
			result += (int)tab.get(i);
		}
			return result;
		
	}

}
