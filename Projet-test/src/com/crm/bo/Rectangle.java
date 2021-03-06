package com.crm.bo;

/**
 * @author nicolas
 *
 */
/**
 * @author nicolas
 *
 */
public class Rectangle {

	// d�finition des attributs
	private float longeur;
	private float largeur;

	// d��finition des m�thodes

	/**
	 * constructeur sans param�tre initialise longeur et largeur a 0
	 */
	public Rectangle() {
		longeur = 0;
		largeur = 0;
	}

	/**
	 * constructeur initialise longeur et largeur
	 * 
	 * @param longeur
	 * @param largeur
	 */
	public Rectangle(int longeur, int largeur) {
		this.longeur = longeur;
		this.largeur = largeur;
	}

	/**
	 * @return longeur
	 */
	public float getLongeur() {

		return longeur;
	}

	/**
	 * @param longeur
	 */
	public void setLongeur(float longeur) {

		this.longeur = longeur;
	}

	/**
	 * @return lqrgeur
	 */
	public float getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur
	 */
	public void setLargeur(float largeur) {

		this.largeur = largeur;
	}

	/**
	 * @return void
	 */
	public float calculPerimetre() {

		return (longeur + largeur) * 2;
	}

	/**
	 * @Param String unite
	 * @return String
	 */
	public String calculPerimetre(String unite) {

		float resultat;
		resultat = (longeur + largeur) * 2;
		if (unite.contentEquals("cm")) {

			return Float.toString(resultat) + " cm";
		}
		else if(unite.contentEquals("mm")) {
			
			return Float.toString(resultat) + " mm";
		}
		else {
			
			return "";
		}
	}

	/**
	 * @return void
	 */
	public float calculerSurface() {

		return longeur * largeur;
	}

	/**
	 * @Param String unite
	 * @return String
	 */
	public String calculerSurface(String unite) {

		float resultat;
		resultat = longeur * largeur;
		if (unite.contentEquals("cm")) {

			return Float.toString(resultat) + " cm";
		}
		else if(unite.contentEquals("mm")) {
			
			return Float.toString(resultat) + " mm";
		}
		else {
			
			return "";
		}
	}
	
	// compare 2 rectangle egal renvoie 0, plus grand renvoie 1, plut petit renvoie
	// -1
	/**
	 * @param rect
	 * @return
	 */
	public int comparaisonRectangle(Rectangle rect) {

		float longeur2 = 0, largeur2 = 0;
		longeur2 = rect.getLongeur();
		largeur2 = rect.getLargeur();
		// System.out.println(this.longeur > longeur2);
		System.out.println(largeur > largeur2); // affichage test comparaison
		System.out.println(largeur); // affichage valeur de largeur de l'objet courant
		System.out.println(largeur2); // affichage valeur de largeur de l'objet a tester
		// System.out.println(this.longeur > longeur2 && this.largeur > largeur2);

//---------------------------------------------------------------
// Algo Origine
//		if (this.longeur > longeur2 && this.largeur > largeur2) {
//			return 1;
//		}
//		else if (this.largeur == largeur2) {
//			return 1;
//		}
//		else if (this.largeur < largeur2) {
//			return -1;
//		}
//		else {
//			if (this.longeur == longeur2 && this.largeur == largeur2) {
//				return 0;
//			}
//			else if (this.largeur > largeur2) {
//				return 1;
//			}
//			else if (this.largeur < largeur2) {
//				return -1;
//			}
//			else {
//				if (this.longeur < longeur2 && this.largeur < largeur2) {
//					return -1;
//				}
//				else if (this.largeur == largeur2) {
//					return -1;
//				}
//				else {
//					return 1;
//				}
//			}
//		}
//---------------------------------------------------------------

		if (this.longeur == longeur2 && this.largeur == largeur2) {

			return 0;
		} else {
			if (this.longeur > longeur2) {
				if (this.largeur > largeur2 || this.largeur == largeur2) {

					return 1;
				} else
					return -1;
			}
		}
		return 0;
	}
}
