package Instancias.ejemplo1.entities;

public class Telefono {
    protected String marca;
    protected int anio;

    public Telefono(String marca, int anio){
        this.marca = marca;
        this.anio = anio;
    }

    public void detalles(){
        System.out.println("Detalles del telefono:");
        System.out.println("Marca: "+this.marca+
                "\nAño: "+this.anio);
    }
}
