package app;

import data.GestorDatos;
import model.*;
import utils.LectorArchivos;
import utils.RutInvalidoException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try {

            GestorDatos gestor = new GestorDatos();

            Direccion direccion1 = new Direccion(
                    "San Pedro",
                    125,
                    "Puerto Varas",
                    "Los Lagos"
            );

            Direccion direccion2 = new Direccion(
                    "Vicente Pérez Rosales",
                    480,
                    "Frutillar",
                    "Los Lagos"
            );

            Tarjeta tarjeta1 = new Tarjeta(
                    "123456789",
                    "Banco Estado",
                    "Débito"
            );

            Tarjeta tarjeta2 = new Tarjeta(
                    "987654321",
                    "Banco de Chile",
                    "Crédito"
            );

            Cliente cliente = new Cliente(
                    new Rut("18.456.321-5"),
                    "Camilo Pinto",
                    "987654321",
                    direccion1,
                    tarjeta1,
                    2500
            );

            Empleado empleado = new Empleado(
                    new Rut("16.789.123-4"),
                    "María Soto",
                    "998877665",
                    direccion2,
                    tarjeta2,
                    "Guía Turística"
            );

            Proveedor proveedor = new Proveedor(
                    new Rut("77.654.321-8"),
                    "Carlos Muñoz",
                    "912345678",
                    direccion1,
                    tarjeta1,
                    "Transportes del Sur"
            );

            gestor.agregarPersona(cliente);
            gestor.agregarPersona(empleado);
            gestor.agregarPersona(proveedor);

            System.out.println("===== PERSONAS =====");
            gestor.mostrarPersonas();

            ArrayList<Producto> productos = new ArrayList<>();

            productos.add(new Producto("P001","Tour Saltos del Petrohué",25000));
            productos.add(new Producto("P002","Ruta Gastronómica Puerto Varas",32000));
            productos.add(new Producto("P003","Paseo Lago Llanquihue",28000));
            productos.add(new Producto("P004","Excursión Volcán Osorno",45000));
            productos.add(new Producto("P005","Tour Frutillar",22000));

            System.out.println("\nProductos cargados: " + productos.size());

            for (Producto producto : productos) {
                gestor.agregarProducto(producto);
            }

            System.out.println("\n===== PRODUCTOS =====");
            gestor.mostrarProductos();

            System.out.println("\n===== BÚSQUEDA =====");

            Producto encontrado = gestor.buscarProducto("P003");

            if (encontrado != null) {
                System.out.println(encontrado);
            } else {
                System.out.println("Producto no encontrado.");
            }

            OrdenCompra orden = new OrdenCompra(1, cliente);

            Producto p1 = gestor.buscarProducto("P001");
            Producto p2 = gestor.buscarProducto("P004");

            if (p1 != null) {
                orden.agregarProducto(p1);
            }

            if (p2 != null) {
                orden.agregarProducto(p2);
            }

            System.out.println("\n===== ORDEN DE COMPRA =====");
            System.out.println(orden);

        } catch (RutInvalidoException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
