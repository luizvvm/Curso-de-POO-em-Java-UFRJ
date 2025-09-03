public class Funcionario{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public void bonusAnual(){
        double aumento = this.salario * 0.1;
        this.salario += aumento;
    }
    public void exibirSalario(){
        System.out.println(this.salario);
    }
}