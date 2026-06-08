package model;

public class Proveedor extends Persona {
    //Atributo Proveedor
    private String area;

    /**
     *
     * @param nombre nombre de la persona/empresa
     * @param rut rut de la persona/empresa
     * @param correo correo de la persona/empresa
     * @param telefono telefono de la persona/empresa
     * @param direccion direccion de la persona/empresa
     * @param area area en la que se desempena (cocina, hoteleria, turismo, cultural,etc)
     */
    public Proveedor(String nombre, Rut rut, Correo correo, String telefono, Direccion direccion, String area) {
        super(nombre, rut, correo, telefono, direccion);
        this.area = area;
    }

    /**Muestra la informacion completa del Proveedor + el area
     *
     * @return informacion completa del proveedor
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nArea: " + area;
    }
}
