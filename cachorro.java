package Poliformismo.Heran�a;

public class cachorro extends Animal {
	//Atribui��o
	
	private String cor;
	private String habitat;
	private String ra�a;
	private String tamanho;
	
	
	//Construtor
	public cachorro (String nome,String idade,String classe,String ferimento,String cor,String habitat,String ra�a,String tamanho) {
		
		super(nome,idade,classe,ferimento);
		this.cor=cor;
		this.habitat=habitat;
		this.ra�a=ra�a;
		this.tamanho=tamanho;
		
		
	}


	public void imprimirinfo() {
		System.out.println("==========================");
		System.out.println("\nNome do animal:"+getNome()+"\nIdade:"+getIdade()+"\nTipo de classe"+getClasse()+"\nTipo de ferimento:"+getFerimento()+"\nCor:"+cor+"\nHabitat:"+habitat+"\nRa�a:"+ra�a+"\nTamanho:"+tamanho);
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


	public String getRa�a() {
		return ra�a;
	}


	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
	


}