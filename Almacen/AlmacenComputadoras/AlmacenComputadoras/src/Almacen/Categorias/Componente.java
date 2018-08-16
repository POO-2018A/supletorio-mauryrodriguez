
package Almacen.Categorias;

import Almacen.Cls_Producto;
import java.io.Serializable;


public class Componente extends Cls_Producto implements Serializable{
    
    private int capacidad;
    private int velocidad;
    
    public Componente() {
    }

    public Componente(String nombre, double precio, String marca, String tipo, int capacidad, int velocidad) {
        super(nombre, precio, marca, tipo);
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }
    
    

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
    
    
}
