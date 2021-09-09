package metodo_Classe_Instancia.produto;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 2000);
		Produto p2 = new Produto("Xbox One", 1300);
		Produto p3 = new Produto("TV 4k 65'", 4000);

		Produto.desconto = 0.30;
		
		System.out.printf("%s com %.2f De Desconto\nDe %.2f por %.2f Aproveite\n\n", p1.nome, Produto.desconto,
				p1.preco, p1.precoComDesconto());
		System.out.printf("%s com %.2f De Desconto\nDe %.2f por %.2f Aproveite\n\n", p2.nome, Produto.desconto,
				p2.preco, p2.precoComDesconto(0));
		System.out.printf("%s com %.2f De Desconto \nDe %.2f por %.2f Aproveite\n\n", p3.nome, Produto.desconto,
				p3.preco, p3.precoComDesconto(10));
	}
}
