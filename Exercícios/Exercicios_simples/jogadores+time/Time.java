public class Time{
    private String nomeTime;
    private Jogador capitao;

    public Time(String nomeTime, Jogador capitao){
        this.nomeTime = nomeTime;
        this.capitao = capitao;
    }
    public void apresentar(){
        System.out.println("O nome do time é: " + nomeTime + "e o capitão é o " + capitao);
        capitao.exibirInfo();
    }
}