package co.edu.uniquindio.poo.model;

public class Operador extends Usuario {
    private Zona zonaAsignada;

    /**
     * Constructor de la clase Operador
     *
     * @param nombre
     * @param id
     * @param edad
     * @param zonaAsignada
     */
    public Operador(String nombre, String id, int edad, Zona zonaAsignada) {
        super(nombre, id, edad);
        this.zonaAsignada = zonaAsignada;
    }

    //==========GETTERS Y SETTERS==========//

    public Zona getZonaAsignada() {
        return zonaAsignada;
    }

    public void setZonaAsignada(Zona zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }
}
