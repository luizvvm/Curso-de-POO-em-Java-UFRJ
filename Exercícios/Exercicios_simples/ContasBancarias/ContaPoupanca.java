public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }
        public void renderJuros(double taxa){
            double rendimento = this.saldo * taxa;
            this.saldo += rendimento;
            System.out.println("Rendimento de R$" + rendimento + " aplicado. Saldo atual: R$" + this.saldo);
        }
}