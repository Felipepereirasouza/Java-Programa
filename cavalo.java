package Poliformismo.Herança;

public class cavalo extends Animal {

	//atribuições
	private String cor;
	private String celas;
	private String dentes;
	private String chicotadas;
	private String ferradura;
	
	
	//construtor
	public cavalo (String nome,String idade,String classe,String ferimento,String cor,String dentes,String chicotadas,String ferraduras) 
	{
		super(nome,idade,classe,ferimento);
		this.cor=cor;
		this.celas=celas;
		this.dentes=dentes;
		this.ferradura=ferradura;
		
	}
	
	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getCelas() {
		return celas;
	}



	public void setCelas(String celas) {
		this.celas = celas;
	}



	public String getDentes() {
		return dentes;
	}



	public void setDentes(String dentes) {
		this.dentes = dentes;
	}



	public String getChicotadas() {
		return chicotadas;
	}



	public void setChicotadas(String chicotadas) {
		this.chicotadas = chicotadas;
	}



	public String getFerradura() {
		return ferradura;
	}



	public void setFerradura(String ferradura) {
		this.ferradura = ferradura;
	}


	public void imprimirinfo() {
		System.out.println("==========================");
		System.out.println("\nNome do animal:"+getNome()+"\nIdade:"+getIdade()+"\nTipo de Classe:"+getClasse()+"\ncontem ferimentos:"+getFerimento()+"\ncor:"+cor+"\nSaude bucal:"+dentes+"\nmarcas de chicotes:"+chicotadas+"\ncondições de ferraduras:"+ferradura);
		System.out.println("==========================");
	}
	
	
	

	
	
	
	
	
	
	
	
}
