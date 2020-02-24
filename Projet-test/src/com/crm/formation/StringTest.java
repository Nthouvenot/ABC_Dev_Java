/**
 * 
 */
package com.crm.formation;


/**
 * @author nicolas
 *
 */
public class StringTest {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//concaténation
		String str = "Bonjour";
		String nom = "Nicolas";
		str = str + " " + nom;
		System.out.println(str);
		//longeur d'une chaine
		String str1 = "Java c'est génial !!!     ";
		System.out.println(str1.length());
		//Mettre en Majuscule
		System.out.println(str1.toUpperCase());
		//Suppression des blanc en début et fin de chaine
		String str2 = "   " + str1 + "    ";
		System.out.println(str2.trim());
		//Remplacer des caractére
		System.out.println(str1.replace('a', 'e'));
		//Extraction d'une sous chaine
		System.out.println(str1.substring(0,4));
		}
	
}
