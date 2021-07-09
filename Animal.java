package Poliformismo.Herança;



public class Animal {

	

	//Superclasse ou também conhecida como classe mãe
	//declaramos os atributos da classe Pessoa
	private String nome;
	private String idade;
	private String classe;
	private String ferimento;
	
	
	public Animal ( String nome,String idade,String classe,String ferimento) 
	{
		
		super();
		this.nome = nome;
		this.idade = idade;
		this.classe=classe;
		this.ferimento=ferimento;
	}
	
	public void imprimirinfo() {
	
	this.nome=nome;
	this.idade=idade;
	this.classe=classe;
	this.ferimento=ferimento;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getFerimento() {
		return ferimento;
	}

	public void setFerimento(String ferimento) {
		this.ferimento = ferimento;
	}
	
	
	
	
	
	
}

