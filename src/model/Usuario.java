package model;

public class Usuario {
    private String nome;
    private String usuario;
    private String senha;
    private String cidade;
    private String email;
    private int idade;

    public Usuario(String nome, String usuario, String senha, String cidade, String email, int idade) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.cidade = cidade;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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
