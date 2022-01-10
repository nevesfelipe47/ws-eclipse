package br.com.aulajava;

import java.util.Objects;
import java.util.Random;

public class Pessoa {
	private int id;
	private String nome;
	private String endereco;
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	public Pessoa(int id) {
		super();
		this.id = id; 
	}
	public Pessoa(int id,String nome, String endereco) {
		super();
		this.id = id;
		this.nome= nome;
		this.endereco = endereco;
	}
	public Pessoa() {
		super();
	}

	public static void gerarNumero() {
		// isntacia um objeto da classe Random usando o construtor basico
		Random gerador = new Random();
		System.out.println("Numero gerado: " + gerador.nextInt(100));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return id == other.id;
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

}
