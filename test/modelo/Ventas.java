package modelo;

public class Ventas {
    
    public int id;
    public String numeros_factura;
    public String fecha_factura;
    public  total_decimal;

    public Ventas() {
    }

    public Ventas(int id, int numeros_factura, int fecha_factura, int total_decimal) {
        this.id = id;
        this.numeros_factura = numeros_factura;
        this.fecha_factura = fecha_factura;
        this.total_decimal = total_decimal;
    }

    public int getId() {
        return id;
    }

    public int getNumeros_factura() {
        return numeros_factura;
    }

    public int getFecha_factura() {
        return fecha_factura;
    }

    public int getTotal_decimal() {
        return total_decimal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeros_factura(int numeros_factura) {
        this.numeros_factura = numeros_factura;
    }

    public void setFecha_factura(int fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public void setTotal_decimal(int total_decimal) {
        this.total_decimal = total_decimal;
    }
   
}