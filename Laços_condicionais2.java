package Laços_condicionais;

import java.util.Scanner;

public class Laços_condicionais2 {

	public static void main(String[] args) {
	
		Scanner leia= new Scanner (System.in);
		int num1,num2,num3,maior;
				
		System.out.println("Escreva o primeiro numero:");
		num1=leia.nextInt();
		System.out.println("Escreva o segundo numero:");
		num2=leia.nextInt();
		System.out.println("Escreva o terceiro numero:");
		num3=leia.nextInt();		
				
		if (num1<num2 && num2<num3) {
			
			System.out.println("ordem crescente:"+num1+num2+num3 );
		}

		else if (num1<num3 && num3<num2) {
			
			System.out.println("ordem crescente:"+num1+num3+num2 );
			}
		
		else if (num2<num3 && num3<num1) {
			
			System.out.println("ordem crescente:"+num2+num3+num1 );
			}
		
		else if (num2<num1 && num1<num3) {
			
			System.out.println("ordem crescente:"+num2+num1+num3 );
			}

		else if (num3<num1 && num2<num1) {
			
			System.out.println("ordem crescente:"+num3+num2+num1 );
			}
		else if (num3<num2 && num1<num2) 
		{
			
			System.out.println("ordem crescente:"+num3+num1+num2 );
			}
		
		else if (num3==num2 && num1==num2)
		{
			System.out.println("ordem crescente:"+num3+num1+num2 );
		}
		
		
		
		
		
	}
	
	
}
