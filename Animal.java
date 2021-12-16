package heran�a_exerc�cios;

public abstract class Animal {

	//Atributos
	private String ra�a;
	private int idade;
	
	//metodos que s�o fixos, o usuario nao altera
	public abstract void emitirsom();
	public abstract void correr();
	
	//metodo
	
	public void aniversario()
	{
		idade++;
	}
	
	//gets e sets

	public String getRa�a() {
		return ra�a;
	}


	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}



	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
}
