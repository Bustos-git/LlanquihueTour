package app;

import model.*;
import util.CorreoInvalidoException;
import util.RutInvalidoException;


public class Main {
    public static void main(String[] args) {

        //CLIENTE

        try {
            Rut rut1 = new Rut("20.378.357-4");
            Correo correo1 = new Correo("juan@gmail.com");
            Direccion direccion1 = new Direccion("Avenida Costanera",
                    "Puerto Montt", "Los Lagos", 1250);

            Cliente cliente1 = new Cliente("Juan Ramirez", rut1, correo1, "+56912345678",
                    direccion1, "frecuente");

            System.out.println(cliente1);
        } catch (RutInvalidoException e) {
            System.out.println("Error en el RUT: " + e.getMessage());
        } catch (CorreoInvalidoException e) {
            System.out.println("Error en correo: " + e.getMessage());
        }

        //EMPLEADO

        try {
            Rut rut2 = new Rut("27.890.234-k");
            Correo correo2 = new Correo("fer.parra34@gmail.com");
            Direccion direccion2 = new Direccion("Echenique",
                    "Llanquihue", "Los Lagos", 983);

            Empleado empleado1 = new Empleado("Fernanda Parra", rut2, correo2, "+56945693646",
                    direccion2, "Guia turistico");

            System.out.println(empleado1);
        } catch (RutInvalidoException e) {
            System.out.println("Error en el RUT: " + e.getMessage());
        } catch (CorreoInvalidoException e) {
            System.out.println("Error en correo: " + e.getMessage());
        }

        //PROVEEDOR

        try {
            Rut rut3 = new Rut("78.456.784-5");
            Correo correo3 = new Correo("hotelelsur@gmail.com");
            Direccion direccion3 = new Direccion("Parral",
                    "Llanquihue", "Los Lagos", 2058);

            Proveedor proveedor1 = new Proveedor("Hotel El Sur", rut3, correo3, "+56925387369",
                    direccion3, "hoteleria");

            System.out.println(proveedor1);
        } catch (RutInvalidoException e) {
            System.out.println("Error en el RUT: " + e.getMessage());
        } catch (CorreoInvalidoException e) {
            System.out.println("Error en correo: " + e.getMessage());
        }

    }
}