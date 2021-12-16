package herança_exercícios;

public class Animais_Exemplo {

	public static void main(String[] args) {


		Cachorro ca = new Cachorro();
		Cachorro ca1 = new Cachorro();
		Cavalo valo = new Cavalo();
		Preguiça pre = new Preguiça();
		//Mamiferosons ma = new Mamiferosons();
		
		//cachorro Labrador
		
		ca.setRaça("Labrador");
		ca.setIdade(12);
		ca.correr();
		ca.emitirsom();
		ca.aniversario();
		ca.aniversario();
		System.out.println("Um cachorro da raça "+ca.getRaça()+" que possui "+ca.getIdade()+" anos de idade.");
		
		//cachorro poodle
		
		ca1.setRaça("Poodle");
		ca1.setIdade(5);
		ca1.correr();
		ca1.emitirsom();
		
		System.out.println("Um cachorro da raça "+ca1.getRaça()+" que possui "+ca1.getIdade()+" anos de idade.");
		
		//cavalo
		valo.setRaça("Shire");
		valo.setIdade(32);
		valo.correr();
		valo.emitirsom();
		
		
		System.out.println("Um cavalo da raça "+valo.getRaça()+" que possui "+valo.getIdade()+" anos de idade.");
		
		//Preguiça
		
		pre.setRaça("Bradypus Tridactylus");
		pre.setIdade(48);
		pre.correr();
		pre.emitirsom();
	
		
		System.out.println("Uma preçica da raça "+pre.getRaça()+" que possui "+pre.getIdade()+" anos de idade.");
		
	}
		
}
