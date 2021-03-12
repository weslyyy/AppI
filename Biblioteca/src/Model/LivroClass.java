package Model;

public class LivroClass {
    private String nome;
    private double preco_compra, preco_emprestimo;  
    private int genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(double preco_compra) {
        this.preco_compra = preco_compra;
    }

    public double getPreco_emprestimo() {
        return preco_emprestimo;
    }

    public void setPreco_emprestimo(double preco_emprestimo) {
        this.preco_emprestimo = preco_emprestimo;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public LivroClass() {
        
    }

    @Override
    public String toString() {
        return "Informações do livro adicionado:" + 
                "\nnome: " + this.nome + 
                "\nPreço para comprar: " + this.preco_compra + 
                "\nPreço para alugar: " + this.preco_emprestimo + 
                "\ngenero: " + this.genero;
    }
    
    public String generoLivro() {
        switch(this.genero) {
            case 0:
                return "Outro";
                
            case 1:
                return "Autoajuda";
            
            case 2:
                return "Aventura";
                
            case 3:
                return "Comédia";
                
            case 4:
                return "Culinária";
                
            case 5:
                return "Romance";
                
            default:
                return "Outro";
        }
    }   
    
    public void buscarLivro(int opcao) {
        switch(opcao) {
            case 1:
                this.nome = "As crônicas de Nárnia - volume único";
                this.preco_compra = 29.90;
                this.preco_emprestimo = 3.00;  
                this.genero = 2;
                
                break;
                
            case 2:
                this.nome = "DEPENDENCIA AFETIVA: 100 PERGUNTAS PARA LIDAR COM O APEGO EXCESSIVO E DOENTIO";
                this.preco_compra = 40.00;
                this.preco_emprestimo = 6.00;  
                this.genero = 1;
                
                break;
                
            case 3:
                this.nome = "Harry Potter e a pedra filosofal";
                this.preco_compra = 26.99;
                this.preco_emprestimo = 2.49;  
                this.genero = 2;
                 
                break;
                
            case 4:
                this.nome = "Henrique Fogaça - Um Chef Hardcore";
                this.preco_compra = 42.15;
                this.preco_emprestimo = 7.60;  
                this.genero = 4;
                
                 break;
                
            case 5:
                this.nome = "Ninguém vira adulto de verdade";
                this.preco_compra = 22.90;
                this.preco_emprestimo = 1.60;  
                this.genero = 3;
                
                break;
                
            case 6:
                this.nome = "Último desejo - The Witcher - A saga do bruxo Geralt de Rívia";
                this.preco_compra = 29.90;
                this.preco_emprestimo = 3.49;  
                this.genero = 5;
                
                break;
                
            default:
                this.nome = "Opção inválida!";
                   
               break;
        }
        
    }
    
}