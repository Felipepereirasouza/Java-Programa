package Poliformismo.Heran�a;

public class Cachorropoli extends Animal_poli {

private String cor;
private String ra�a;
private String porte;

public Cachorropoli(String nome, String idade, String classe, String ferimento, String cor, String ra�a, String porte) 
{
	super(nome, idade, classe, ferimento);
	this.cor = cor;
	this.ra�a = ra�a;
	this.porte = porte;

}


@Override
public void locomover() {
	System.out.println("Locomo��o:correndo");
	
}

@Override
public void alimentar() {
	System.out.println("Alimento:Ra��o artificial");	
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


public String getRa�a() {
	return ra�a;
}


public void setRa�a(String ra�a) {
	this.ra�a = ra�a;
}


public String getPorte() {
	return porte;
}


public void setPorte(String porte) {
	this.porte = porte;
}


public void imprimirinfo() {
	
	System.out.println("\nNome:"+getNome()+"\nIdade: "+getIdade()+"\nClasse"+getClasse()+"\nTipo de Ferimento:"+getFerimento()+"\nCor:"+cor+"ra�a:"+ra�a+"porte:"+porte);
	
}






}
