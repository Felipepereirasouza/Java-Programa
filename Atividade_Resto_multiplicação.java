package AtividadesJava;

import java.util.Scanner;

public class Atividade_Resto_multiplicação {

	public static void main(String[] args) {
		
		double total_segundos, segundos, minutos, hora;
		Scanner leia= new Scanner (System.in);
		
		System.out.println("Qual o tempo de duração do evento em Segundos:");
		
		total_segundos=leia.nextDouble();
		hora= (total_segundos/3600)%60;
		minutos= (total_segundos/60)%60;
		segundos= total_segundos % 60;

		
		//System.out.println("Duração do evento é de "+hora+" hora "+minutos+" minutos "+segundos+" Segundos" );
		System.out.printf ("\nhora: %1.0f ",hora);
		System.out.printf ("\nminutos: %1.0f ",minutos);									
		System.out.printf ("\nsegundos: %1.0f ",segundos);
	}

}
