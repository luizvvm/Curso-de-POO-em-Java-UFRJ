public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void bonusAnual(){
        double aumento = (this.salario * 0.15) + 2000.00;
        this.salario +=aumento;
    }
}