/**
 * clase Principal
 */
public class Principal {
    /**
     * Método inicial que es ejecutado
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();
        Libro libro1 = new Libro("Cienañosdesoledad","GabrielGarcíaMárquez",496);
        Libro libro2 = new Libro("ElcódigoDaVinci","DanBrown",656);
        Libro libro3 = new Libro("1984","GeorgeOrwell",326);
        Libro libro4 = new Libro("ElHobbit","J.R.R.Tolkien",310);
        Libro libro5 = new Libro("LaOdisea","Homero",448);
    }
}
