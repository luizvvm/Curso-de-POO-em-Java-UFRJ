public class Campeonato{
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Luiz Vitor", "Atacante");
        Time time1 = new Time("Matadores", jogador1);
        time1.apresentar();
    }
}