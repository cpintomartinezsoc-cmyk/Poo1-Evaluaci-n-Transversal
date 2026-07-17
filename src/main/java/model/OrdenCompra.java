package model;

import java.util.ArrayList;

public class OrdenCompra {

    private int numeroOrden;

    private Cliente cliente;

    private ArrayList<Producto> productos;

    public OrdenCompra(int numeroOrden, Cliente cliente) {

        this.numeroOrden = numeroOrden;
        this.cliente = cliente;
        this.productos = new ArrayList<>();

    }

    public void agregarProducto(Producto producto){

        productos.add(producto);

    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public double calcularTotal(){

        double total=0;

        for(Producto producto:productos){

            total+=producto.getPrecio();

        }

        return total;

    }

    @Override
    public String toString() {

        return "OrdenCompra{" +
                "numeroOrden=" + numeroOrden +
                ", cliente=" + cliente.getNombre() +
                ", total=$" + calcularTotal() +
                '}';

    }

}
