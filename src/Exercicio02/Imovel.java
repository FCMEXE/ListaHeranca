package Exercicio02;

public class Imovel {
    private int codigo;
    private String endereco;

    private double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    Imovel() {
    }

    Imovel(int codigo, String endereco, double valor) {

    }

    public String imprimir() {
        return "\nCódigo: " + codigo +
                "\nEndereço: " + endereco +
                "\nValor: " + valor;
    }
}


