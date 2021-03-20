package Ex4;

import java.util.Scanner;

//4. Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
//Dada a massa inicial, em gramas, fazer um programa em Java que calcule o tempo 
//necessário para que essa massa se torne menor que 0,5 grama. O programa deve 
//escrever a massa inicial, a massa final e o tempo calculado em horas, minutos 
//e segundos.

public class materialRadioativo {
    public static void main(String[] args) {
        double gramas;
        int segundos = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a massa em gramas: ");
        gramas = ler.nextInt();
        
        System.out.println("Massa Inicial: " + gramas);
        
        do {
            gramas = gramas / 2;
            segundos = segundos + 50;
        } while (gramas > 0.5);
        
        System.out.println("Massa Final: " + gramas);
        System.out.println("Horas: " + segundos / 3600);
        System.out.println("Minutos: " + segundos / 60);
        System.out.println("Segundos: " + segundos);
    }
}