/**

@author Nicolas Thouvenot


@version 1.0
@param void
@return void

test du retour des m�thodes
*/


package com.crm.formation;

public class InstructionReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre = 10;
		afficherListeNombre(nombre);
	}

	public static void afficherListeNombre(int nb) {
		System.out.println("D�but m�thode aficherListeNombre");

		for (int i = 0; i < nb; i++) {
			System.out.println(i);
			if (i == 5)
				return;
		}
		System.out.println("Fin m�thode afficherListeNombre");
	}
}
