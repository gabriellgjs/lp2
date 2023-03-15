package Main;

public class Carro extends Veiculo{
    private int quantidadeDePortas;

    public Carro(String modelo, String marca, int ano, double valor, int quantidadeDePortas) {
        super(modelo, marca, ano, valor);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("O modelo " + this.modelo + ", ano " + this.ano + ", da marca "  +  this.marca + ", do valor R$" + this.valor +  " e tem " + this.quantidadeDePortas + " portas");
    }
}
