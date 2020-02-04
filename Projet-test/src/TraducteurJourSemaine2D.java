
/**

@author Nicolas Thouvenot

@version 1.0
@param void
@return void

Converti les jours de la semaine vers les anglais
*/

import java.util.Scanner;

public class TraducteurJourSemaine2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jourSemaine[][] = { { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" },
				{ "monday", "tuesday", "wenesday", "thursday", "fryday", "saterday", "sunday" },
				{ "monstag", "dienstag", "mittwoch", "donnerstag", "freitag", "samstag", "sonntag" } };
		String jour = "", langueSource = "", langueDestination = "";
		int i = 0, langSource = 0, langDestination = 0;
		boolean erreur = false;

		System.out.println("Les jours de la semaine en français");
		for (int i1 = 0; i1 < jourSemaine[0].length; i1++) {
			System.out.println(jourSemaine[0][i1]);
		}
		System.out.println("Les jours de la semaine en anglais");
		for (int i2 = 0; i2 < jourSemaine[0].length; i2++) {
			System.out.println(jourSemaine[1][i2]);
		}
		System.out.println("Les jours de la semaine en allemand");
		for (int i2 = 0; i2 < jourSemaine[0].length; i2++) {
			System.out.println(jourSemaine[2][i2]);
		}
		
		Scanner sc = new Scanner(System.in);
		// saisir langue source
		System.out.println("Entrez la langue d'origine");
		langueSource = sc.nextLine();
		if (langueSource.compareToIgnoreCase("Francais") == 0)
			langSource = 0;
		else if (langueSource.compareToIgnoreCase("Anglais") == 0)
			langSource = 1;
		else if (langueSource.compareToIgnoreCase("Allemand") == 0)
			langSource = 2;
		else {
			System.out.println("Langue inconnue");
			langSource = 0;
		}
		// saisie langue destinationlire jour
		System.out.println("Entrez la langue de destination");
		langueDestination = sc.nextLine();
		if (langueDestination.compareToIgnoreCase("Francais") == 0)
			langDestination = 0;
		else if (langueDestination.compareToIgnoreCase("Anglais") == 0)
			langDestination = 1;
		else if (langueDestination.compareToIgnoreCase("Allemand") == 0)
			langDestination = 2;
		else {
			System.out.println("Langue inconnue");
			langDestination = 0;
		}
		//System.out.println("N° langue source :" + langSource);
		//System.out.println("N° langue destination :" + langDestination);

		// saisie du jour dans la langue d'origine
		System.out.print("Entrez un jours en ");
		if (langueSource.compareToIgnoreCase("Francais") == 0) {
			System.out.println("Francais");
		} else if (langueSource.compareToIgnoreCase("Anglais") == 0) {
			System.out.println("Anglais");
		} else if (langueSource.compareToIgnoreCase("Allemand") == 0) {
			System.out.println("Allemand");
		}
		jour = sc.nextLine();
		// cherche le jour saisi dans le tableau dans la langue indiqué
		try {
			for (i = 0; jour.compareToIgnoreCase(jourSemaine[langSource][i]) != 0; i++) {

			}
		} catch (Exception e) {
			erreur = true;
		}
		// System.out.println("Valeur de i : " + i);
		// convertion vers la langue de destination
		if (erreur == true)
			System.out.println("erreur le mots saisi n'est pas un jour de la semaine");
		else {
			if (langDestination == 0) {
				System.out.println(jour + " en Francais est : " + jourSemaine[0][i]);
			} else if (langDestination == 1) {
				System.out.println(jour + " en anglais est : " + jourSemaine[1][i]);
			} else if (langDestination == 2) {
				System.out.println(jour + " en Allemand est : " + jourSemaine[2][i]);
			} else
				System.out.println("Something was wrong ...");
		}
		sc.close();
	}

}
