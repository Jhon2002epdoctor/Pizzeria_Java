package pizzeria.Modelo;

import java.util.List;



public class Pasta extends Producto {

    private List<Ingredientes> ingredientes;

    public Pasta(String nombre, double precio, List<Ingredientes> ingredientes) {
        super(nombre, precio);
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pasta [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", ingredientes=" + ingredientes + "]";
    }

}