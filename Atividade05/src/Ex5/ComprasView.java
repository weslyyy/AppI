package Ex5;

import java.util.Scanner;

//5 . Criar um programa em Java que consiste em uma lista de compras:
//- Adicionar itens na lista de compras;
//- Consultar itens pelo seu índice;
//- Alterar itens da Lista de compras;
//- Exibir o tamanho da lista de compras;
//- Remover itens da lista de compras;
//- Classificar em ordem alfabética
//- Limpar a lista de compras
//Obs: Criar uma interface que exibe o que está acontecendo com o programa

public class ComprasView {
    public static void main(String[] args) {
        int opcao;
        String continuar;
                
        Scanner ler = new Scanner(System.in);
        
        ComprasClass c1 = new ComprasClass();
        
        do {
            System.out.println("\nBem vindo a lista de compras!\n"
                + "\nDigite a opcão que deseja para continuar:"
                + "\n0 - sair "
                + "\n1 - Adicionar itens na lista de compras"
                + "\n2 - Consultar itens pelo seu índice"
                + "\n3 - Alterar itens da Lista de compras"
                + "\n4 - Exibir o tamanho da lista de compras"
                + "\n5 - Remover itens da lista de compras"
                + "\n6 - Classificar em ordem alfabética"
                + "\n7 - Limpar a lista de compras");
            opcao = ler.nextInt();
        
            ler.nextLine();
            switch(opcao) {
                case 0:
                    System.out.println("\nVolte sempre!");
                    break;
                    
                case 1:
                    System.out.println("\nAdicionar itens...");
                    
                    System.out.println("\nDigite o item para adicionar a lista de compras: ");
                    c1.setItem(ler.nextLine());
                    
                    System.out.println(c1.adicionarItem());
                    
                    System.out.println("\nEnter para continuar!");
                    continuar = ler.nextLine();
                    
                    break;
                    
                case 2:
                    System.out.println("\nConsultar itens...");
                    
                    System.out.println("\nDigite o índice do item: ");
                    c1.indice = ler.nextInt();
                    
                    System.out.println(c1.consultarItem());
                    
                    ler.nextLine();
                    System.out.println("\nEnter para continuar!");
                    continuar = ler.nextLine();
                    
                    break;
                    
                case 3:
                    System.out.println("\nAlterar itens...");
                    
                    System.out.println("\nDigite o índice do item para alterar: ");
                    c1.indice = ler.nextInt();
                    
                    System.out.println(c1.consultarItem());
                    
                    ler.nextLine();
                    System.out.println("Digite o novo nome: ");
                    c1.setItem(ler.nextLine());
                    
                    System.out.println(c1.alterarItem());
                    
                    System.out.println("\nEnter para continuar!");
                    continuar = ler.nextLine();
                    
                    break;
                    
                case 4:
                    System.out.println("\nExibindo o tamanho da lista de compras...");
                    
                    System.out.println(c1.exibirTamanhoLista());
                    
                    System.out.println("\nEnter para continuar!");
                    continuar = ler.nextLine();
                    
                    break;
                    
                case 5:
                    System.out.println("\nRemover itens...");
                    
                    System.out.println("Digite o índice do item para excluir: ");
                    c1.indice = ler.nextInt();
                    
                    System.out.println(c1.removerItem());
                    
                    ler.nextLine();
                    System.out.println("\nEnter para continuar!");
                    continuar = ler.nextLine();
                    
                    break;
                    
                case 6:
                    System.out.println("\nClassificando itens em ordem alfabética...");
                    
                    System.out.println(c1.classificarOrdemAlfabetica());
                    
                    System.out.println("\nEnter para continuar!");
                    continuar = ler.nextLine();
                    
                    break;
                    
                case 7:
                    System.out.println("\nLimpando a lista de compras...");
                    
                    System.out.println(c1.limparLista());
                    
                    System.out.println("\nEnter para continuar!");
                    continuar = ler.nextLine();
                    
                    break;
                    
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
        
        
        
    }
}