package Laços_condicionais;

import java.util.Scanner;

public class Laços_condicionais3 {

	public static void main(String[] args) {
		
		int idade ;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com sua idade:");
		idade=leia.nextInt();
				
				
		if (idade>=10 && idade<=14) {
			
			System.out.println("Idade infantil:");
		}
		else if (idade>=15 && idade<=17) {
			
			System.out.println("Idade Juvenil");
		}
		
		else if (idade>=18 && idade<=25) {
			
			System.out.println("Idade Adulta");
		}
		else  {
			System.out.println("Idade fora do catalogo");
		}
	
	
	}

}
