package Ex1;

import java.util.Scanner;

public class PositivoOuNegativo {
    int numero;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite o número para verificar: ");
        int numero = ler.nextInt();
        
        System.out.println("Número: " + numero);
        
        if(numero >= 0) {
            System.out.println("Positivo");
        } else if(numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Preencha o campo corretamente!");
        }
    }
}
