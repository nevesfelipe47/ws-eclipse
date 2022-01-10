package br.com.aulajava;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String senha;

	public PessoaFisica(int id, String nome, String endereco, String cpf, String senha) {
		super(id, nome, endereco);
		this.cpf = cpf;
		this.senha = senha;
	}

	public PessoaFisica() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + "]";

		
	
	}
}
