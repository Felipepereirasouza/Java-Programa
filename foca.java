package Poliformismo.Herança;

public class foca extends Animal {

	private String cor;
	private String peso;
	private String unhas;
	private String dentes;
	
	
	
	public foca (String nome,String idade,String classe,String ferimento,String cor,String peso,String unhas,String dentes)
	{
		
		super (nome,idade,classe,ferimento);
		this.cor=cor;
		this.peso=peso;
		this.unhas=unhas;
		this.dentes=dentes;
		
		
	}
	
	
	public void imprimirinfo()
	{
		System.out.println("==========================");
		System.out.println("\nNome:"+getNome()+"\nidade:"+getIdade()+"\nTipo de classe:"+getClasse()+"\nTipos de ferimentos:"+getFerimento()+"\ncor:"+cor+"\nPeso:"+peso+"\ncondições do corpo:"+unhas+"\naparencia bocal:"+dentes);
		System.out.println("==========================");
	
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


	public String getUnhas() {
		return unhas;
	}


	public void setUnhas(String unhas) {
		this.unhas = unhas;
	}


	public String getDentes() {
		return dentes;
	}


	public void setDentes(String dentes) {
		this.dentes = dentes;
	}
	
	
	
	
	
	
	
}
