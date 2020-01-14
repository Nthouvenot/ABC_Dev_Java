package com.crm.formation;

import java.util.Scanner;

public class NoteExamins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int note = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Entrez votre note ");
			note = sc.nextInt();
			if (note < 0 || note > 20) {
				System.out.println("Erreur note invalide");
			}
		} while (note < 0 || note > 20);
		sc.close();
		if (note >= 0 && note < 8)
			System.out.println("Ajourné");
		else if (note >= 8 && note < 10)
			System.out.println("Rattrapage");
		else if (note >= 12 && note < 14)
			System.out.println("Mention Assez Bien");
		else if (note >= 14 && note < 16)
			System.out.println("Mention Bien");
		else
			System.out.println("Mention Trés Bien");
	}
}