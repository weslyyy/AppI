package View;

import Model.LivroClass;
import java.util.Scanner;

public class LivroMain {
    int opcao;
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        LivroClass l1 = new LivroClass();
        
        System.out.println("Livros:"
                + "\n1 - Adicionar"
                + "\n2 - Buscar");
        int opcao = ler.nextInt(); 
                       
        ler.nextLine();
        
        switch(opcao) {
            case 1:
                System.out.println("Digite os dados do livro:");
                
                System.out.println("Nome: ");
                l1.setNome(ler.nextLine());
                
                System.out.println("Preço para comprar: ");
                l1.setPreco_compra(ler.nextDouble());
                
                System.out.println("Preço para alugar: ");
                l1.setPreco_emprestimo(ler.nextDouble());
                
                System.out.println("Gênero: "
                        + "\n0 - Outro"
                        + "\n1 - Autoajuda"
                        + "\n2 - Aventura"
                        + "\n3 - Comédia"
                        + "\n4 - Culinária"
                        + "\n5 - Romance");
                l1.setGenero(ler.nextInt());
                
                System.out.println(l1);
                
                System.out.println("\nLivro adicionado..."
                        + "\nNome: " + l1.getNome()
                        + "\nPreço para comprar: " + l1.getPreco_compra() 
                        + "\nPreço para alugar: " + l1.getPreco_emprestimo() 
                        + "\nGênero: " + l1.generoLivro());
                
                break;
                
            case 2:    
                System.out.println("Tela para buscar livro...");
                
                System.out.println("\nEscolha o livro que deseja: "
                        + "\n1 - As crônicas de Nárnia - volume único"
                        + "\n2 - DEPENDENCIA AFETIVA: 100 PERGUNTAS PARA LIDAR COM O APEGO EXCESSIVO E DOENTIO"
                        + "\n3 - Harry Potter e a pedra filosofal"
                        + "\n4 - Henrique Fogaça - Um Chef Hardcore"
                        + "\n5 - Ninguém vira adulto de verdade"
                        + "\n6 - Último desejo - The Witcher - A saga do bruxo Geralt de Rívia");
                l1.buscarLivro(ler.nextInt());
                
                
                System.out.println("\nLivro Selecionado..."
                        + "\nNome: " + l1.getNome()
                        + "\nPreço para comprar: " + l1.getPreco_compra() 
                        + "\nPreço para alugar: " + l1.getPreco_emprestimo() 
                        + "\nGênero: " + l1.generoLivro());
        }
    }
}