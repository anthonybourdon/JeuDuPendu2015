package JeuDuPendu02;

/*
 * 
 * TODO: chercher dans la doc Java l'impacte
 * du "public" de la signature de méthode dans une "interface".
 */
public interface LettreTrouveeStrategy
{

	public int remplaceLettre (
        	String lettre,
        	String motAdeviner,
        	StringBuffer motEncours
        );

}
