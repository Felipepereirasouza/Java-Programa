package Poliformismo.Herança;

public class cachorro_teste {

	public static void main(String[] args) {
		
		
		cachorro piggy = new cachorro("Piggy",":21 anos",":Mamifero","ferimentos nas patas e dentes","Marrom","Domestico","Pitbull","Grande/Adulto");
		piggy.imprimirinfo();
		piggy.setFerimento("curado e bem tratado!!!");
		piggy.imprimirinfo();
		
		
		cachorro bob = new cachorro ("Bob",":10 anos",":Mamifero","Ferimentos nos olhos e na barriga","Caramelo","Domestico","labrador","Pequeno/Criança");
		bob.imprimirinfo();
		bob.setFerimento("Tratado e curado ! !");
		bob.imprimirinfo();
		
		
	}

}
