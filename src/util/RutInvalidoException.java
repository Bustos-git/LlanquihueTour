package util;

/**
 * Excepcion personalidzada para manejar los errores de Rut
 */

public class RutInvalidoException extends Exception {

    /**Constructor de la excepcion
     *
     * @param mensaje mensaje que explica el error ocurrido
     */

public RutInvalidoException(String mensaje){
    super(mensaje);
}

}
