package Ex1;

import java.util.Scanner;

//1. Faça um programa que receba somente nºs positivos e exibe e calcule:
//o número digitado
//a soma dos números digitados
//a quantidade de números digitados
//a média dos números digitados

public class Numero {
    public static void main(String[] args) {
        int quantidade;
        double soma = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quantos números precisa calcular? (Apenas positivos, negativos receberam valor de zero!)");
        quantidade = ler.nextInt();
        
        double numeros[]  = new double[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nDigite o " + (i + 1) +"º número: ");
            numeros[i] = ler.nextDouble();
            
             if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        } 
        
        for (int i = 0; i < quantidade; i++) {
            soma = soma + numeros[i];
        }
        
        System.out.println("\nSoma dos números: " + soma + "\n");
        
        System.out.println("\nQuantidade de números: " + numeros.length + "\n");
        
        System.out.println("\nMédia dos números: " + soma / numeros.length + "\n");
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println(i + 1 + "º número: " + numeros[i]);
        }
        
        
       
    }
}

