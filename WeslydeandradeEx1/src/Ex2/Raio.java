package Ex2;
    
import java.util.Scanner;

public class Raio {
    double valor;
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite o valor do raio da circunferência: ");
        double valor = ler.nextDouble();
        
        System.out.println("Valor: " + valor);
        System.out.println("Diâmetro: " + valor * 2);
    }
}
