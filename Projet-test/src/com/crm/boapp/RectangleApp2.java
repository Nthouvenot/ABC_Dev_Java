/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Rectangle;

/**
 * @author nicolas
 *
 */
public class RectangleApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rectLongeur = 0, rectLargeur = 0;
		String chaineEntree = "";
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.println("***********Rectangle***********");
		System.out.println("Entrez la longeur du rectangle");
		chaineEntree = sc.next();
		try {
			rectLongeur = Integer.parseInt(chaineEntree);
		} catch (Exception e) {
			System.out.println("Erreur ce n'est pas un nombre");
		}
		System.out.println("Entrez la largeur du Rectangle");
		chaineEntree = sc.next();
		try {
			rectLargeur = Integer.parseInt(chaineEntree);
		} catch (Exception e) {
			System.out.println("Erreur ce n'est pas un nombre");
		}
		rect.setLongeur(rectLongeur);
		rect.setLargeur(rectLargeur);
		System.out.println("Perimetre du Rectangle : " + rect.calculPerimetre("cm"));
		System.out.println("Surface du Rectangle : " + rect.calculerSurface("cm"));
	}

}
