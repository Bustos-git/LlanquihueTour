package model;

import java.sql.SQLOutput;

/**
 * Representa a una persona parte de Llanquihue Tour, sea cliente o empleado
 */

public class Persona {

//Atributos

    private String nombre;
    private Rut rut;
    private Correo correo;
    private String telefono;
    private Direccion direccion;

    /**
     * Constructor de la clase Persona
     *
     * @param nombre nombre de la persona/empresa
     * @param rut rut de la persona/empresa
     * @param correo correo electronico de contacto
     * @param telefono telefono de contacto
     * @param direccion direccion de la persona/empresa
     */


    public Persona(String nombre, Rut rut, Correo correo, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return "===== DATOS REGISTRADOS =====" +
                "\nNombre: "+ nombre +
                "\nRut: " + rut.getNumero() +
                "\nCorreo: " + correo.getCorreo() +
                "\nTelefono: " + telefono +
                "\nDireccion: " + direccion.mostrarDireccion();
    }









}
