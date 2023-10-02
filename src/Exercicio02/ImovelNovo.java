package Exercicio02;

public class ImovelNovo extends Imovel

    {
        double valorAdicional;

        ImovelNovo(){}

        public double getValorAdicional() {
            return valorAdicional;
        }

        public void setValorAdicional(double valorAdicional) {
            this.valorAdicional = valorAdicional;
        }

        ImovelNovo(int codigo, String endereco, double valor, double valorAdicional){}

        double calcularValorImovel(){
            return getValor() + valorAdicional;
        }

        String Imprimir(){
            return  " \nCodigo:" + super.getCodigo() +
                    " \n Endereço:" + super.getEndereco() +
                    " \n Valor" + super.getValor() +
                    " \n Valor Adiocnal:" + valorAdicional;
        }


    }

