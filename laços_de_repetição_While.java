package laçosderepetição;

import java.util.Scanner;

public class laços_de_repetição_While {
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade=0,total50=0,total21=0;
		Scanner leia= new Scanner (System.in); 
		while(idade!=-99) {
			
			
			System.out.println("Digite Sua idade: ");
			idade=leia.nextInt();
			
			if (idade>50) {
				
				total50++;
			}
			else if(idade<21) {
				
			total21++;
				
				
			}
			
			else {
				System.out.println("Insira uma idade menor que 21 anos ou maior que 50 anos: ");
			}
			
			
			
		}
		
		System.out.println("\nIdades maiores que 50: "+total50);
		
		System.out.println("\nIdades menos que 21: "+total21);
		
		
		
	}

}
