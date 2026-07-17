package model;

public class Cliente extends Persona {

    private int puntos;

    public Cliente(Rut rut,
                   String nombre,
                   String telefono,
                   Direccion direccion,
                   Tarjeta tarjeta,
                   int puntos) {

        super(rut, nombre, telefono, direccion, tarjeta);

        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("===== CLIENTE =====");
        super.mostrarDatos();
        System.out.println("Puntos: " + puntos);
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nPuntos=" + puntos;

    }

}