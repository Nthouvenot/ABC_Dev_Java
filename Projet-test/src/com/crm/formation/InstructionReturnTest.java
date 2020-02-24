/**

@author Nicolas Thouvenot


@version 1.0
@param void
@return void

test du retour des méthodes
*/


package com.crm.formation;

/**
 * @author nicolas
 *
 */
public class InstructionReturnTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre = 10;
		afficherListeNombre(nombre);
	}

	/**
	 * @param nb
	 */
	public static void afficherListeNombre(int nb) {
		System.out.println("Début méthode aficherListeNombre");

		for (int i = 0; i < nb; i++) {
			System.out.println(i);
			if (i == 5)
				return;
		}
		System.out.println("Fin méthode afficherListeNombre");
	}
}
