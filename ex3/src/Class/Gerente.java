package Class;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, double salario, int numeroIndentificador, String departamento) {
        super(nome, salario, numeroIndentificador);
        this.departamento = departamento;
    }

    public void calcularSalarioAnual(double salario) {
        System.out.println("O novo salario é : " + ((this.salario * 12) * 0.1));
    }
    
}
