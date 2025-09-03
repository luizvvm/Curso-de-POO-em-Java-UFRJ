public class Autores{
    private String nome;
    private String nacionalidade;

    public Autores(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public void exibirInfo(){
        System.out.println("nome: " + this.nome + " nacionalidade: " + this.nacionalidade);
    }
}