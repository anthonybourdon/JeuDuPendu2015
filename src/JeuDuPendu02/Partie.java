package JeuDuPendu02;

public class Partie {

	private Joueur joueur;
	private String mot;
	private int erreurs;
	private RegleDuJeu rdj;
	private final LettreTrouveeStrategy lts;

	public Partie(LettreTrouveeStrategy lts, Joueur j) {
		this.lts = lts;
		this.joueur = j;
	}

	public void nouvellePartie(RegleDuJeu rdj, String mot) {
		this.rdj = rdj;
		this.mot = mot;
	}

	public void coupSuivant() {

		if (this.rdj == null || this.mot == null) {
			throw new IllegalArgumentException(
				"Vous devez lancer une nouvelle partie (cf. nouvellePartie()");
		}

		String lettre = this.getJoueur().getLettre();

		if (!this.mot.contains(lettre)) {
			erreurs++;
		}

		/*
		 * 
		 * int JeuDuPenduStrategy.coupSuivant( String lettre, String
		 * motAdeviner, StringBuffer motEncours, ) ... this.erreurs ++ }
		 */

	}

	public boolean isTerminee() {

		if (this.erreurs >= this.rdj.getErreursMax())
			return true;

		return false;
	}

	/**
	 * @return the joueur
	 */
	public Joueur getJoueur() {
		return joueur;
	}

	public String getMotEnCours() {
		// TODO Auto-generated method stub
		return null;
	}

}
