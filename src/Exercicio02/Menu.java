package Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int escolha;
        ArrayList<Imovel> imoveis = new ArrayList<Imovel>();

        do{
            System.out.println("Menu");
            System.out.println("1 - Inserir Imóvel");
            System.out.println("2 - Exibir Imóveis");
            System.out.println("3 - Sair");
            escolha = Integer.parseInt(teclado.nextLine());

            switch(escolha){
                case 1:
                    int ImovelEscolha;

                    do{
                        System.out.println("O imóvel é novo ou velho?");
                        System.out.println("1 - Novo");
                        System.out.println("2 - Velho");
                        ImovelEscolha = Integer.parseInt(teclado.nextLine());

                        switch(ImovelEscolha){
                            case 1:
                                ImovelNovo ImovelNovo = new ImovelNovo();

                                System.out.println("Digite o código do imóvel:");
                                ImovelNovo.setCodigo(Integer.parseInt(teclado.nextLine()));
                                System.out.println("Digite o endereco do imóvel:");
                                ImovelNovo.setEndereco(teclado.nextLine());
                                System.out.println("Digite o valor do imóvel:");
                                ImovelNovo.setValor(Double.parseDouble(teclado.nextLine()));
                                System.out.println("Digite o valor adicional do imóvel:");
                                ImovelNovo.setValorAdicional(Double.parseDouble(teclado.nextLine()));

                                imoveis.add(ImovelNovo);
                                break;
                            case 2:
                                ImovelVelho ImovelVelho = new ImovelVelho();

                                System.out.println("Digite o código do imóvel:");
                                ImovelVelho.setCodigo(Integer.parseInt(teclado.nextLine()));
                                System.out.println("Digite o endereco do imóvel:");
                                ImovelVelho.setEndereco(teclado.nextLine());
                                System.out.println("Digite o valor do imóvel:");
                                ImovelVelho.setValor(Double.parseDouble(teclado.nextLine()));
                                System.out.println("Digite o valor de Desconto do imóvel:");
                                ImovelVelho.setValorDesconto(Double.parseDouble(teclado.nextLine()));

                                imoveis.add(ImovelVelho);
                                break;
                            default:
                                System.out.println("O tipo de imóvel não é válido");
                                break;
                        }
                    }while(ImovelEscolha != 1 && ImovelEscolha != 2);

                    break;
                case 2:
                    for(Imovel i : imoveis) {
                        System.out.println(i.imprimir());
                    }
                    break;
                case 3:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("O número é válido");
                    break;
            }
        }while(escolha != 3);
    }
}

