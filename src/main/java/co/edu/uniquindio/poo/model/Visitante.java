package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.estructuras.*;

public class Visitante extends Usuario{
    private LinkedList historialVisitas;
    private Set atraccionesFavoritas;

    /**
     * Constructor de la clase Visitante
     * @param nombre
     * @param id
     * @param edad
     */
    public Visitante(String nombre, String id, int edad) {
        super(nombre, id, edad);
        this.historialVisitas = new LinkedList();
        this.atraccionesFavoritas = new Set();
    }

    //==========GETTERS Y SETTERS==========//

    public LinkedList getHistorialVisitas() {
        return historialVisitas;
    }

    public void setHistorialVisitas(LinkedList historialVisitas) {
        this.historialVisitas = historialVisitas;
    }

    public Set getAtraccionesFavoritas() {
        return atraccionesFavoritas;
    }

    public void setAtraccionesFavoritas(Set atraccionesFavoritas) {
        this.atraccionesFavoritas = atraccionesFavoritas;
    }
}
