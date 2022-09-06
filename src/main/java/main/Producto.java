package main;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Producto {
    private String nombre;
    private Double precio;

    public String toString() {
        String s = "Producto { " +
                " nombre=" + this.getNombre() +
                " precio=" + this.getPrecio() +
                " }";
        return s;
    }

    public Double calcular(int cantidadDeProductos) {
        Double d = this.getPrecio() * cantidadDeProductos;
        return d;
    }
}

