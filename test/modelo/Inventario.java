/*
 
 */

/**
 *
 * @author Geraldine Plata
 */
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> listaDeProductos;

    public Inventario() {
        listaDeProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaDeProductos.add(producto);
    }

    public void eliminarProducto(String codigo) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            listaDeProductos.remove(producto);
        }
    }

    public Producto buscarProducto(String codigo) {
        for (Producto producto : listaDeProductos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public ArrayList<Producto> listarProductos() {
        return listaDeProductos;
    }
}

