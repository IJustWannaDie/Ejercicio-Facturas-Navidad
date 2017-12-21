
package Facturas;

public class LineaFactura {
    private Producto producto;
    private int cantidad;
    private int descuento;
  
//METODOS GET
    
    public Producto getProducto() {
        return this.producto;
    }
    public int getCantidad() {
        return this.cantidad;
    }
     public int getDescuento() {
        return this.descuento;
    }

//METODOS SET
    

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
     public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

//CONSTRUCTOR
    
 public LineaFactura(Producto producto,int cantidad) {
    this.producto = producto;
    this.cantidad = cantidad;     
    this.descuento = 0;
        }        
 public LineaFactura(Producto producto,int cantidad,int descuento) {
    this.producto = producto;
    this.cantidad = cantidad;     
    this.descuento = descuento;
        }        
    
}
