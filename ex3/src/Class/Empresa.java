package Class;

public class Empresa {
    public static void main(String[] args) {
        Gerente a = new Gerente("pedro", 1500, 1, "ti");
        Desenvolvedor b = new Desenvolvedor("adriano", 1500, 2, "typescript");
        Analista c = new Analista("helena", 1500, 3, "tester");

        a.calcularSalarioAnual(a.getSalario());
        b.calcularSalarioAnual(b.getSalario()); 
        c.calcularSalarioAnual(c.getSalario());
    }
}
