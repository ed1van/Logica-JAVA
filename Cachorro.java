package herança_exercícios;

public class Cachorro extends Animal {

	
	//atributos
	
	private String correr;
	
	
	//metodos
	
	public void correndo()
	{
		System.out.println("Está correndo ");
	}
	public void latindo()
	{
		System.out.println("e está latindo");
	}


	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
}
