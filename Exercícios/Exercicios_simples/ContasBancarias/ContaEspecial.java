public class ContaEspecial extends Conta{
    private double limite;
    public ContaEspecial(int agencia, int numero, double limite){
        super(agencia, numero);
        this.limite = limite;
    }

    @Override public void sacar(double valor){
        if (this.saldo + this.limite >= valor){
            this.saldo -= valor;
                        System.out.println("Saque de R$" + valor + " efetuado. Saldo atual: R$" + this.saldo);
        }
        else{
            System.out.println("Limite insuficiente");
        }
    }
}