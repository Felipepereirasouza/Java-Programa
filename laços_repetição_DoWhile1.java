package la�osderepeti��o;
/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
import java.util.Scanner;

public class la�os_repeti��o_DoWhile1 {

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
