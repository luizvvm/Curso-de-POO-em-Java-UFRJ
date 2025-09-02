public class ContaBancaria{
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(String titular, int numero){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    void sacar(double valor){
        if(valor >= this.saldo){
            System.out.println("Saldo insuficiente. Seu saldo:" + this.saldo);
        }
        else{
            this.saldo = this.saldo - valor;
        }
    }

    void verSaldo(){
        System.out.println(this.titular);
        System.out.println(this.numero);
        System.out.println(saldo);
    }
}