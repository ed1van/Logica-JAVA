package heran�a_exerc�cios;

public class Animais_Exemplo {

	public static void main(String[] args) {


		Cachorro ca = new Cachorro();
		Cachorro ca1 = new Cachorro();
		Cavalo valo = new Cavalo();
		Pregui�a pre = new Pregui�a();
		//Mamiferosons ma = new Mamiferosons();
		
		//cachorro Labrador
		
		ca.setRa�a("Labrador");
		ca.setIdade(12);
		ca.correr();
		ca.emitirsom();
		ca.aniversario();
		ca.aniversario();
		System.out.println("Um cachorro da ra�a "+ca.getRa�a()+" que possui "+ca.getIdade()+" anos de idade.");
		
		//cachorro poodle
		
		ca1.setRa�a("Poodle");
		ca1.setIdade(5);
		ca1.correr();
		ca1.emitirsom();
		
		System.out.println("Um cachorro da ra�a "+ca1.getRa�a()+" que possui "+ca1.getIdade()+" anos de idade.");
		
		//cavalo
		valo.setRa�a("Shire");
		valo.setIdade(32);
		valo.correr();
		valo.emitirsom();
		
		
		System.out.println("Um cavalo da ra�a "+valo.getRa�a()+" que possui "+valo.getIdade()+" anos de idade.");
		
		//Pregui�a
		
		pre.setRa�a("Bradypus Tridactylus");
		pre.setIdade(48);
		pre.correr();
		pre.emitirsom();
	
		
		System.out.println("Uma pre�ica da ra�a "+pre.getRa�a()+" que possui "+pre.getIdade()+" anos de idade.");
		
	}
		
}
