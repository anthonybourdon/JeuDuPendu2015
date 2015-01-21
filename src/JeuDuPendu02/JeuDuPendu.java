package JeuDuPendu02;

public class JeuDuPendu {

	public static void main(String[] args) {

		Joueur j = new Joueur();
		RegleDuJeu rdj = new RegleDuJeu( 5 );
		Affichage aff = new Affichage();
		String mot = "Pouet" ;
		LettreTrouveeStrategy lts = null; //new AnthonyStrategy();

		Partie partie = new Partie(lts, j);

		partie.nouvellePartie(rdj, mot);

		do {
		    aff.dessine(partie);
		    partie.coupSuivant();
		    
		} while(! partie.isTerminee());

		aff.dessine(partie);

	}
}
