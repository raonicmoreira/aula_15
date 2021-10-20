package modelo;

public class Motorista {
    private String nome;
    private String habilitacao;
    private int idade;

    public Motorista() {
    }

    public Motorista(String nome, String habilitacao, int idade) {
        this.nome = nome;
        this.habilitacao = habilitacao;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getHabilitacao() {
        return habilitacao;
    }
    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
