package la�osderepeti��o;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class la�os_de_repeti��o_DoWhile_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner(System.in);
		int x=0,media=0,multiplo=0,soma=0;
	do{
		System.out.println("Digite um numero:");
		x=leia.nextInt();
		
		if(x%3==0) {
			soma=soma+x;
			multiplo++;			
									
		}							
									
	}while(x!=0);					
	
	media=soma/multiplo;
	
	System.out.println("\nQuantidades de numeros multiplos de 3:"+multiplo);
	System.out.println("\nMedia dos multiplos de 3: "+media);
	
	}

}
