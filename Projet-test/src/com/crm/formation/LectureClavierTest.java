/**

@author Nicolas Thouvenot



@version 1.0
@param void
@return void

Test du scanner classe qui gére les entrées clavier
*/


package com.crm.formation;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class LectureClavierTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez un texte");
		str = sc.nextLine();
		System.out.print("valeur de la chaine ");
		System.out.println(str);
		sc.close();
	}

}