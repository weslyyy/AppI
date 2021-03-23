package Model;

public class Carrinhos {
    private Produtos itens[];

    public Produtos[] getItens() {
        return itens;
    }

    public void setItens(Produtos[] itens) {
        this.itens = itens;
    }
    
    public String ExibeCarrinho() {
        return "\nItens do carrinho...\n" + this.itens;
    }
    
    public String FecharCompra() {
        return "Os produtos serão enviados, verifique seu email e pague o boleto!";
    }
}
