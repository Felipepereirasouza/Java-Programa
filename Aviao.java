package ProgramaçãoObjetos;

public class Aviao {
	//Atributos da classe
	private String marca;
	private String modelo;
	private String proprietario;
	private String numeracao;
	
	//metodo construtor
	
	public Aviao (String marca,String modelo,String proprietario,String numeracao)
	{
		this.marca=marca;
		this.modelo=modelo;
		this.proprietario=proprietario;
		this.numeracao=numeracao;
	}
	
	
	public void imprimirinfo() {
		
		System.out.println("\nmarca:"+marca+"\nmodelo:"+modelo+"\nproprietario:"+proprietario+"\nnumeração:"+numeracao);
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public String getNumeracao() {
		return numeracao;
	}


	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}
	
	
	
	
	
	
	
	
	
	
}
