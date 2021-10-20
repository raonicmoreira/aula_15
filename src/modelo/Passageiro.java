package modelo;

public class Passageiro {
    private String nome;
    private String identidade;

    public Passageiro() {
    }

    public Passageiro(String nome, String identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdentidade() {
        return identidade;
    }
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    } 
}
