package metodo_Classe_Instancia.area;

public class AreaCirc {

	double raio;
	static final double PI = 3.1415;

	// CONSTRUTOR PARA A INSERÇÃO DO RAIO NA CRIAÇÃO DO OBJTO
	AreaCirc(double raioFinal) {
		raio = raioFinal;
	}
	
	// METODO DA INSTÂCIA 
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	// METODO DA CLASSE
		static double area(double raio) {
			return PI * Math.pow(raio, 2);
	}
}
 