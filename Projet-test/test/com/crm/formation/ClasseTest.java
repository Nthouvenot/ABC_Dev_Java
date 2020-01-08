package com.crm.formation;

public class ClasseTest
{
private
	
	int r;
	
	ClasseTest()
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
