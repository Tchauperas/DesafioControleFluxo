package util;

public class ParametrosInvalidos extends Exception {
	
	public ParametrosInvalidos() {
		super();
	}
	
	public ParametrosInvalidos(String mensagem) {
		super(mensagem);
	}
	
	public ParametrosInvalidos(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
	public ParametrosInvalidos(Throwable causa) {
		super(causa);
	}
}
