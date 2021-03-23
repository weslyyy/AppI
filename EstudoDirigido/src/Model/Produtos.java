package Model;

public class Produtos {
    public int codigo;
    public String descProduto;
    public float preco; 
    public int quantidade;
    
    public String ListaraDados() {
       return "\nCódigo:  " + codigo
               + "\nDescrição do produto: " + descProduto
               + "\nPreço: " + preco
               + "\nQuantidade: " + quantidade;
    }
}
