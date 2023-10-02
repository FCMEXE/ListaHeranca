package Exercicio01;

import Exercicio01.Funcionario;

public class FuncionarioMensalista extends Funcionario {

    double salario;

    FuncionarioMensalista(){}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao) {
        super.setNome(nome) ;
        super.setNumeroCracha(numeroCracha);
        super.setSetor(setor);
        super.setFuncao(funcao);
        salario = salario;
    }

    String imprimir(){
        return " \n Nome: " + super.nome +
                "\n NumeroCracha: " + super.getNumeroCracha() +
                "\n Setor: " + super.getSetor() +
                "\n Função: " + super.getFuncao() +
                "\n Salario: " + salario ;

}
}
