package Exercicio01;

import Exercicio01.Funcionario;

public class FuncionarioHorista extends Funcionario {

    int qtdHoras;
    double valorHora;

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    FuncionarioHorista(){}

    FuncionarioHorista(String nome, int NumeroCracha, String setor, String funcao){
                 super.setNome(nome) ;
                 super.setNumeroCracha(numeroCracha);
                 super.setSetor(setor);
                 super.setFuncao(funcao);
                 qtdHoras = qtdHoras;
                 valorHora = valorHora;

    }


    String imprimir(){
        return " \n Nome " + super.nome +
                "\n NumeroCracha: " + super.getNumeroCracha() +
                "\n Setor: " + super.getSetor() +
                "\n Função: " + super.getFuncao() +
                "\n Quantidade de Horas: " + qtdHoras +
                "\n Valor Hora: " + valorHora;

    }
}
