package Class;

class Funcionario {
    protected String nome;
    protected double salario;
    protected int numeroIndentificador;
    
    public Funcionario(String nome, double salario, int numeroIndentificador) {
        this.nome = nome;
        this.salario = salario;
        this.numeroIndentificador = numeroIndentificador;
    }

    public int getNumeroIndentificador() {
        return numeroIndentificador;
    }

    public double getSalario() {
        return salario;
    }

    
}