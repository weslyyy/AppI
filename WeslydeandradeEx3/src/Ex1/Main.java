package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Cliente c1 =  new Cliente();
        
        System.out.println("Digite seu nome: ");
        c1.setNome(ler.nextLine());
        
        System.out.println("Digite sua idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite sua renda: ");
        c1.setRenda(ler.nextDouble());
        
        System.out.println("Retultados...");
        
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());
        System.out.println("Renda: " + c1.getRenda());
        
        System.out.println("Classificação de idade: " + c1.classificarIdade());
        System.out.println("Classificação de renda: " + c1.classificarRenda());
    }
}
