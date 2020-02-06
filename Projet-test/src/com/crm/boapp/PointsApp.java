/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Points;

/**
 * @author nicolas
 *
 */
public class PointsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Points pt = new Points(10, 4);
		Points pt2 = new Points(40, 4);

		System.out.print("soit un point au coordonnees " + "" + pt.getX() + "," + pt.getY());
		System.out.println(" et un autre point au coordonnees " + pt2.getX() + "," + pt2.getY());
		System.out.println("la distance entre les deux point est de " + pt.calculEntre2Points(pt2));
	}

}
