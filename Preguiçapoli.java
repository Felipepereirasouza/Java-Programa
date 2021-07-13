package Poliformismo.Herança;

public class Preguiçapoli extends Animal_poli {

	private String garras;
	private String cor;
	private String peso;
	
	
	public Preguiçapoli(String nome, String idade, String classe, String ferimento, String garras, String cor,
			String peso) {
		super(nome, idade, classe, ferimento);
		this.garras = garras;
		this.cor = cor;
		this.peso = peso;
	}


	public String getGarras() {
		return garras;
	}


	public void setGarras(String garras) {
		this.garras = garras;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	@Override
	public void locomover() {
		System.out.println("Locomoção:pulando arvores lentamente");
		
	}


	@Override
	public void alimentar() {
		System.out.println("Alimentos:Folhas e frutas");
		
	}


	@Override
	public void emitirsom() {
		System.out.println("Emitir som:Preguiçoso demais para isso:");
		
	}


	public void imprimirinfo() {
		
		System.out.println("\nNome:"+getNome()+"\nIdade: "+getIdade()+"\nClasse"+getClasse()+"\nTipo de Ferimento:"+getFerimento()+"\ngarras:"+garras+"\ncor"+cor+"\npeso:"+peso);
		
	}





}
