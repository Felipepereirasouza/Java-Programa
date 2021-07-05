package laçosderepetição;
/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
import java.util.Scanner;

public class laços_repetição_DoWhile1 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		
		int x,soma=0;

		do {
			System.out.println("Digite um numero: ");
			x=leia.nextInt();
		
		soma=soma+x;
			
			
		}while(x!=0);
	
	
	System.out.println("Soma dos numeros: "+soma);
	
	}

}
