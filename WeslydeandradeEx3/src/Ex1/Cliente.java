package Ex1;

public class Cliente {
    String nome;
    private int idade;
    private double renda;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return this.renda;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public String classificarIdade() {
        String resposta;
        if(this.idade >= 18) {
            resposta = "Maior de idade.";
        }
        else {
            resposta = "Menor de idade.";
        }
        return resposta;
    }
    
    public String classificarRenda() {
        String resposta;
        if(this.renda > 15000) {
            resposta = "Rico.";
        }
        else {
            resposta = "Pobre.";
        }
        return resposta;
    }
}

