package heran�a_exerc�cios;

public class Pregui�a extends Animal {

	//atributos
	private String subir;
	
	

	public String getSubir() {
		return subir;
	}


	public void setSubir(String subir) {
		this.subir = subir;
	}
	
	//metodos
	@Override
	public void emitirsom() {

		System.out.println("(Pregui�a) aaaaa");
		
	}


	@Override
	public void correr() {
		System.out.println("(Pregui�a) Sobe na �rvore");
		
	}
	
}
