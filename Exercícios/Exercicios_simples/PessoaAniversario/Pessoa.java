public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerAniversario(){
        this.idade ++;
    }

    public void exibirDetalhes(){
        System.out.println("Olá meu nome é" + this.nome + "tenho" + this.idade + "anos!");
    }
}