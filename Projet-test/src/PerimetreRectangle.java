import java.util.Scanner;



public class PerimetreRectangle
{
	private static String refaire;
	private static boolean prevInstance;
	private static Scanner sc;

	PerimetreRectangle()
	{
		prevInstance = false;
		refaire="O";
		sc = new Scanner(System.in);
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int perimetre;
		Calcul C = new Calcul();			
		do
		{
			if(prevInstance == true)
			{	
				System.out.println("Voulez voulez vous refaire un calcul ? (O/N)");
				refaire = sc.nextLine();
			}
			else
			{
				prevInstance = true;
			}
		perimetre = C.calculperimetre();
		System.out.println("Le perimetre du rectangle est de " + perimetre);
		}
		while(refaire == "O");
	}
	protected void finalize()
	{
		sc.close();
	}
}