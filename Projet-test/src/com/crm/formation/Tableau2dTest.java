/**
 * 
 */
package com.crm.formation;

/**
 * @author nicolas
 *
 */
public class Tableau2dTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//d�claration d'un tableau a 2 dimension
		int [][] tab2d = new int[2][3];
		//d�claration avec init
		int [][] tab2dim = {
				{1,3,5}, {0,2,4}
				};
		
	//acc�s au �l�ments
	System.out.println("�l�ments [0][0] :" + tab2dim[0][0]);
	System.out.println("�l�ments [1][2] :" + tab2dim[1][2]);
	
	//modifications d'un �l�ments
	tab2dim[1][2] = 6;
	System.out.println("�l�ments [1][2] apr�s modif : " + tab2dim[1][2]);
	
	//Nombres de colonnes
	System.out.println("Nombres colonnes : " + tab2dim[0].length);
	
	//parcours du tableau
	for(int i=0;i<tab2dim.length;i++) {
		for(int j=0;j<tab2dim[i].length;j++) {
			System.out.println("�l�ments [" + i + "][" + j + "]" + tab2dim[i][j]);
		}
	}
	System.out.println("\n");
	//D�claration d'un tableau a 2 imension (colonnes variables)
	int [][] tab2Var1 = new int [3][];
	tab2Var1[0] = new int[1];
	tab2Var1[1] = new int[2];
	tab2Var1[2] = new int[1];
	tab2Var1[0][0] = 1;
	tab2Var1[1][0] = 1;
	
	}

}
