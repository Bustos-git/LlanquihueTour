package model;

public class Empleado extends Persona {
    //atributo empleado
    private String cargo;


    /**
     *
     * @param nombre nombre del empleado
     * @param rut rut del empleado
     * @param correo correo del empleado
     * @param telefono telefono del empleado
     * @param direccion direccion del empleado
     * @param cargo cargo que ejerce en la agencia
     */
    public Empleado(String nombre, Rut rut, Correo correo, String telefono, Direccion direccion, String cargo) {
        super(nombre, rut, correo, telefono, direccion);
        this.cargo = cargo;
    }

    /**Muestra la informacion completa del Empleado + su cargo
     *
     * @return informacion completa del empleado
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: " + cargo;
    }
}
