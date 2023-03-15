package Main;

public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto(String modelo, String marca, int ano, double valor, int cilindradas) {
        super(modelo, marca, ano, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("O modelo " + this.modelo + ", ano " + this.ano + ", da marca "  +  this.marca + ", do valor R$" + this.valor +  " e tem " + this.cilindradas + " cilindradas.");
    }
}
