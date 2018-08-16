
package Almacen.Categorias;

import Almacen.Cls_Producto;
import java.io.Serializable;

 
public class Computador extends Cls_Producto implements Serializable{
    
    private int almacenamiento;
    private int ram;
    private String procesador; 

    public Computador() {
    }

    public Computador(int almacenamiento, int ram, String procesador) {
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.procesador = procesador;
    }

    public Computador(String nombre, double precio, String marca, String tipo, int almacenamiento, int ram, String procesador) {
        super(nombre, precio, marca, tipo);
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.procesador = procesador;
    }
   
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
  
}
