package desafioarrays;

import java.util.Scanner;

//Escreva um programa em Java para ler a quantidade de elementos que serão 
//armazenados em um vetor A. Crie um vetor com o tamanho apropriado. Depois o 
//programa deve solicitar os números conforme a quantidade informada pelo usuário,
//e armazená-los no vetor A. Logo após imprimir o vetor A.

public class Vetor {
    public static void main(String[] args) {
        int quantidade;
       
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite quantos números deseja armazenar: ");
        quantidade = ler.nextInt();
        
        double a[] = new double[quantidade];
    
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nDigite o " + (i + 1) +"º número: ");
            a[i] = ler.nextDouble();
        }
    
        for (int i = 0; i < quantidade; i++) {
            System.out.println(i + 1 + "º número: " + a[i]);
        }
    }
}