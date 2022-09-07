package main;

import lombok.*;

@Getter
@Setter
// @AllArgsConstructor
// @NoArgsConstructor


public class ProductoNoPerecedero extends Producto {
    private String tipo;

    public ProductoNoPerecedero(String nombre, Double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ProductoNoPerecedero{" +
                " nombre='" + this.getNombre() + '\'' +
                " precio=" + this.getPrecio() +
                " tipo='" + tipo + '\'' +
                '}';
    }
}