package metodo_Classe_Instancia.equals;

public class Usuario {

	String nome;
	String email;
	
	public boolean equals(Object objeto) { // METODO PARA A VALIDA??O DO NOME E EMAIL

		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return this.nome.length();
	}
}
