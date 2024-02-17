package livro;

public class Livro {
    private String autor, titulo;

    public String getTitulo() {
        return titulo;

    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo1) {
        titulo = titulo1;
    }

    public void setAutor(String autor1) {
        autor = autor1;
    }

    public void ExibiDados() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);

    }
}