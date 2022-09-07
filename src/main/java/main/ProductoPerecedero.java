package main;

import lombok.*;

@Getter
@Setter
// @AllArgsConstructor
// @NoArgsConstructor

public class ProductoPerecedero extends Producto {
    private int diasPorCaducar;

    public ProductoPerecedero(String nombre, Double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public Double calcular(int cantidadDeProductos) {
        Double d = this.getPrecio() * cantidadDeProductos / this.diasPorCaducar;
        return d;
    }

}