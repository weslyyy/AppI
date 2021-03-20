package Ex5;

import java.util.ArrayList;
import java.util.Collections;

public class ComprasClass {
    private ArrayList<String> listaCompras = new ArrayList();
    private String item;
    String erro = "\nEste índice não existe!";
    int indice;

    public ArrayList<String> getItens() {
        return listaCompras;
    }

    public void setItens(ArrayList<String> listaDeCompras) {
        this.listaCompras = listaDeCompras;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    
    public String adicionarItem() {
        this.listaCompras.add(this.item);
        return "\nO item " + this.item + " foi adicionado com sucesso!";
    }
    
    public String consultarItem() {
        if (indice >= 0 && indice < this.listaCompras.size()) {
            return "\nÍndice: " + indice
                    + "\nItem: " + this.listaCompras.get(indice);
        } else {
            return erro;
        }
    }
    
    public String alterarItem() {
        if (indice >= 0 && indice < this.listaCompras.size()) {
            this.listaCompras.set(indice, this.item);
            return "\nO item " + this.listaCompras.get(indice) + " foi alterado com sucesso!";
        } else {
            return erro;
        }
    }
    
    public String exibirTamanhoLista() {
        return "\nQuantidade de itens da lista: " + this.listaCompras.size();
    }
    
    public String removerItem() {
        if (indice >= 0 && indice < this.listaCompras.size()) {
            this.listaCompras.remove(indice);
            return "\nO item " + this.item + " removido com sucesso!";
        } else {
            return erro;
        }
    }
    
    public ArrayList<String> classificarOrdemAlfabetica() {
        Collections.sort(this.listaCompras);
        return this.listaCompras;
    }
    
    public String limparLista() {
        this.listaCompras.clear();
        return "\nA lista de compras foi limpa com sucesso!";
    }    
}
