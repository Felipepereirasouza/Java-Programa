package laçosderepetição;

import java.util.Scanner;

public class laços_de_repetição_For_2 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner (System.in);
		int x,y,par=0,impar=0;
		
		
		for(x=1;x<=10;x++) {
			
			System.out.println("Digite um numero: ");
			y=leia.nextInt();
			
			if(y%2==0) {
				par++;
			}
			
			else if(y%2!=0) {
				impar++;
			}
		
		
		}
		System.out.println("\nQuantidade de numeros pares:"+par);
		System.out.println("\nQuantidade de numeros impar:"+impar);

	}

}
