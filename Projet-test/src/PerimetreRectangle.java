import java.util.Scanner;
import com.crm.api.Calcul;
public class PerimetreRectangle
{
	private static Scanner sc;
	private static int longeur, largeur, angle;
	private static double rayon;

	PerimetreRectangle()
	{
		longeur = 0;
		largeur = 0;
		rayon = 0;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		short choix = 0;
		boolean ok = true;
			Calcul C = new Calcul();
			sc = new Scanner(System.in);
			do
			{
				choix = menu();
				switch(choix)
				{
				case 1:
					{
						saisirRect();
						System.out.println("Le périmétre du rectangle est : " + C.calculperimetre(longeur, largeur));
						break;
					}
				case 2:
					{
						saisirSect();
						System.out.println("L'aire du secteur circulaire est de : " + C.calculSecteurCirculaire(rayon, angle));
						break;
					}
				case 3: ok=false; break;
				}
			}
			while(ok);
	}
	
	private static short menu()
	{
		short choix;
		System.out.println("Menu :");
		System.out.println("1) Calculer perimétre rectangle");
		System.out.println("2) Calculer aire secteur ciculaire");
		System.out.println("3) Quitter");
		choix = sc.nextShort();
		return choix;
	}
	
	private static void saisirRect()
	{
		System.out.println("Entrez la longeur du rectangle");
		longeur = sc.nextInt();
		System.out.println("Entrez la largeur du rectangle");
		largeur = sc.nextInt();
	}
	
	private static void saisirSect()
	{
		System.out.println("Entrez le rayon du cercle");
		rayon = sc.nextDouble();
		System.out.println("Entrez l'angle du cercle");
		angle = sc.nextInt();
	}
	
	protected void finalize()
	{
		sc.close();
	}
}