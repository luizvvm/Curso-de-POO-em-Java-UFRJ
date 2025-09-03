public class Apresentacao {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Ana", 25);
        Pessoa pessoa2 = new Pessoa("Carlos", 30);

        pessoa1.exibirDetalhes();
        pessoa2.exibirDetalhes();

        pessoa1.fazerAniversario();
        pessoa1.exibirDetalhes();
        pessoa2.exibirDetalhes();
    }
}