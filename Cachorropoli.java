package Poliformismo.Herança;

public class Cachorropoli extends Animal_poli {

private String cor;
private String raça;
private String porte;

public Cachorropoli(String nome, String idade, String classe, String ferimento, String cor, String raça, String porte) 
{
	super(nome, idade, classe, ferimento);
	this.cor = cor;
	this.raça = raça;
	this.porte = porte;

}


@Override
public void locomover() {
	System.out.println("Locomoção:correndo");
	
}

@Override
public void alimentar() {
	System.out.println("Alimento:Ração artificial");	
}

@Override
public void emitirsom() {
	System.out.println("Emitir som:Latir");
}


public String getCor() {
	return cor;
}


public void setCor(String cor) {
	this.cor = cor;
}


public String getRaça() {
	return raça;
}


public void setRaça(String raça) {
	this.raça = raça;
}


public String getPorte() {
	return porte;
}


public void setPorte(String porte) {
	this.porte = porte;
}


public void imprimirinfo() {
	
	System.out.println("\nNome:"+getNome()+"\nIdade: "+getIdade()+"\nClasse"+getClasse()+"\nTipo de Ferimento:"+getFerimento()+"\nCor:"+cor+"raça:"+raça+"porte:"+porte);
	
}






}
