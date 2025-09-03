public class Livros{
    private String titulo;
    private Autores autor;

    public Livros(String titulo, Autores autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public void exibirDetalhes(){
        System.out.println("O nome do livro é " + this.titulo);
        autor.exibirInfo();
    }
}