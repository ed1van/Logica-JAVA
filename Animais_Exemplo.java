package heran�a_exerc�cios;

public class Animais_Exemplo {

	public static void main(String[] args) {


		Cachorro ca = new Cachorro();
		Cavalo valo = new Cavalo();
		Pregui�a pre = new Pregui�a();
		
		//cachorro
		
		ca.setRa�a("Labrador");
		ca.setIdade(12);
		ca.getCorrer();
		ca.correndo();
		ca.latindo();
		
		System.out.println("Um cachorro da ra�a "+ca.getRa�a()+" que possui "+ca.getIdade()+" anos de idade.");
		
		//cavalo
		valo.setRa�a("Shire");
		valo.setIdade(32);
		valo.getCorrer();
		valo.correndo();
		valo.relinchando();
		
		System.out.println("Um cavalo da ra�a "+valo.getRa�a()+" que possui "+valo.getIdade()+" anos de idade.");
		
		//Pregui�a
		
		pre.setRa�a("Bradypus Tridactylus");
		pre.setIdade(48);
		pre.getSubir();
		pre.subindo();
		pre.emitindo();
		
		System.out.println("Uma pre�ica da ra�a "+pre.getRa�a()+" que possui "+pre.getIdade()+" anos de idade.");
		
	}
		
}
