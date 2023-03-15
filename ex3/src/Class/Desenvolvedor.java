package Class;

public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, double salario, int numeroIndentificador, String linguagem) {
        super(nome, salario, numeroIndentificador);
        this.linguagem = linguagem;
    }

    public void calcularSalarioAnual(double salario) {
        System.out.println("O novo salario é : " + ((this.salario * 12) * 0.2));
    }
    
}
