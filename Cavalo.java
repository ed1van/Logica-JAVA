package herança_exercícios;

public class Cavalo extends Animal {
	
	
	private String correr;
	
	//metodo
	
	public void correndo()
	{
		System.out.println("Está correndo ");
	}
	public void relinchando()
	{
		System.out.println("e está relinchando");
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

}
