package Exercicio02;

public class ImovelVelho extends Imovel {
    double valorDesconto;

    ImovelVelho(){

    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    ImovelVelho(int codigo, String endereco, double valorDesconto){}

    double calcularValorImovel() {
        return valorDesconto - getValor() ;
    }

    String  Imprimir(){
        return  " \nCodigo:" + super.getCodigo() +
                " \n Endereço:" + super.getEndereco() +
                " \n Valor" + super.getValor() +
                " \n Valor Desconto:" + valorDesconto +
                "\n Valor Final:" + calcularValorImovel();

    }
}
