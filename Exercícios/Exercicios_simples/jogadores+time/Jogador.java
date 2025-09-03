public class Jogador{
    private String nome;
    private String posicao;

    public Jogador(String nome, String posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    public void exibirInfo(){
        System.out.println("Jogador: " + nome + "Posição: " + posicao);
    }
}