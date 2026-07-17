package data;

import model.*;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorDatos {

    private ArrayList<Registrable> personas;

    private ArrayList<Producto> productos;

    private HashMap<String,Producto> mapaProductos;

    public GestorDatos(){

        personas=new ArrayList<>();

        productos=new ArrayList<>();

        mapaProductos=new HashMap<>();

    }

    public void agregarPersona(Registrable persona){

        personas.add(persona);

    }

    public void mostrarPersonas(){

        for(Registrable persona:personas){

            persona.mostrarDatos();

            if(persona instanceof Cliente){

                System.out.println("Tipo: Cliente");

            }else if(persona instanceof Empleado){

                System.out.println("Tipo: Empleado");

            }else if(persona instanceof Proveedor){

                System.out.println("Tipo: Proveedor");

            }

            System.out.println("-------------------------");

        }

    }

    public void agregarProducto(Producto producto){

        productos.add(producto);

        mapaProductos.put(producto.getCodigo(),producto);

    }

    public void mostrarProductos(){

        for(Producto producto:productos){

            System.out.println(producto);

        }

    }

    public Producto buscarProducto(String codigo){

        return mapaProductos.get(codigo);

    }

}