package View;

import Model.Carrinhos;
import Model.Produtos;
import java.util.Scanner;

public class ProdutosMain {
  public static void main(String args[]) {
      int opcao;
      
      Scanner ler = new Scanner(System.in);
      
      Produtos p1 = new Produtos();
      
      Carrinhos c1 = new Carrinhos();
      
      do {
            System.out.println("\nSelecione um produto: "
                 + "\n0 - Continuar"
                 + "\n1 - Maçã Gala grande. R$: 3.20" 
                 + "\n2 - Cadeira de praia verde. R$ 49.99"
                 + "\n3 - Chocolate branco marca garoto. R$4.70"
                 + "\n4 - Cerveja Kaiser com álcool 473ml. R$2.79"
                 + "\n5 - Água Mineral Crystal sem Gás 1,5 Litros. R$ 8.99");
         opcao = ler.nextInt();

         switch(opcao) {
             case 0:
                 System.out.println(c1.ExibeCarrinho());
                 
                 break;

             case 1:
                 p1.codigo = 00001;
                 p1.descProduto = "Maçã Gala grande";
                 p1.preco = (float) 3.20; 

                 break;

             case 2:
                 p1.codigo = 00002;
                 p1.descProduto = "Cadeira de praia verde";
                 p1.preco = (float) 49.99; 

                 break;

             case 3:
                 p1.codigo = 00003;
                 p1.descProduto = "Chocolate branco marca garoto";
                 p1.preco = (float) 4.70; 

                 break;

             case 4:
                 p1.codigo = 00004;
                 p1.descProduto = "Cerveja Kaiser com álcool 473ml";
                 p1.preco = (float) 2.79; 

                 break;

             case 5:
                 p1.codigo = 00005;
                 p1.descProduto = "Água Mineral Crystal sem Gás 1,5 Litros";
                 p1.preco = (float) 8.99; 

                 break;
                 
            default:
                System.out.println("Opção inválida!");
         }

         System.out.println("\nDigite a quantidade para o produto: ");
         p1.quantidade = ler.nextInt();

         System.out.println("\nDados do produto..." + p1.ListaraDados()); 
      } while (opcao != 0);
      
  }  
}
