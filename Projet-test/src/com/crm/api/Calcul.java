import java.util.Scanner;

public class Calcul
{
	
	private Scanner sc;
	private int longeur;
	private int largeur;
	private int resultat;
	
	public Calcul()
	{
		longeur = 0;
		largeur = 0;
		resultat = 0;
		sc = new Scanner(System.in);
	}
	
	public int calculperimetre()
	{
		System.out.println("Entrez la longeur du rectangle");
		longeur = sc.nextInt();
		//sc.reset();
		System.out.println("Entrez la largeur du rectangle");
		largeur = sc.nextInt();
		resultat = (longeur + largeur)*2;
		return resultat;
	}	
	
	protected void finalize()
	{
		sc.close();
	}
}