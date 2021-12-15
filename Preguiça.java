package herança_exercícios;

public class Preguiça extends Animal {

	//atributos
	private String subir;
	
	
	//metodos
	public void subindo()
	{
		System.out.println("Está subindo numa arvore");
	}
	public void emitindo()
	{
		System.out.println("e está emitindo som");
	}

	public String getSubir() {
		return subir;
	}


	public void setSubir(String subir) {
		this.subir = subir;
	}
	
}
