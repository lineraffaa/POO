package livro;

public class ExemploLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Coraline");
        livro1.setAutor("Neil Gaiman");

        System.out.println("Livro:Coraline" + livro1.getTitulo());
        System.out.println("Autor:Neil Gaiman" + livro1.getAutor());

        livro1.ExibiDados();
    }

}
