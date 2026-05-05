package co.edu.uniquindio.poo.estructuras;

/**
 * Estructura de Lista Doblemente Enlazada para datos genéricos
 * @param <T>
 */
public class LinkedList<T extends Comparable<T>> {

    /**
     * Clase privada Nodo correspondiente a los elementos de la lista enlazada
     */
    private class Nodo<T>{
        T dato;
        Nodo siguiente;
        Nodo anterior;

        Nodo(T dato) { this.dato = dato; }
    }

    private Nodo cabeza;
    private Nodo cola;

    /**
     * Metodo para agregar nuevos elementos a la lista
     * @param dato a agregar
     */
    public void agregar(T dato){
        Nodo<T> actual = new Nodo(dato);
        if(cabeza == null){
            cabeza = actual;
            cola = actual;
        }
        else{
            cola.siguiente = actual;
            actual.anterior = cola;
            cola = actual;
        }
    }

    public boolean estaVacia(){
        if(cabeza == null && cola == null){
            return true;
        }
        else{
            return false;
        }
    }

    public Nodo<T> buscar(T valor) {
        Nodo<T> actual = cabeza;

        while (actual != null) {
            if ((actual.dato == null && valor == null) ||
                    (actual.dato != null && actual.dato.equals(valor))) {
                return actual;
            }
            actual = actual.siguiente;
        }

        return null;
    }

    public boolean eliminar(T valor){
        Nodo<T> actual = buscar(valor);

        if(actual == null){
            return false;
        }
        else{
            Nodo<T> anterior = actual.anterior;
            Nodo<T> siguiente = actual.siguiente;
            anterior.siguiente = siguiente;
            siguiente.anterior = anterior;
        }
        return true;
    }
}
