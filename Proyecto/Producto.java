package Proyecto;

public class Producto {

    private String nombre;
    private int tiempoDePreparacion;

    public int tiempoDePreparacion() {
        return this.tiempoDePreparacion;
    }
    
    public String nombre(){
        return this.nombre;
    }

    public Producto(String name, int time){
        this.nombre = name;
        this.tiempoDePreparacion = time;
    }
    
}
