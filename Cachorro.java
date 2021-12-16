package herança_exercícios;

public class Cachorro extends Animal {

	
	//atributos
	
	private String correr;
	
	

	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	//metodos
	@Override
	public void emitirsom() {

		System.out.println("(Cachorro) Latidos...");
		
	}


	@Override
	public void correr() {
		System.out.println("(Cachorro) Corre");
		
	}
	
}
