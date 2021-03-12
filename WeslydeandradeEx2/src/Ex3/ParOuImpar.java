package Ex3;

import java.util.Scanner;

public class ParOuImpar {
    int valor;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite o valor: ");
        int valor = ler.nextInt();
        
        System.out.println("Valor: " + valor);
        
        if((valor % 2) == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }    
    }    
}

//4 - Faça um algoritmo que leia dois valores reais e exiba ao final qual dos dois é o maior.