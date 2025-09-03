public class Livro{
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean aberto;

    public Livro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.aberto = false;
    }

    public void abrirLivro(){
        this.aberto = true;
    }
    public void fecharLivro(){
        this.aberto = false;
    }
    public void exibirDetalhes(){
        System.out.println("O livro " + this.titulo +
        " é do autor " + this.autor +
        " e tem " + this.numeroPaginas +
        ". Atualmente ele está " + this.aberto + ".");
    }
}