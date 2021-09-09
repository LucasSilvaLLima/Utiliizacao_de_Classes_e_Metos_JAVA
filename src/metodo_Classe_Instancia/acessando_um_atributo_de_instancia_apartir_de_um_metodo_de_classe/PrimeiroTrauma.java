package metodo_Classe_Instancia.acessando_um_atributo_de_instancia_apartir_de_um_metodo_de_classe;

public class PrimeiroTrauma {

	int a = 3; // ATRIBUTO DE INSTÂNCIA 

	public static void main(String[] args) { // METODO DE CLASSE
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		
		System.out.println(p.a);
	}
}


	// ESSE EXEMPLO MOSTRA QUE APARTIR DE UM METODO DE CLASSE EU SÓ POSSO ACESSAR UM ATRIBUTO DE INSTÂNCIA
	// SE ANTES EU CRIAR UMA INSTÂNCIA 
	// MESMO QUE VOCÊ ESTAJA NA MESMA CLASSE, VOCÊ TEM QUE CRIAR UMA INSTÂNCIA