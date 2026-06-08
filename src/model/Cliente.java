package model;

public class Cliente extends Persona {
    //Atributo cliente
    private String tipoCliente;

    /**
     *
     * @param nombre nombre del cliente
     * @param rut rut del cliente
     * @param correo correo del cliente
     * @param telefono telefono del cliente
     * @param direccion direccion del cliente
     * @param tipoCliente tipo de cliente (frecuente, nuevo)
     */

    public Cliente(String nombre, Rut rut, Correo correo, String telefono, Direccion direccion, String tipoCliente) {
        super(nombre, rut, correo, telefono, direccion);
        this.tipoCliente = tipoCliente;
    }

    /**Muestra la informacion completa + la info de cliente
     *
     * @return informacion del cliente
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de Cliente: " + tipoCliente;
    }



}
