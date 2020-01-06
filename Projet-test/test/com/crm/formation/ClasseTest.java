package com.crm.formation;

public class ClasseTest
{
	
	
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
	
	ClasseTest(int nbr1, int nbr2)
	{
		a=nbr1;
		b=nbr2;
	}
	private
	int a;
	int b;
	int r;
}
