public class Teste{
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Vitor", 10000);
        Gerente gerente1 = new Gerente("Luiz", 10000);

        funcionario1.bonusAnual();
        gerente1.bonusAnual();

        funcionario1.exibirSalario();
        gerente1.exibirSalario();
    }
}