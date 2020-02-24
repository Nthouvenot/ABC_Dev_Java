package com.crm.api;


/**
 * @author nicolas
 *
 */
public class ArgumentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La taille du tableau est : " + args.length);
		
		for(String str : args) {
			System.out.println(str);
		}
	}

}
