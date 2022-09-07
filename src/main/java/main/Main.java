package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // comnetario aca
        // comentario 2
        // comentario 3 en github
        // Comentario 9 en master

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("nombre1", 1.0));
        productos.add(new Producto("nombre2", 2.0));
        productos.add(new Producto("nombre33", 3.0));
        productos.add(new ProductoPerecedero("nombre 4",4.40, 5));
        productos.add(new ProductoNoPerecedero("nombre 5", 23.3, "tipo 1" ));


        System.out.println(productos.get(0).toString());
        System.out.println(productos.get(1).toString());
        System.out.println(productos.get(2).toString());
        System.out.println(productos.get(3).toString());
        System.out.println(productos.get(4).toString());

        System.out.println(productos.get(0).calcular(6));
        System.out.println(productos.get(1).calcular(6));
        System.out.println(productos.get(2).calcular(6));



        System.out.println("Fin del mundo.");


    }
}
