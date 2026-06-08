package util;

/**
 * Excepcion personalizada para errores en la escritura de correo
 */

public class CorreoInvalidoException extends Exception{

    /**
     * Constructor de la excepcion
     * @param message explica el error ocurrido
     */
    public CorreoInvalidoException(String message) {
        super(message);
    }


}
