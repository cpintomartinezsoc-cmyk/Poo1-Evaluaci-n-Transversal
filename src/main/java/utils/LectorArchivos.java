package utils;

import model.Producto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LectorArchivos {

    public static ArrayList<Producto> leerProductos(String ruta) {

        ArrayList<Producto> productos = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(ruta));

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 3) {

                    Producto producto = new Producto(
                            datos[0].trim(),
                            datos[1].trim(),
                            Double.parseDouble(datos[2].trim())
                    );

                    productos.add(producto);

                }

            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error leyendo archivo: " + e.getMessage());

        }

        return productos;

    }

}