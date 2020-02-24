/**

@author Nicolas Thouvenot
@version 1.0
@param aucun
@return void

Classe d'utilitaire utiles
*/





package com.crm.api;
import java.lang.Math;

/**
 * @author nicolas
 *
 */
public class Utils {
	public static final float PI = 3.14116f;
	public static final String couleur = "bleu" ;
	
	/**
	 * @param a
	 * @param b
	 * @return r
	 */
	public static int somme(int a, int b)
	{
		int r;
		r=a+b;
		return r;
	}
	
	/**
	 * @param texte
	 */
	public static void affichemessage(String texte)
	{
		System.out.println(texte);
	}

	/**
	 * @param rayon
	 * @return s
	 */
	public static float surfacecercle(int rayon)
	{
		float s=PI + (float) Math.sqrt(rayon);
		return s;
	}
	
	
}