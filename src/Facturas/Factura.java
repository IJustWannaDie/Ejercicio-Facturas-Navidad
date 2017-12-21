
package Facturas;

public class Factura {
    private int numero;
    private Cliente cliente;
    private Fecha fecha;
    private LineaFactura[] lineas = new LineaFactura[10];
       
  
    
//METODOS GET
    
    public int getNumero() {
        return this.numero;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public Fecha getFecha() {
        return this.fecha;
    }
    public LineaFactura[] getLineas(){
        return this.lineas;
    }

//METODOS SET
    

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public void setLineas(LineaFactura[] lineas) {
       this.lineas = lineas;
    }

//CONSTRUCTOR
    
 public Factura(int numero, Cliente cliente, Fecha fecha) {
    this.numero = numero;
    this.cliente = cliente;
    this.fecha = fecha;          
        }        
    


//METODOS
    
public int nuevaLinea(LineaFactura lf){
        
       int numero=-1;
       int i=0;
        
    while ((i<this.lineas.length) && (numero==-1)) {
            
            if (this.lineas[i]==null) {
                this.lineas[i]=lf;
                numero=i;
            } else i++;            
           
        }   
    if (this.lineas[i].getProducto().getNombre().equals(lf.getProducto().getNombre())){
        return lineas[i].getCantidad()+ lf.getCantidad();
        
    }
        return numero;
}

 public void borrarLineaNmero (int numLinea){
        
        this.lineas[numLinea]=null;
        
    } 

public int buscarProducto(String nombre){
    boolean tiene = false;
    int i=0;
    int resultado;
     
    while ((i<this.lineas.length) && (tiene==false)) {
            
    if (this.lineas[i].getProducto().getNombre().equals(nombre)){
                   tiene=true;
    } else i++;   
          }
    if (tiene=false){
        i = -1;                     
    }

    return i;
}

public void borrarLineaNombre (String nombre){
        
        lineas[buscarProducto(nombre)]=null;
        
    } 

 public double importeTotal(){
      double operacion = 0;
      int total=0;
      for(int i=0;i<lineas.length;i++){
          if (this.lineas[i]!=null) 
                operacion= this.lineas[i].getCantidad()*this.lineas[i].getProducto().getPrecio();
          if((lineas[i].getDescuento()<100) && (lineas[i].getDescuento()>0)){
              total+=operacion - (operacion*lineas[i].getDescuento());
              
          }
         
          else total+=operacion;

    }
            return total;
 }

public double ImporteTotalImpuestos(){
    double total;    
    total=importeTotal()*0.21;
    return total;
    
}

      
    public String imprimir (){
        String informacion="Informacion sobre el cliente";
        informacion+=" Numero de Factura: "  +getNumero() + "\n";
        informacion+=" Fecha de la Factura : "  +fecha.corta() + "\n";
        informacion+=" Su Nif es : " + cliente.getNif() + "\n";
        informacion+=" Su Nombre es : " + cliente.getNombre() + "\n";
        informacion+=" Su Direccion es : " + cliente.getDireccion() + "\n";
        informacion+=" Su Telefono es : " + cliente.getTelefono() + "\n";
        informacion+=" El importe total asciende a : " + importeTotal();
        informacion+=" El importe total con IVA asciende a : " + ImporteTotalImpuestos();
        informacion+=" Lista de Productos \n";
         for (int i=0; i<10;i++){
            if (this.lineas[i]!=null)  informacion+=this.lineas[i].getProducto() + "\n";
        }        

        return informacion;
    }  

}

