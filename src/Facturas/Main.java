package Facturas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cliente cliente1 = new Cliente("B-21212121","Informatica Manises S.L","Avda.Blasco Ibañez nº4","963214578");
        Producto producto1 = new Producto("25UM58-P","LG 25UM58-P","Monitor UltraWide de 64cm",159);
        Producto producto2 = new Producto("sdskssd240","Sandisk ssd 240","Disco duro ssd de 240 gb",89);
        Producto producto3 = new Producto("sdskpd32","Pendrive 32 GB","Pendrive ScanDisk 32GB USB 3.0",10);
        Fecha fecha1 = new Fecha(15,12,2017);
        Factura factura1 = new Factura (1,cliente1,fecha1);
        LineaFactura linea1 = new LineaFactura (producto1,2);
        LineaFactura linea2 = new LineaFactura (producto2,10);
        LineaFactura linea3 = new LineaFactura (producto3,7);
        LineaFactura linea4 = new LineaFactura (producto1,7);
                        
     System.out.println(factura1.imprimir());
     factura1.borrarLineaNombre("25UM58-P");
     System.out.println(factura1.imprimir());
        
        Producto producto4 = new Producto("RAMDDR4-4G","Kingston RAM DDR4 4GB","Memoria RAM",56.90);
        LineaFactura linea5 = new LineaFactura (producto4,12,5);
        
    }
}