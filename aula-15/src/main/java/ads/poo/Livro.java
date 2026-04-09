package ads.poo;

public class Livro {

    //atributos

    private String titulo;
    private String autor;
    private final String ISBN;
    private int ano;

    //métodos

    public Livro(String titulo, String autor, String ISBN, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.ano = ano;
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

    public String getISBN() {
        return ISBN;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }



}
