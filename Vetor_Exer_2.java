package Matriz.e.Vetores;

import java.util.Scanner;

public class Vetor_Exer_2 {
/* Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
     */
	public static void main(String[] args) {
		
		Scanner leia=new Scanner (System.in);
		float[] numero=new float[6];
		int somapar=0,quatimpar=0,digpar=0,digimpar=0;
		int x=0,y=0;
		
		
		for(x=0;x<6;x++) {
			
			System.out.println("Digite um numero:");
			numero[x]=leia.nextFloat();
			
			if(x%2==0) {
				
				somapar=somapar+x;
				
				
			}
			if(numero[x]%2!=0) {
				
				quatimpar++;
				
			}
			}
		
		
		for(x=0;x<6;x++) {
		if(numero[x]%2==0) {
			
			System.out.println("Numeros pares digitados"+numero[x]);
			
			}
		}
		System.out.println("-----------------------------------------");
		for(x=0;x<6;x++) {
			if(numero[x]%2!=0) {
				
				System.out.println("Numeros impares digitados"+numero[x]);
			
		}

		}
		
		System.out.println("\nQuantidades de numeros impares digitados:"+quatimpar);	
		System.out.println("\nSoma dos numeros pares:"+somapar);
		
	
	}
}

