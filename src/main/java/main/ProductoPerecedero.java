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

    @Override
    public String toString() {
        return "ProductoPerecedero{" +
                " nombre='" + this.getNombre() + '\'' +
                " precio=" + this.getPrecio() +
                " diasPorCaducar=" + diasPorCaducar +
                '}';
    }

    public Double calcular(int cantidadDeProductos) {
        return this.getPrecio() * cantidadDeProductos / this.diasPorCaducar;
    }

}