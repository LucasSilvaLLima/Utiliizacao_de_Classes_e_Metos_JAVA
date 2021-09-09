package metodo_Classe_Instancia.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
	 this.peso += comida.pesoComida;	
	}
	
	String apresentar() {
		return "Ola eu sou" + nome + "e temho " + peso;
	}
}

