package Instancias.ejemplo2.entities;

public class Moto {
    protected String nombre;
    protected String disenio;
    protected String matricula;

    public Moto(String nombre, String disenio, String matricula) {
        this.nombre = nombre;
        this.disenio = disenio;
        this.matricula = matricula;
    }

    public void mostrarInformacion() {
        System.out.println("Detalles de la moto:"+
                "\nNombre: "+this.nombre+
                "\nDiseño: "+this.disenio+
                "\nMatricula "+this.matricula);
    }
}
