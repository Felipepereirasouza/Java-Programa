package Poliformismo.Herança;

public class Testeanimalpoli {

	public static void main(String[] args) {
		
		Cachorropoli doug = new Cachorropoli ("Doug", "21", "mamifero", "sarnas", "branco", "bulldog", "grande");
		doug.alimentar();
		doug.emitirsom();
		doug.locomover();
		doug.imprimirinfo();
		
		Cachorropoli kaka = new Cachorropoli ("kaka", "15", "mamifero", "sarnas", "branco", "bulldog", "grande");
		kaka.alimentar();
		kaka.emitirsom();
		kaka.locomover();
		kaka.imprimirinfo();
		
		Cavalopoli pepano = new Cavalopoli("pepano", "20","mamifero","mordidas de cão","usa celas","peso","Amarelo", "MArcas de chicotes");
		pepano.alimentar();
		pepano.emitirsom();
		pepano.locomover();
		pepano.imprimirinfo();
		
		Cavalopoli felipinho = new Cavalopoli("Felipinho", "14","mamifero","mordidas de cão","usa celas","peso","marrom", "MArcas de chicotes");
		felipinho.alimentar();
		felipinho.emitirsom();
		felipinho.locomover();
		felipinho.imprimirinfo();
		
		
		Preguiçapoli bob = new Preguiçapoli ("Bob", "21", "mamifero", "mordidas de leão", "quebradas", "Branco","100 kilos");
		bob.alimentar();
		bob.emitirsom();
		bob.locomover();
		bob.imprimirinfo();
		
		Preguiçapoli taff = new Preguiçapoli ("Taff", "22", "mamifero", "mordidas de leão", "quebradas", "marrom","500 kilos");
		taff.alimentar();
		taff.emitirsom();
		taff.locomover();
		taff.imprimirinfo();
	
	
	
	}

}
