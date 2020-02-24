package com.crm.test;
/**

@author Nicolas Thouvenot

@version 1.0
@param void
@return void

Calcul la niéme factorielle
*/









import java.util.Scanner;

/**
 * @author nicolas
 *
 */
public class Factorielle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nbr=0, factorielle=1;
		String Scan="";
		boolean ok=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre pour calculer la factorielle");
		do
		{
			Scan = sc.nextLine();
			try {
				nbr = Integer.parseInt(Scan);
			}
			catch(Exception nfe)
			{
				System.out.println("Veuillez entrez un nombre !!!");
				ok = false;
			}
			
		}
		while(!ok);
		for(int i=1; i<=nbr; i++) {
			factorielle = factorielle*i;
		}
		System.out.println("Valeur de la factorielle de " + nbr + " est de " + factorielle);
		sc.close();
	}

}
