package heran�a_exerc�cios;

public class Pregui�a extends Animal {

	//atributos
	private String subir;
	
	
	//metodos
	public void subindo()
	{
		System.out.println("Est� subindo numa arvore");
	}
	public void emitindo()
	{
		System.out.println("e est� emitindo som");
	}

	public String getSubir() {
		return subir;
	}


	public void setSubir(String subir) {
		this.subir = subir;
	}
	
}
