package Main;

public class Veiculo {
    protected String modelo;
    protected String marca;
    protected int ano;
    protected double valor;
    
    public Veiculo(String modelo, String marca, int ano, double valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimirInformacoes() {
        System.out.println("O modelo " + this.modelo + ", ano " + this.ano + ", da marca "  +  this.marca + ", do valor R$" + this.valor);
    }
    
}