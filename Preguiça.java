package herança_exercícios;

public class Preguiça extends Animal {

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

		System.out.println("(Preguiça) aaaaa");
		
	}


	@Override
	public void correr() {
		System.out.println("(Preguiça) Sobe na árvore");
		
	}
	
}
