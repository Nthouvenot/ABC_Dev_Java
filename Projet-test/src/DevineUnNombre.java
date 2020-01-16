import java.util.Scanner;

public class DevineUnNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombreAleatoire = 0, nbr = 0, nbrEssai = 0;
		boolean ok = false, erreur = false;
		String Scan;
		Scanner sc = new Scanner(System.in);
		nombreAleatoire = (int) (Math.random() * 99);
		System.out.println("Entrez un nombre compris entre 0 et 100");
		do {
			erreur = false;
			Scan = sc.nextLine();
			try {
				nbr = Integer.parseInt(Scan);
			} catch (Exception nfe) {
				System.out.println("Veuillez entrez un nombre !!!");
				erreur = true;
			}
			if (!erreur) {
				if (nbr != nombreAleatoire) {
					if (nbr > nombreAleatoire)
						System.out.println("C'est moins");
					else
						System.out.println("C'est plus");

					nbrEssai++;
				} else {
					System.out.println("Le bon nombre est bien " + nombreAleatoire);
					System.out.println("vous avez trouvez en " + nbrEssai + " coup");
					ok = true;
				}
			}
		} while (!ok);
		sc.close();
	}
};