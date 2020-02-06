/**
 * 
 */
package com.crm.bo;

/**
 * @author nicolas
 *
 */


public class Points {
	
	
	private int x;
	private int y;

	/**
	 *Constructeur inialise x et y a 0
	 */
	public Points() {
		
		x=0;
		y=0;
		
	}

	/**
	 * Constructeur avec paramétres
	 * @param x
	 * @param y
	 */
	public Points(int x, int y) {
		
		this.x=x;
		this.y=y;
	}
	

	/**
	 * @return x
	 */
	public int getX() {
		
		return x;
	}
	
	/**
	 * @param x
	 */
	public void setX(int x) {
		
		this.x=x;
	}
	
	/**
	 * @return y
	 */
	public int getY() {
		
		return y;
	}
	
	/**
	 * @param y
	 */
	public void getY(int y) {
		
		this.y=y;
	}
	
	/**
	 * @return x et y 
	 */
	public int[] getOrdonne() {
		
		int[] tabOrdonnee = {x, y};
		return tabOrdonnee;
	}
	
	/**
	 * @param x
	 * @param y
	 */
	public void setOrdonnee(int x, int y) {
		
		this.x=x;
		this.y=y;
	}
	
	/**
	 * @param pt
	 * @return resultat
	 */
	public int calculEntre2Points(Points pt) {
				
		return (int) Math.sqrt((int) Math.pow((pt.x-x), 2) + (int) Math.pow(pt.getY()-y, 2));
	}
}
