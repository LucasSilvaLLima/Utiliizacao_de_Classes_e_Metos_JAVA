package metodo_Classe_Instancia.valor_vs_referencia;

public class Data {

	int dia;
	String mes;
	int ano;

	Data() {
		this(1, "Janeiro", 1970);  // CONSTRUTOR COM DATA PADRÃO 
	}
	
	Data(int dia, String mes, int ano) { // CONSTRUTOR PARA DEFINIR UMA DATA NA CRIAÇÃO DO OBJETO
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() { // METODO QUE RETORNA UMA DATA FORMATADA 
		return String.format("Data de Nascimento: %d/%s/%d", dia, mes, ano);
	}
}
