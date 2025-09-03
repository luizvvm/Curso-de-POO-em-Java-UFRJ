public class Consultando{

    public static void main(String[] args){
        Autores autor1 = new Autores("Luiz Vitor", "Brasileiro");
        Livros livro1 = new Livros("Harry Potter", autor1);

        livro1.exibirDetalhes();
    }
}