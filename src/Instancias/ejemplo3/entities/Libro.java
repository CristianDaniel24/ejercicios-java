package Instancias.ejemplo3.entities;

import java.util.Date;

public class Libro {
    protected String nombre;
    protected String autor;
    protected Date fechaPublicacion;

    public Libro(String nombre, String autor, Date fechaPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Detalles del libro:"+
                "\nNombre: "+this.nombre+
                "\nAutor: "+this.autor+
                "\nFecha de publicacion "+this.fechaPublicacion);
    }
}
