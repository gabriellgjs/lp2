package Main;
public class App {
    public static void main(String[] args) throws Exception {
        Veiculo a = new Veiculo("a", "a", 0, 0);
        Carro b = new Carro("a", "a", 0, 0, 5);
        Moto c = new Moto("a", "a", 0, 0, 5);
        a.imprimirInformacoes();
        b.imprimirInformacoes();
        c.imprimirInformacoes();
    }
}
