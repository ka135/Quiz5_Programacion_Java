import java.util.LinkedList;

/**
 * clase Biblioteca
 */
public class Biblioteca {

    /**
     * Declaración de una lista que almacena los librosDisponibles
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    /**
     * Método para registrar un libro en la biblioteca
     *
     * Complejidad temporal: O(1) Tiempo constante
    */
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    /**
     * Metodo para buscar el libro
     * Si no encuentra el libro, se devuelve null
     *
     * Complejidad temporal: O(N) Operacion de Tiempo lineal
     */
    public Libro buscarLibro(String titulo) {
        for (int i = 0; i < librosDisponibles.size(); i = i + 1) {
            Libro libro1 = librosDisponibles.get(i);
            if (titulo.equals(libro1.getTitulo())) {
                return libro1;
            }
        }
        return null;
    }

    /**
     * Método para obtener la lista de libros disponibles en la biblioteca
     *
     * Complejidad temporal: O(1) Operacion de Tiempo Constante
     */
    public LinkedList<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

}
