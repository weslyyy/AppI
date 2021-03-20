package Ex2;

import java.util.Scanner;

//2. Faça um programa onde o usuário digita vários números e, 
//quando digitar 0, o programa pára e soma os valores digitados.

public class Numero2 {
    public static void main(String[] args) {
        int i = 0;
        double soma = 0;
        double numeros[]  = new double[100];
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite os números: \n"
                + "(Para cancelar digite 0)\n");
        
        do {
                System.out.println("\nDigite o " + (i++ + 1) +"º número: ");
                numeros[i] = ler.nextDouble();
            
        } while (numeros[i] != 0);
        
        for (i = 1; i < numeros[i]; i++) {
            soma = soma + numeros[i];
        }
        
        System.out.println("\nSoma dos números: " + soma + "\n");
    }    
}


