package br.com.aulajava;

public class PessoaTeste {

	public static void main(String[] args) {
		testandoToString();
		
		// instaciando objeto sem utilizar passagem de argumento
		Pessoa pessoaSemArgumento = new Pessoa();
	

		// instaciando objeto sem utilizar passagem de argumento
		Pessoa pessoaSomenteID = new Pessoa(1);

		// instaciando objeto sem utilizar passagem de argumento
		Pessoa pessoaTodosAtributos = new Pessoa(1,"Maria","Av. Brasil, 314");
	}
	
	private static void testandoToString() {
		//acessando o objeto sem a implementação do toString na classe... 
		Pessoa pessoaTodosAtributos = new Pessoa(1,"Maria","Av. Brasil, 314");
		
		System.out.println("Conteudo do objeto Pessoa: " + pessoaTodosAtributos);
	}
	

}
