package Instancias.ejemplo1.entities;

public class Samsung extends Telefono {

    public Samsung(String nombre, int anio) {
        super(nombre, anio);
    }

    @Override
    public void detalles() {
        System.out.println("Detalles del telefono:");
        System.out.println("Marca: " + this.marca +
                "\nAño: " + this.anio);
    }
}