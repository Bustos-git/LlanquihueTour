package model;

/**
 * Clase utilizada como parte de la composicion dentro de Persona
 * Representa la direccion fisica de las personas parte de Llanquihue Tour
 */
public class Direccion {

    //Atributos

    private String calle;
    private String ciudad;
    private String region;
    private int numero;

    /**
     * Constructor de la clase direccion.
     *
     * @param calle nombre de la calle
     * @param ciudad nombre de la ciudad donde vive la persona
     * @param region region donde vive la persona
     * @param numero numero de la direccion
     */


    public Direccion(String calle, String ciudad, String region, int numero) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Muestra la direccion completa de la persona ingresada
     * @return direccion formateada como texto
     */

    public String mostrarDireccion(){
        return calle + " #" + numero + ", " + ciudad + ", Region de " + region;
    }


}
