package metodo_Classe_Instancia.data;

public class Data {

	int dia;
	String mes;
	int ano;

	Data() {
		this(1, "Janeiro", 1970);  // CONSTRUTOR COM DATA PADR?O 
	}
	
	Data(int dia, String mes, int ano) { // CONSTRUTOR PARA DEFINIR UMA DATA NA CRIA??O DO OBJETO
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() { // METODO QUE RETORNA UMA DATA FORMATADA 
		return String.format("Data de Nascimento: %d/%s/%d", dia, mes, ano);
	}
}
