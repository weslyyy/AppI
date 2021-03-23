package Ex2;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double calcularDesconto() {
        return this.valor * 0.025;   
        }
    
    public static void main(String[] args) {
        Produto p1 = new Produto();
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        p1.setNome(ler.nextLine());
        
        System.out.println("Digite o valor do produto: ");
        p1.setValor(ler.nextInt());
    
        System.out.println("Nome do produto: " + p1.getNome());
        System.out.println("Valor do produto: " + p1.getValor());
        System.out.println("Desconto: " + p1.calcularDesconto());
    }
}
