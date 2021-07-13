package Poliformismo.Herança;

public abstract class Animal_poli {
// atributos
	private String nome;
	private String idade;
	private String classe;
	private String ferimento;
		
	//construtor
	public Animal_poli(String nome, String idade, String classe, String ferimento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.classe = classe;
		this.ferimento = ferimento;
	
	}
	
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirsom();

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
