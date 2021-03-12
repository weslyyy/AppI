package Ex3;

import java.util.Scanner;

public class Variavel {
    double variavel;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite a variável real: ");
        double variavel = ler.nextDouble();
        
        double dobro = variavel * 2;
        double triploDobro = dobro * 3;
        
        System.out.println("Dobro: " + dobro);
        System.out.println("Triplo do dobro: " + triploDobro);
        System.out.println("Metade do triplo do dobro: " + (triploDobro / 2));
        System.out.println("Quadrado da variável: " + Math.pow(variavel, 2));
        System.out.println("Quinta parte do dobro: " + (2 * dobro) / 5);
    }
}