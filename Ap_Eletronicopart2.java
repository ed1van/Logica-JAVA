package poo;

public class Ap_Eletronicopart2 {

	public static void main(String[] args) {


		Ap_Eletronico celu = new Ap_Eletronico();
		
		celu.Cor = "Preto";
		celu.Modelo = "Samsung";
		celu.Carga = 53;
		celu.Carregador = "Turbo";
		celu.status();
		
		celu.liga();
		celu.mexer();

	}

}
