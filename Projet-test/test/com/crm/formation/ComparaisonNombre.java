package com.crm.formation;

import java.util.Scanner;

public class ComparaisonNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nbr1 = 0, nbr2 = 0, nbr3 =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez 1er nombre");
		nbr1 = sc.nextInt();
		System.out.println("Entrez 2em nombre");
		nbr2 = sc.nextInt();
		System.out.println("Entrez 3em nombre");
		nbr3 = sc.nextInt();
		System.out.print("Le plus grand nombre est : ");
		if(nbr1 > nbr2 && nbr1 > nbr3) System.out.println(nbr1 + "(nombre 1)");
		else if(nbr2 > nbr1 && nbr2 > nbr3)  System.out.println(nbr2 + " (nombre 2)");
		else System.out.println(nbr3 + " (nombre 3)");
		sc.close();
	}

}
