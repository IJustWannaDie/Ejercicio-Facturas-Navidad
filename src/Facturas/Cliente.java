
package Facturas;

public class Cliente {
    private String nif;
    private String nombre;
    private String direccion;
    private String telefono;

    
  
    
//METODOS GET
    
    public String getNif() {
        return this.nif;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }

//METODOS SET
    

    public void setNif(String nif) {
        this.nif = nif;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
    this.telefono = telefono;
    }

//CONSTRUCTOR
    
 public Cliente(String nif,String nombre, String direccion, String telefono) {
    this.nif = nif;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;          
        }        
    
}
