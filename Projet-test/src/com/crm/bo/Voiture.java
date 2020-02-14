/**
 * 
 */
package com.crm.bo;

/**
 * @author nicolas
 *
 */
public class Voiture {

	private String marque;
	private String couleur;
	private int nombreDePorte;
	private boolean boiteAuto;
	private int prix;
	private boolean enRoute;
	private int vitesse;
	private static final String TYPEROUTE[] = { "Ville", "Campagne", "DoubleVoie", "VoieExpress", "Autoroute" };
	private static final int VITESSE[] = { 50, 70, 90, 110, 130 };
	private boolean defini;

	/**
	 * return void
	 */
	public Voiture() {

		marque = "";
		couleur = "blanc";
		nombreDePorte = 5;
		boiteAuto = false;
		prix = 0;
		enRoute = false;
		vitesse = 0;
		defini = false;

	}

	/**
	 * @param marque
	 * @param couleur
	 * @param nombreDePorte
	 * @param boiteAuto
	 * @param prix
	 * @param enRoute
	 * @param vitesse
	 */
	public Voiture(String marque, String couleur, int nombreDePorte, boolean boiteAuto, int prix, boolean enRoute,
			int vitesse) {

		this.marque = marque;
		this.couleur = couleur;
		this.nombreDePorte = nombreDePorte;
		this.boiteAuto = boiteAuto;
		this.prix = prix;
		this.enRoute = enRoute;
		this.vitesse = vitesse;
	}

	/**
	 * @return marque
	 */
	public String getMarque() {

		return marque;
	}

	/**
	 * @param marque
	 */
	public void setMarque(String marque) {

		this.marque = marque;
	}

	/**
	 * @return couleur
	 */
	public String getCouleur() {

		return couleur;
	}

	/**
	 * @param couleur
	 */
	public void setCouleur(String couleur) {

		this.couleur = couleur;
	}

	/**
	 * @return nombreDePorte
	 */
	public int getNombreDePorte() {

		return nombreDePorte;
	}

	/**
	 * @param nombreDePorte
	 */
	public void setNombreDePorte(int nombreDePorte) {

		this.nombreDePorte = nombreDePorte;
	}

	/**
	 * @return boiteAuto
	 */
	public boolean getBoiteAuto() {

		return boiteAuto;
	}

	/**
	 * @param boiteAuto
	 */
	public void setBoiteAuto(boolean boiteAuto) {

		this.boiteAuto = boiteAuto;
	}

	/**
	 * @return prix
	 */
	public int getPrix() {

		return prix;
	}

	/**
	 * @param prix
	 */
	public void setPrix(int prix) {

		this.prix = prix;
	}

	/**
	 * @return enRoute
	 */
	public boolean getEnRoute() {

		return enRoute;
	}

	/**
	 * @param enRoute
	 */
	public void setEnRoute(boolean enRoute) {

		this.enRoute = enRoute;
	}

	/**
	 * @return vitesse
	 */
	public int getVitesse() {

		return vitesse;
	}

	/**
	 * @param vitesse
	 */
	public void setVitesse(int vitesse) {

		this.vitesse = vitesse;
	}

	/**
	 * no param no return
	 */
	public void demarrer() {

		if (!enRoute) {
			enRoute = true;
		}
	}

	/**
	 * @param vitesse
	 */
	public boolean accelerer(int vitesse, String typeRoute) {

		if(!enRoute || !defini) return false;
		int i = 0;
		while (!typeRoute.equalsIgnoreCase(TYPEROUTE[i])) {
			i++;
		}
		if ((this.vitesse += vitesse) <= VITESSE[i]) {
			;
			return true;
		} else {
			this.vitesse = VITESSE[i];
			return false;
		}
	}

	/**
	 * @param vitesse
	 */
	public void ralentir(int vitesse) {

			this.vitesse -= vitesse;
	}

	/**
	 * no param no return
	 */
	public void arret() {

		if (enRoute) {

			enRoute = false;
		}
	}

	public void klaxonner() {

		System.out.println("tututut");
	}

}
