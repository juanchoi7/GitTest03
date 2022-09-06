package main;
import lombok.*;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Distribuidora {
    ArrayList<Producto> carritoCompras = new ArrayList<>();

    public Double calcularTotal(Double cantPorProducto){

        return cantPorProducto;
    }

}
