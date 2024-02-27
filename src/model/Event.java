package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    private String nome;
    private String endereco;
    private String categoria;
    private LocalDateTime data;
    private String descricao;
    
	public Event(String nome, String endereco, String categoria, LocalDateTime data, String descricao) {
		this.nome = nome;
		this.endereco = endereco;
		this.categoria = categoria;
		this.data = data;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getHora() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return data.format(dateTimeFormatter);
	}
	
	public void setHora(LocalDateTime data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

  
}
