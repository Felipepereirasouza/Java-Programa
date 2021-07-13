package Poliformismo.Herança;

public class Cavalopoli extends Animal_poli {

	
	private String cela;
	private String peso;
	private String cor;
	private String marcaschicotes;
	
	
	public Cavalopoli(String nome, String idade, String classe, String ferimento, String cela, String peso, String cor,
			String marcaschicotes) {
		super(nome, idade, classe, ferimento);
		this.cela = cela;
		this.peso = peso;
		this.cor = cor;
		this.marcaschicotes = marcaschicotes;
	}

	

	public String getCela() {
		return cela;
	}



	public void setCela(String cela) {
		this.cela = cela;
	}



	public String getPeso() {
		return peso;
	}



	public void setPeso(String peso) {
		this.peso = peso;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getMarcaschicotes() {
		return marcaschicotes;
	}



	public void setMarcaschicotes(String marcaschicotes) {
		this.marcaschicotes = marcaschicotes;
	}



	@Override
	public void locomover() {
		System.out.println("cavalgar");
		
	}


	@Override
	public void alimentar() {
		System.out.println("Matos e maças");
		
	}


	@Override
	public void emitirsom() {
		System.out.println("Rugir");
		
	}
	
	public void imprimirinfo() {
		
		System.out.println("\nNome:"+getNome()+"\nIdade: "+getIdade()+"\nClasse"+getClasse()+"\nTipo de Ferimento:"+getFerimento()+"\ncela:"+cela+"\npeso:"+peso+"\ncor:"+cor+"Marcas chicotes:"+marcaschicotes);
	
	}
	
	
	
	
}
