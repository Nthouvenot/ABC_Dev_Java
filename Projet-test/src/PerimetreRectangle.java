import java.util.Scanner;

public class PerimetreRectangle
{
	
	PerimetreRectangle()
	{
		prevInstance = false;
		refaire = "O";
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	int perimetre;
	
	Calcul C = new Calcul();
		do
		{			
			if(prevInstance)
			{
				sc = new Scanner(System.in);
				System.out.println("Voulez voulez vous refaire un calcul ? (O/N)");
				refaire = sc.nextLine();
			}
			else
			{
				prevInstance = true;
			}
			if(refaire != "O" )
			{
				perimetre = C.calculperimetre();
				System.out.println("Le perimetre du rectangle est de " + perimetre);
			}
		}
		while(refaire != "N");
	}
		
	private static String refaire;
	private static boolean prevInstance;
	private static Scanner sc;
	

}
