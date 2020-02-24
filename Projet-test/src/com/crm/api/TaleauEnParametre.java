package com.crm.api;

/**
 * @author nicolas
 *
 */
public class TaleauEnParametre {

	/**
	 * @param args
	 */
	public void main(String[] args) {
		int tableau[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		afficherTableau(tableau);
	}

	/**
	 * @param tabInt
	 */
	public static void afficherTableau(int tabInt[]) {
		for (int nb : tabInt) {
			System.out.println(nb);
		}
	}
}
