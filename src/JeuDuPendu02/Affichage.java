package JeuDuPendu02;

import static java.lang.System.out;

public class Affichage {

	public void dessine(Partie partie) {

		out.println("Joueur: "+partie.getJoueur().getName());
		out.println("Partie terminée: " +partie.isTerminee() );
		//out.println("Mot en cours: "+partie.getMotEnCours() );
	}

}
