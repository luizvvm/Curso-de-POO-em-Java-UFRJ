public class BancoCentral{
    public static void main(String[] args){
        ContaPoupanca cp = new ContaPoupanca(101, 202);
        cp.depositar(1000.0);
        cp.renderJuros(0.05);

        ContaEspecial ce = new ContaEspecial(303, 404, 1000.00);
        ce.depositar(500.0);
        System.out.println("Saldo atual: R$" + ce.getSaldo());

        ce.sacar(800.00);
        System.out.println("Saldo final: R$" + ce.getSaldo()); // Saldo ficará negativo
    }
}