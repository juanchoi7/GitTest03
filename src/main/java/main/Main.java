package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("nombre1", 1.0));
        productos.add(new Producto("nombre2", 2.0));
        productos.add(new Producto("nombre33", 3.0));
        productos.add(new ProductoPerecedero("nombre 4",4.0, 2));
        productos.add(new ProductoNoPerecedero("nombre 5", 5.0, "tipo 1" ));

        // recorriendo arrary con foreach y lambdas
        productos.forEach(productoX -> System.out.println( productoX.toString()));

        productos.forEach(productoX -> System.out.println( productoX.calcular(6)));

        System.out.println("Fin del mundo.");
    }
}
