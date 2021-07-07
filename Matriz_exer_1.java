package Matriz.e.Vetores;

import java.util.Scanner;

/*  Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui */

public class Matriz_exer_1 {

	public static void main(String[] args) {
		
		
		Scanner leia=new Scanner (System.in);
		
		int[][] matriz=new int[3][3];
		int l=0,c=0,cont=0;
		
		for(l=0;l<3;l++) {
			
			for(c=0;c<3;c++) {
			
			
			System.out.println("Digite um numero");
			matriz[l][c]=leia.nextInt();
		
			if(matriz[l][c]>10 ) {
			
				cont++;
				}
			
			}
		}
			 
		for(l=0;l<3;l++) {
					
			for(c=0;c<3;c++) {
			
					
				if(matriz[l][c]>10) {
				
					System.out.println("Numero que é maior que 10:"+matriz[l][c]);
				}
			}
			
				
		}
				
		System.out.println("Quantidades de numeros maior que 10:"+cont);


				
				
				
				
				
		}
		}