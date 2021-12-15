package herança_exercícios;

public class Animal {

	//Atributos
	private String raça;
	private int idade;
	
	
	
	//metodo
	
	public void aniversario()
	{
		idade++;
	}
	
	//gets e sets

	public String getRaça() {
		return raça;
	}


	public void setRaça(String raça) {
		this.raça = raça;
	}



	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
}
