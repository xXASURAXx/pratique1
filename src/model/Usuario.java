package model;

public class Usuario {
    private String nome;
    private String cidade;
    private String email;
    private int idade;

    public Usuario(String nome, String cidade, String email, int idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
}
