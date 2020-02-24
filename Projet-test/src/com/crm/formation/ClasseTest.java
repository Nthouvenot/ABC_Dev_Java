/**

@author Nicolas Thouvenot


@version 1.0
@param void
@return void

Clsse de test des opérateurs
*/

package com.crm.formation;

/**
 * @author nicolas
 *
 */
public class ClasseTest
{
// Déclaration d''une constante PI pour ratio du périmétre d'un cercless	
public static final float PI=3.14f;

private int r;



	/**
	* Constructor with noParam 
	*/
	public ClasseTest()
	{
		r = 0;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return r
	 */
	public int addition(int a, int b)
	{
		r=a+b;
		return r;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return r
	 */
	public int multiplication(int a, int b)
	{
		r=a*b;
		return r;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return r
	 */
	public int soustraction(int a, int b)
	{
		r=a-b;
		return r;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return r
	 */
	public int division(int a, int b)
	{
		r=a/b;
		return b;
	}
	
	/**
	 * @return r
	 */
	public int GetResult()
	{
		return r;
	}
}
