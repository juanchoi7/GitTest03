package main;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Producto {
    private String nombre;
    private Double precio;

    public String toString() {
        return "Producto { " +
                " nombre='" + this.getNombre() + '\'' +
                " precio=" + this.getPrecio() +
                " }";
    }

    public Double calcular(int cantidadDeProductos) {
        return this.getPrecio() * cantidadDeProductos;
    }
}

