package Class;

public class Analista extends Funcionario {
    private String tipoDeAnalise;

    public Analista(String nome, double salario, int numeroIndentificador, String tipoDeAnalise) {
        super(nome, salario, numeroIndentificador);
        this.tipoDeAnalise = tipoDeAnalise;
    }
    
    public void calcularSalarioAnual(double salario) {
        System.out.println("O novo salario é : " + (this.salario * 12) + 500);
    }
}
