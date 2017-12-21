
package Facturas;

public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
       
  
    
//METODOS GET
    
    public String getCodigo() {
        return this.codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public double getPrecio() {
        return this.precio;
    }

//METODOS SET
    

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio) {
    this.precio = precio;
    }

//CONSTRUCTOR
    
 public Producto(String codigo,String nombre, String descripcion, double precio) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;          
        }        
    
}
