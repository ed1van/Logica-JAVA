package heran�a_exerc�cios;

public class Cavalo extends Animal {
	
	
	private String correr;
	
	//metodo
	
	public void correndo()
	{
		System.out.println("Est� correndo ");
	}
	public void relinchando()
	{
		System.out.println("e est� relinchando");
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

}
