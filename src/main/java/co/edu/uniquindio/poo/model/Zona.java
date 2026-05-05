package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.estructuras.Set;

public class Zona {
    private String nombre;
    private String id;
    private int capacidadMaxima;
    private Set operadores;
    private Set atracciones;

    public Zona(String nombre, String id, int capacidadMaxima) {
        this.nombre = nombre;
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
        this.operadores = new Set();
        this.atracciones = new Set();
    }

    //==========GETTERS Y SETTERS==========//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Set getOperadores() {
        return operadores;
    }

    public void setOperadores(Set operadores) {
        this.operadores = operadores;
    }

    public Set getAtracciones() {
        return atracciones;
    }

    public void setAtracciones(Set atracciones) {
        this.atracciones = atracciones;
    }
}
