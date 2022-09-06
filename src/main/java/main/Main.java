package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // comnetario aca
        // comentario EX 2
        // comentario 4 en master y en conflicto

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("nombre1", 1.0));
        productos.add(new Producto("nombre2", 2.0));
        productos.add(new Producto("nombre33", 3.0));
        productos.add(new ProductoPerecedero(7));
        productos.add(new ProductoNoPerecedero("Tipo5"));

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