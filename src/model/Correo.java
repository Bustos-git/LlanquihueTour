package model;

import util.CorreoInvalidoException;


public class Correo {

    private String correo;

    public Correo(String correo) throws CorreoInvalidoException {
        if (validarCorreo(correo)){
            this.correo = correo;
        } else {
            throw new CorreoInvalidoException("Correo invalido");
        }
    }

    public boolean validarCorreo(String correo) {
        if (correo.contains("@") && correo.contains(".")) {
            int posicionArroba = correo.indexOf("@");
            int posicionPunto = correo.lastIndexOf(".");

            if (posicionArroba > 0 && posicionPunto > posicionArroba) {
                return true;
            }
        } return false;
    }

    public String getCorreo(){
        return correo;
    }

}
