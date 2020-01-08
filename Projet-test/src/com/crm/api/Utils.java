package com.crm.api;
import java.lang.Math;

public class Utils {
	public static final float PI = 3.14116f;
	public static final String couleur = "bleu" ;
	
	public static int somme(int a, int b)
	{
		int r;
		r=a+b;
		return r;
	}
	
	public static void affichemessage(String texte)
	{
		System.out.println(texte);
	}

	public static float surfacecercle(int rayon)
	{
		float s=PI + (float) Math.sqrt(rayon);
		return s;
	}
	
	
}
