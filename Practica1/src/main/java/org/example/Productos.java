package org.example;

public class Productos {
    private String nombre;
    private double presio;

    public Productos(String nombre, double presio) {
        this.nombre = nombre;
        this.presio = presio;
    }

    public Productos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresio() {
        return presio;
    }

    public void setPresio(double presio) {
        this.presio = presio;
    }
}
