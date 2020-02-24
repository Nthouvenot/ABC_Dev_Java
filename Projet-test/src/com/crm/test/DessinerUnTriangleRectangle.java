package com.crm.test;
/**

@author Nicolas Thouvenot

@version 1.0
@param void
@return void

Classe créent un rectangle avec la dimension de la longeur et de la largeur
*/

import java.util.Scanner;

/**
 * @author nicolas
 *
 */
public class DessinerUnTriangleRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longeur = 0, i = 0, i2 = 0, ligne = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une longeur du triangle");
		longeur = sc.nextInt();
		sc.close();
		System.out.println("Le  triangle de longeur " + longeur + " :");
		for (i2 = 0; i2 < longeur; i2++) {
			for (i = 0; i < ligne; i++) {
				System.out.print("*");
			}
			System.out.println();
			ligne++;
		}
	}

}
