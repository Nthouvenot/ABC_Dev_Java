/**


@author Nicolas Thouvenot
@version 1.0
@param void
@return void

Classe cr�ent un carr� avec la dimension d'un cot�
*/




import java.util.Scanner;

public class DessinerUnCarr� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int longeur = 0, i = 0, i2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une longeur");
		longeur = sc.nextInt();
		sc.close();
		System.out.println("Le carr� de longeur " + longeur + " :");
		for (i2 = 0; i2 < longeur; i2++) {
			for (i = 0; i < longeur; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
