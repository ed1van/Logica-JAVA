package herança_exercícios;

public class Cavalo extends Animal {
	
	
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
		System.out.println("(Cavalo) Relinchar");
		
	}


	@Override
	public void correr() {
		System.out.println("(Cavalo) Corre");
		
	}

}
