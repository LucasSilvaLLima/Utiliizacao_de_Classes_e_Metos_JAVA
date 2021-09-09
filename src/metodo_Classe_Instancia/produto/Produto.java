package metodo_Classe_Instancia.produto;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() { // CONSTRUTOR PADRÃO 
		
	}
	
	Produto(String nomeInicial, double precoInicial) { // CONSTRUTOR DO PRODUTO
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() { // METODO QUE RETORNA O PREÇO COM DESCONTO
		
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) { // METODO QUE RETORNA O PREÇO COM DESCONTO MAIS O DESCONTO DO GERENTE 
		
		return preco * (1 - (desconto + descontoDoGerente));
	}
} 
		// POR MAIS QUE OS DOIS METODOS TENHAM O MESMO NOME A ASSINATURA DOS METODOS É DIFERENTE 
		// QUE É OQUE A LINGUAGEM LEVA EM CONSIDERAÇÃO PARA A CRIAÇÃO