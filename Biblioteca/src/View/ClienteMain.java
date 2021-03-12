package View;

import Model.ClienteClass;
import java.util.Scanner;

public class ClienteMain {
    int opcao;
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        ClienteClass c1 = new ClienteClass();
        
                System.out.println("Cliente:"
                + "\n1 - Logar-se"
                + "\n2 - Cadastrar-se");
        int opcao = ler.nextInt(); 
        
        switch(opcao) {
            case 1:
                System.out.println("Tela de login... ");
                
                ler.nextLine();
                System.out.println("Digite seu email: ");
                c1.setEmail(ler.nextLine());
                
                System.out.println("Digite sua senha: ");
                c1.setSenha(ler.nextLine());
                
                System.out.println("Logado como " + c1.getEmail() + ".");
                
                break;
                
            case 2:
                System.out.println("Tela de cadastro, digite suas informações...");
                
                ler.nextLine();
                System.out.println("Nome: ");
                c1.setNome(ler.nextLine());
                
                System.out.println("CPF: ");
                c1.setCpf(ler.nextInt());
                
                ler.nextLine();
                System.out.println("Email: ");
                c1.setEmail(ler.nextLine());
                
                System.out.println("Senha: ");
                c1.setSenha(ler.nextLine());

                System.out.println("Cadastrado com sucesso"
                        + "\nDados...");
                System.out.println(c1);

                break;
                
            default:
                System.out.println("Opção inválida!");
                
                break;
        }
    }
}

