package model;

public class Persona implements Registrable {

    protected Rut rut;
    protected String nombre;
    protected String telefono;

    /**
     * Composición
     */
    protected Direccion direccion;
    protected Tarjeta tarjeta;

    public Persona(Rut rut,
                   String nombre,
                   String telefono,
                   Direccion direccion,
                   Tarjeta tarjeta) {

        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public void registrar() {
        System.out.println(nombre + " registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {

        System.out.println(this);

    }

    @Override
    public String toString() {

        return "Persona{" +
                "\nrut=" + rut +
                ",\nnombre='" + nombre + '\'' +
                ",\ntelefono='" + telefono + '\'' +
                ",\ndireccion=" + direccion +
                ",\ntarjeta=" + tarjeta +
                "\n}";
    }

}
