package herança_exercícios;

public class Animais_Exemplo {

	public static void main(String[] args) {


		Cachorro ca = new Cachorro();
		Cavalo valo = new Cavalo();
		Preguiça pre = new Preguiça();
		
		//cachorro
		
		ca.setRaça("Labrador");
		ca.setIdade(12);
		ca.getCorrer();
		ca.correndo();
		ca.latindo();
		
		System.out.println("Um cachorro da raça "+ca.getRaça()+" que possui "+ca.getIdade()+" anos de idade.");
		
		//cavalo
		valo.setRaça("Shire");
		valo.setIdade(32);
		valo.getCorrer();
		valo.correndo();
		valo.relinchando();
		
		System.out.println("Um cavalo da raça "+valo.getRaça()+" que possui "+valo.getIdade()+" anos de idade.");
		
		//Preguiça
		
		pre.setRaça("Bradypus Tridactylus");
		pre.setIdade(48);
		pre.getSubir();
		pre.subindo();
		pre.emitindo();
		
		System.out.println("Uma preçica da raça "+pre.getRaça()+" que possui "+pre.getIdade()+" anos de idade.");
		
	}
		
}
