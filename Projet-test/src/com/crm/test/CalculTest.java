package com.crm.test;
/**


@author Nicolas Thouvenot
@version 1.0
@param void
@return void

Test calcul + constante
*/

import com.crm.api.Utils;

/**
 * @author nicolas
 *
 */
public class CalculTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Utils.somme(4, 5));
		System.out.println("Le ciel est " + Utils.couleur);
		System.out.println(Utils.surfacecercle(3));
	}

}
