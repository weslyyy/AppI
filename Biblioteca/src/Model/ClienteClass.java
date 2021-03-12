package Model;

public class ClienteClass {
    private String nome;
    private int cpf;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ClienteClass() {
    
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome + 
                "\nCPF: " + this.cpf + 
                "\nEmail: " + this.email + 
                "\nSenha:" + this.senha;
    }  
}
