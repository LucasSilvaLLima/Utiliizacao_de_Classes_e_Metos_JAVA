package metodo_Classe_Instancia.produto;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() { // CONSTRUTOR PADR?O 
		
	}
	
	Produto(String nomeInicial, double precoInicial) { // CONSTRUTOR DO PRODUTO
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() { // METODO QUE RETORNA O PRE?O COM DESCONTO
		
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) { // METODO QUE RETORNA O PRE?O COM DESCONTO MAIS O DESCONTO DO GERENTE 
		
		return preco * (1 - (desconto + descontoDoGerente));
	}
} 
		// POR MAIS QUE OS DOIS METODOS TENHAM O MESMO NOME A ASSINATURA DOS METODOS ? DIFERENTE 
		// QUE ? OQUE A LINGUAGEM LEVA EM CONSIDERA??O PARA A CRIA??O