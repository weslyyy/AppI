package Ex6;

import java.util.ArrayList;
import java.util.Collections;

//6. Criar um programa em Java que consistem em:
//- Listar números de 1 a 50;
//- Exibir a lista na horizontal e vertical;
//- Exibir o tamanho da lista;
//- Somar os valores da lista;

public class Numero3 {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList();
        int numero;
        int soma = 0;
        
        System.out.println("Lista de números(vertical): \n");
        
        for (numero = 0; numero <= 50; numero++) {
            listaNumeros.add(numero);
        }
        
        for (int i = 1; i <= 50; i++) {
            System.out.println(listaNumeros.get(i));
        }
        
        for (int i = 1; i <= 50; i++) {
            soma = soma + listaNumeros.get(i);
        }
        
        System.out.println("\nLista de números(horizontal): \n");
        
        listaNumeros.remove(0);
        
        Collections.sort(listaNumeros);
        
        System.out.println(listaNumeros);
        
        System.out.println("Soma dos valores: " + soma);
    }
}