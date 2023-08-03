package Entidades;

public class Libro {
    
    //defino los atributos
    //ISBN, Título, Autor,Número de páginas
    
    private int isbn;    //son 13 numeros
    private String titulo;
    private String autor;
    private int numeroPag;
    
    // constructores

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numeroPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    }
    
    //getter && setter

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }
    
    //to string

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPag=" + numeroPag + '}';
    }
    
    
    
    
    
}


