package poo;

public class Aviãopart2 {

	public static void main(String[] args) {


		Avião av1 = new Avião();
		av1.cor = "Branco";
		av1.Modelo = "Airbus A320";
		av1.quantidade = 200;
		
		av1.status();
		
		av1.liga();
		
		av1.partida();
		

	}

}
