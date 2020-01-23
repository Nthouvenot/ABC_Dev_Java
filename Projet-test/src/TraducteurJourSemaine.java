/**

@author Nicolas Thouvenot

@version 1.0
@param void
@return void

Converti les jours de la semaine vers les anglais
*/

import java.util.Scanner;

public class TraducteurJourSemaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jourSemaineFr[] = { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" };
		String jourSemaineEn[] = { "monday", "tuesday", "wenesday", "thursday", "fryday", "saterday", "sunday" };
		String jour = "";
		int i = 0;
		boolean erreur = false;

		System.out.println("Les jours de la semaine en français");
		for (String chaine : jourSemaineFr) {
			System.out.println(chaine);
		}
		System.out.println("Les jours de la semaine en anglais");
		for (int i2 = 0; i2 < jourSemaineEn.length; i2++) {
			System.out.println(jourSemaineEn[i2]);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un jours en français");
		jour = sc.nextLine();
		while (jour.compareToIgnoreCase(jourSemaineFr[i])!=0) {
			i++;
			if (i == (jourSemaineFr.length)) {
				erreur = true;
				break;
			}
		}
		if (erreur == true)
			System.out.println("erreur le mots saisi n'est pas un jour de la semaine");
		else
			System.out.println(jour + " en anglais est " + jourSemaineEn[i]);
		sc.close();
	}

}
