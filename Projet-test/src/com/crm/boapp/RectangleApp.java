/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Rectangle;
import java.util.Scanner;

/**
 * @author nicolas
 *
 */
public class RectangleApp {

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
		System.out.println("Perimetre du Rectangle : " + rect.calculPerimetre());
		System.out.println("Surface du Rectangle : " + rect.calculerSurface());
		// ---------------------------------------------------------------------

		rectLongeur = 0;
		rectLargeur = 0;
		System.out.println("*****Comparaison Rectangle*****");
		Rectangle rect2 = new Rectangle();
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
		rect2.setLongeur(rectLongeur);
		rect2.setLargeur(rectLargeur);
		sc.close();
		// test comparaison
		int rComparaison = 0;
		rComparaison = rect.comparaisonRectangle(rect2);
		if (rComparaison > 0)
			System.out.println("Le rectangle saisi est plus grand");
		else if (rComparaison == 0)
			System.out.println("Le rectangle saisi est egal");
		else
			System.out.println("Le rectangle saisi est plus petit");
		System.out.println("valeur de rComparaison : " + rComparaison);
	}
}
