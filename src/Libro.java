/**
 * clase Libro
 */
public class Libro {
    /**
     * Atributos
     */
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param titulo es el titulo del Libro
     * @param autor es el autor del Libro
     * @param numeroPaginas es el numero de paginas del Libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */


    /**
     * Setter
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
    *Getter
    */

    /**
     * Método para obtener el titulo del libro
     * @return Retorna el titulo del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método para obtener el autor del libro
     * @return Retorna el autor del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método para obtener el numero de paginas del libro
     * @return Retorna el numero de paginas del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}