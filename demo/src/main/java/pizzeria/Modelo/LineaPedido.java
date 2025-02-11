package pizzeria.Modelo;
// import pizzeria.Producto;

/**
 * LineaPedido
 */
public class LineaPedido {

    private int id;
    private int cantidad;
    private Producto producto;
    static int contador = 0;

    public LineaPedido(int cantidad, Producto producto) {
        this.id = this.contador++;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public void IncremetoCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "LineaPedido [id=" + id + ", cantidad=" + cantidad + ", producto=" + producto + "]";
    }

}