package Ex3;

//3. Mariazinha tem 1,50m e cresce 2 centímetros por ano, 
//enquanto Maricota tem 1,10m e cresce 3 centímetros por ano. 
//Construir um programa que calcule e imprima quantos anos serão 
//necessários para que Maricota seja maior que Mariazinha.

public class Altura {
    public static void main(String[] args) {
        int alturaMariazinha = 150;
        int alturaMaricota = 110;
        int crescimentoMariazinha = 2;
        int crescimentoMaricota = 3;
        int anos = 0;
        
        while (alturaMariazinha >= alturaMaricota) {
            alturaMariazinha = alturaMariazinha + crescimentoMariazinha;

            alturaMaricota = alturaMaricota + crescimentoMaricota;

            anos = anos + 1;
        }
        
        System.out.println("Depois de " + anos + " anos Maricota vai ter " + alturaMaricota + "m e será maior que Mariazinha, com " + alturaMariazinha + "m.");
    }
}

