package Poliformismo.Herança;

public class cachorro extends Animal {
	//Atribuição
	
	private String cor;
	private String habitat;
	private String raça;
	private String tamanho;
	
	
	//Construtor
	public cachorro (String nome,String idade,String classe,String ferimento,String cor,String habitat,String raça,String tamanho) {
		
		super(nome,idade,classe,ferimento);
		this.cor=cor;
		this.habitat=habitat;
		this.raça=raça;
		this.tamanho=tamanho;
		
		
	}


	public void imprimirinfo() {
		System.out.println("==========================");
		System.out.println("\nNome do animal:"+getNome()+"\nIdade:"+getIdade()+"\nTipo de classe"+getClasse()+"\nTipo de ferimento:"+getFerimento()+"\nCor:"+cor+"\nHabitat:"+habitat+"\nRaça:"+raça+"\nTamanho:"+tamanho);
		System.out.println("==========================");
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getRaça() {
		return raça;
	}


	public void setRaça(String raça) {
		this.raça = raça;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
	


}