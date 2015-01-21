package JeuDuPendu01;

public class JeuDuPendu01 {

	public static void main(String[] args) {

		// Initialise le moteur de jeu
		JeuDuPendu01 jdp = new JeuDuPendu01();
		// Lance le jeu
		jdp.jouePartie();
	}

	/**
	 * Le fournisseur utilisé par le jeu
	 */
	FournisseurDeMots fdm ;

	/**
	 * Le constructeur du jeu du pendu
	 */
	public JeuDuPendu01()
	{
		// Demande un fournisseur de mots à la Fabrique (Factory) de fournisseur de mots
		// et le stocke dans la propriété (attribut) dédiée à cet usage
		this.fdm = FournisseurDeMotsFactory.create( FournisseurDeMotsFactory.Fdm_Type.BIDON);
	}

	/**
	 * Méthode qui fait "tourner" le jeu
	 */
	public void jouePartie()
	{
		String mot = this.fdm.getMot();
		
		System.out.println( mot);
		// ...
	}
}

/**
 * Cette classe contruit les fournisseurs de mots,
 * ce qui permet au Jeu de ne pas se soucier des implémentations techniques
 * 
 */
class FournisseurDeMotsFactory {

	/*)
	 * On pourrait utiliser un ensemble de constantes (en Php).
	 * Le type enum permet de regrouper des constantes par domaine.
	 */
	static enum Fdm_Type{
		/**
		 * Utile pour tester le programme
		 */
		BIDON,
		FICHIER,
		BDD
	};

	/**
	 * Cette méthode construit (new) le fournisseur de mots demandé par le jeu.
	 * Elle en cache les détails d'implémentation.
	 * 
	 * C'est une méthode "static" car elle n'agit un objet (une instance) de la classe FournisseurDeMotsFactory.
	 * 
	 * @return
	 */
	public static FournisseurDeMots create(Fdm_Type fdmType)
	{
		FournisseurDeMots fdm = null;
		switch( fdmType )
		{
		case BIDON:
			fdm = new FournisseurDeMotsBidon ();
			break;
		default:
			// Nous écrirons les autres implémentations plus tard.
			throw new RuntimeException("NOT (YET) IMPLEMENTED");
		}
		return fdm ;
	}

}

/**
 * Pas besoin besoin d'une classe puisqu'il n'y a pas de code à écrire.
 * (pas de code commun à tous les fournisseurs de mots).
 *
 */
interface FournisseurDeMots {
	public String getMot();
}

/**
 * Un fournisseur de mots "Bidon" qui nous permet d'avancer sur les autres sujets
 * sans partir en "tunnel" dans l'implémentation fichiers ou SQL.
 */
class FournisseurDeMotsBidon implements FournisseurDeMots {

	@Override
	public String getMot() {
		return "Abracadabra" ;
	}
	
}
