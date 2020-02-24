/**

@author Nicolas Thouvenot
@version 1.0
@param aucun
@return void

Classe librairie de fonction de calcul divers
*/







package com.crm.api;
import java.lang.Math;

/**
 * @author nicolas
 *
 */
public class Calcul
{
	private int resultat;
	private double dResultat;
	
	/**
	 * Constructor with noParam
	 */
	public Calcul()
	{
		resultat = 0;
		dResultat = 0;
	}
	
	/**
	 * @param rayon
	 * @param angle
	 * @return dResultat
	 */
	public double calculSecteurCirculaire(double rayon, int angle)
	{
		dResultat = Math.pow(Math.PI, 2)* ((double)angle / 360);
		return dResultat;
	}
	
	/**
	 * @param longeur
	 * @param largeur
	 * @return resultat
	 */
	public int calculperimetre(int longeur, int largeur)
	{		
		resultat = (longeur + largeur)*2;
		return resultat;
		
	}
	
	/**
	 * @param rayon
	 * @return dResultat
	 */
	public double calculVolumeCercle(double rayon)
	{
		dResultat=((4*Math.PI)* Math.pow(rayon, 3))/3;
		return dResultat;
	}
}