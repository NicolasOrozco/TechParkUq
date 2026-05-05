package co.edu.uniquindio.poo.model;

public class Usuario {
    private String nombre;
    private String id;
    private int edad;

    /**
     * Constructor de la clase Usuario
     * @param nombre
     * @param id
     * @param edad
     */
    public Usuario(String nombre, String id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
