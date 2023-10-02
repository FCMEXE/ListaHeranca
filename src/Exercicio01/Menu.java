package Exercicio01;

import Exercicio01.Funcionario;
import Exercicio01.FuncionarioHorista;
import Exercicio01.FuncionarioMensalista;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {


       Scanner teclado = new Scanner(System.in);

       int opc = 0;
        FuncionarioHorista fh = new FuncionarioHorista();
        FuncionarioMensalista fm = new FuncionarioMensalista();
        ArrayList<Funcionario> funcionarios =
                new ArrayList<Funcionario>();



        while(opc != 6) {
            System.out.println("Exercicio01.Menu  \n" +
                    "1 – Inserir Funcionário\n" +
                    "2 – Exibir Funcionários\n" +
                    "3 – Sair");
            opc = Integer.parseInt(teclado.nextLine());

            switch (opc) {
                case 1:

                    int  FuncionarioOpc = 0;


                    System.out.println("1 - Exercicio01.Funcionario Mensalista");

                    System.out.println("2 - Exercicio01.Funcionario Horista");
                    FuncionarioOpc = teclado.nextInt();
                    Funcionario f = new Funcionario();


                    if (FuncionarioOpc == 1) {

                        System.out.println("Informar numero do Cracha:");
                        fm.setNumeroCracha(teclado.nextInt());
                        System.out.println("Informar nome do Exercicio01.Funcionario:");
                        fm.setNome(teclado.nextLine()); // Duplicado para não dar bug no codigo
                        fm.setNome(teclado.nextLine());
                        System.out.println("Informar setor do Exercicio01.Funcionario:");
                        fm.setSetor(teclado.nextLine());
                        System.out.println("Informar função do Exercicio01.Funcionario:");
                        fm.setFuncao(teclado.nextLine());
                        System.out.println("Salario do Exercicio01.Funcionario:");
                        fm.setSalario(Integer.parseInt(teclado.nextLine()));


                        funcionarios.add(f);
                        break;

                    } else if(FuncionarioOpc == 2) {

                        System.out.println("Informar numero do Cracha:");
                        fh.setNumeroCracha(teclado.nextInt());
                        System.out.println("Informar nome do Exercicio01.Funcionario:");
                        fh.setNome(teclado.nextLine());
                        fh.setNome(teclado.nextLine()); // Duplicado para não dar bug no codigo
                        System.out.println("Quantidade recebi por hora:");
                        fh.setValorHora(Integer.parseInt(teclado.nextLine()));
                        System.out.println("Informar função do Exercicio01.Funcionario:");
                        fh.setFuncao(teclado.nextLine());
                        System.out.println("Informar setor do Exercicio01.Funcionario:");
                        fh.setSetor(teclado.nextLine());
                        System.out.println("Quantidade de horas de trabalho:");
                        fh.setQtdHoras(Integer.parseInt(teclado.nextLine()));

                        funcionarios.add(f);

                    } else {
                        System.out.println("Operação Inválida!");
                    }
                break;
                case 2:

                    System.out.println("Exercicio01.Funcionario Mensalista>" + fm.imprimir());

                    System.out.println("Exercicio01.Funcionario Horista>" + fh.imprimir());
                    break;

                case 3:
                    System.out.println("Programa encerrado!");
            }
        }

teclado.close();
    }
}
