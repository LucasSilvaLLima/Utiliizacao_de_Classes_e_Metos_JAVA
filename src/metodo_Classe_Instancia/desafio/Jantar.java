package metodo_Classe_Instancia.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.3);
		Comida c2 = new Comida("Feijão", 0.2);
		
		Pessoa p1 = new Pessoa("Lucas Silva", 56);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
	}
}
//	ESSE PROJETO TEM COMO FOCO O TREINAMENTO NA CRIAÇÃO DE METODOS CLASSES E SEU RELACIONAMENTO
//	MOSTRA O QUANTO DE PESO ELE GANHOU COM O JANTAR 