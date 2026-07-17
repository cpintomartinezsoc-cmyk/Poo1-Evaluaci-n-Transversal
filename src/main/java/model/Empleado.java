package model;

public class Empleado extends Persona {

    private String cargo;

    public Empleado(Rut rut,
                    String nombre,
                    String telefono,
                    Direccion direccion,
                    Tarjeta tarjeta,
                    String cargo) {

        super(rut, nombre, telefono, direccion, tarjeta);

        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("===== EMPLEADO =====");
        super.mostrarDatos();
        System.out.println("Cargo: " + cargo);

    }

    @Override
    public String toString() {

        return super.toString() +
                "\nCargo=" + cargo;

    }

}