package poo;

public class Ap_Eletronico {
	
	
	String Cor;
	String Modelo;
	int Carga;
	String Carregador;
	boolean Funcionalidade;
	
	public void liga()
	{
		Funcionalidade=true;
	}
	public void desligado()
	{
		Funcionalidade=false;
	}
	public void mexer()
	{
		if(Funcionalidade==true)
		{
			System.out.println("O celular est� diponivel para ser acessado");
		}else {
			System.out.println("O celular n�o pode ser acessado!!!");
		}
	}	
	 	 public void status()
	{
		System.out.println("A cor do celular � "+this.Cor);
		System.out.println("O modelo do celular � "+this.Modelo);
		System.out.println("A carga do celular est� em "+this.Carga+" %");
		System.out.println("O carregador do celular � "+this.Carregador);
	}
	

}
