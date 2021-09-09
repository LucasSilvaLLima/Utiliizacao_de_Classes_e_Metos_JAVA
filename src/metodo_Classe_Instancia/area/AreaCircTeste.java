package metodo_Classe_Instancia.area;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		
		System.out.printf("Área do Circulo = %.2f \n\n", a.area()); //Metodo da Instância 
		
		System.out.printf("Área do Circulo = %.2f ", AreaCirc.area(20)); // Metodo da classe
	}
}
