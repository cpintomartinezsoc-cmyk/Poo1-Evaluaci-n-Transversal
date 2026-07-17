package model;

public class Proveedor extends Persona {

    private String empresa;

    public Proveedor(Rut rut,
                     String nombre,
                     String telefono,
                     Direccion direccion,
                     Tarjeta tarjeta,
                     String empresa) {

        super(rut, nombre, telefono, direccion, tarjeta);

        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("===== PROVEEDOR =====");
        super.mostrarDatos();
        System.out.println("Empresa: " + empresa);

    }

    @Override
    public String toString() {

        return super.toString() +
                "\nEmpresa=" + empresa;

    }

}
