package Poliformismo.Herança;

public class Cavalo_teste {

	public static void main(String[] args) {
		
		cavalo robson = new cavalo("Robson","30 anos","Mamifero","Atropelamento","Preto","Dentes Fragil","Marcas profundas de chicotes","Patas machudas por falta de ferradura");
		robson.imprimirinfo();
		robson.setFerimento("CURADO E TRATADO");
		robson.setCelas("CURADO E TRATADO");
		robson.setChicotadas("CURADO E TRATADO");
		robson.setDentes("TRATADO E CURADO");
		robson.imprimirinfo();
		
		cavalo bryan = new cavalo("Bryan","13 anos","Mamifero","pulgas e carrapatos","Preto","Dentes Fragil","Marcas profundas de chicotes","Patas machudas por falta de ferradura");
		bryan.imprimirinfo();
		bryan.setFerimento("CURADO E TRATADO");
		bryan.setCelas("CURADO E TRATADO");
		bryan.setChicotadas("CURADO E TRATADO");
		bryan.setDentes("TRATADO E CURADO");
		bryan.imprimirinfo();
		
		
		
		
		
		
	}

}
