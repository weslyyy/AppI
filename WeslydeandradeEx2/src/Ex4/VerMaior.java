package Ex4;

import java.util.Scanner;

public class VerMaior {
    double valor1;
    double valor2;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite o primeiro valor: ");
        double valor1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double valor2 = ler.nextDouble();
        
        System.out.println("Primeiro valor: " + valor1);
        System.out.println("Segundo valor: " + valor2);
        
        if(valor1 >valor2) {
            System.out.println("Maior valor: " + valor1);
        } else if(valor1 < valor2) {
            System.out.println("maior valor: " + valor2);
        } else {
            System.out.println("Valores iguais");
        }             
    }    
}