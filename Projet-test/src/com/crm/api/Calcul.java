package com.crm.api;
import java.lang.Math;

public class Calcul
{
	private int resultat;
	private double dResultat;
	
	public Calcul()
	{
		resultat = 0;
		dResultat = 0;
	}
	
	public double calculSecteurCirculaire(double rayon, int angle)
	{
		dResultat = Math.sqrt(Math.PI)* ((double)angle / 360);
		return dResultat;
	}
	
	public int calculperimetre(int longeur, int largeur)
	{		
		resultat = (longeur + largeur)*2;
		return resultat;
	}

}