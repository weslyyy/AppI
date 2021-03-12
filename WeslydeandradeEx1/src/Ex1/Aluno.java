package Ex1;

import java.util.Scanner;

public class Aluno {
        String nome;
	double nota1;
	double nota2;
	double nota3;

        static Scanner ler = new Scanner(System.in);
        
	public static void main(String[] args) {	           
                System.out.println("Digite o nome do aluno: ");
                String nome = ler.nextLine();
                
                System.out.println("Digite a nota 1 do aluno: ");
                double nota1 = ler.nextDouble();
                
                System.out.println("Digite a nota 2 do aluno: ");
                double nota2 = ler.nextDouble();
                
                System.out.println("Digite a nota 3 do aluno: ");
                double nota3 = ler.nextDouble();
                
                System.out.println("Nome do aluno: " + nome);
                System.out.println("Nota 1: " + nota1);
                System.out.println("Nota 2: " + nota2);
                System.out.println("Nota 3: " + nota3);
                System.out.println("Média aritmética: " + (nota1 + nota2 + nota3) / 3);
                
	}

}