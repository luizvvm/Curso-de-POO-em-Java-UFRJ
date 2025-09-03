public class Biblioteca{
    public static void main(String[] args){
        Livro livro1 = new Livro("Harry Potter", "Luiz Vitor", 1248);
    livro1.exibirDetalhes();
    livro1.abrirLivro();
    livro1.exibirDetalhes();
    livro1.fecharLivro();
    livro1.exibirDetalhes();
    }
}