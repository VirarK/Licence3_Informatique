package exceptions.negatifException;

/**
 * @author Clement Caumes
 * @version 1.0
 * Exception NegatifException
 */
public class NegatifException extends RuntimeException {

	/**
	 * Constructeur NegatifException
	 */
	public NegatifException() {
		super("Le montant donné est négatif");
	}

}

