public class Conta{
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double value){
        this.saldo += value;
    }

    public void sacar(double value){
        if (value < this.saldo){
            this.saldo -= value;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

}