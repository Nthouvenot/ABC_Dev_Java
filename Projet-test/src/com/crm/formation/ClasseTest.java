/**

@author Nicolas Thouvenot


@version 1.0
@param void
@return void

Clsse de test des op�rateurs
*/

package com.crm.formation;

public class ClasseTest
{
// D�claration d''une constante PI pour ratio du p�rim�tre d'un cercless	
public static final float PI=3.14f;

private int r;



public ClasseTest()
	{
		r = 0;
	}
	
	public int addition(int a, int b)
	{
		r=a+b;
		return r;
	}
	public int multiplication(int a, int b)
	{
		r=a*b;
		return r;
	}
	public int soustraction(int a, int b)
	{
		r=a-b;
		return r;
	}
	public int division(int a, int b)
	{
		r=a/b;
		return b;
	}
	
	public int GetResult()
	{
		return r;
	}
}
