package metodo_Classe_Instancia.data;

public class DataTeste {

	public static void main(String[] args) {
	
		Data d1 = new Data();
		System.out.println(d1.obterDataFormatada());
		
		Data d2 = new Data(29, "Maio", 1998);
		System.out.println(d2.obterDataFormatada());
	}
}
