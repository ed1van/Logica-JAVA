package heran�a_exerc�cios;

public class Cachorro extends Animal {

	
	//atributos
	
	private String correr;
	
	
	//metodos
	
	public void correndo()
	{
		System.out.println("Est� correndo ");
	}
	public void latindo()
	{
		System.out.println("e est� latindo");
	}


	public String getCorrer() {
		return correr;
	}


	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
}
