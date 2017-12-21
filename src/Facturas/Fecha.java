
package Facturas;

public class Fecha {
    private int dia;
    private int mes;
    private int anyo;

     
  //METODOS GET
    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    
    public int getAnyo() {
        return anyo;
    }
    
//METODOS SET
   
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
   //CONSTRUCTOR 
    
      public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }
    
    //METODOS
      
    public String corta(){        
        return this.dia + "-" + this.mes + "-" + this.anyo;         
    }  
}
