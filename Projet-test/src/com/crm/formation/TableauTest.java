package com.crm.formation;

/**
 * @author nicolas
 *
 */
public class TableauTest {

	private static int[] tabInt;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tabInt = new int[5];
		
		int[] tabInt1 = new int[5];
		System.out.println(tabInt1[0]);
		
		tabInt1[0] = 5;
		System.out.println(tabInt1[1]);
		
		int tabInt2[] = {1, 2, 3, 4, 5};
		System.out.println(tabInt2[4]);
		
		int premierElement = tabInt2[0] = 10;
		System.out.println("1er élement modifier : " + premierElement);
		//Afficher la taille du tableau
		System.out.println("la taille du tableau est : " + tabInt2.length);
		
		for(int i=0; i< tabInt2.length; i++) {
			System.out.println("valuer de la case " + i + " du tableau");
			System.out.println(tabInt2[i]);
		}
		
			//deuxiéme méthodes
		for( int nb : tabInt2) {
				System.out.println(nb);
		}
	}

}
