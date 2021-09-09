package metodo_Classe_Instancia.valor_vs_referencia;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a; // Atribuição por valor (Tipo Primitivos)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, "Janeiro", 2020);
		Data d2 = d1; // Atribuição por Referência (Objetos)
		
		d1.dia = 31;
		d2.mes = "Dezembro";
		d1.ano = 2021;
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}
