package metodo_Classe_Instancia.acessando_um_atributo_de_instancia_apartir_de_um_metodo_de_classe;

public class PrimeiroTrauma {

	int a = 3; // ATRIBUTO DE INST?NCIA 

	public static void main(String[] args) { // METODO DE CLASSE
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		
		System.out.println(p.a);
	}
}


	// ESSE EXEMPLO MOSTRA QUE APARTIR DE UM METODO DE CLASSE EU S? POSSO ACESSAR UM ATRIBUTO DE INST?NCIA
	// SE ANTES EU CRIAR UMA INST?NCIA 
	// MESMO QUE VOC? ESTAJA NA MESMA CLASSE, VOC? TEM QUE CRIAR UMA INST?NCIA