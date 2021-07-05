package AtividadesJava;

import java.util.Scanner;

public class Atividade_Multiplicação {
	public static void main(String[] args) {
		
	
	double c,numero, salariototal,salarioexce,excesso,hora;

    Scanner leia = new Scanner (System.in);
    System.out.println("Digite o numero do funcionario?:");
    c=leia.nextDouble();
    System.out.println("Quantas horas trabalhada?:");
    numero=leia.nextDouble();
    excesso=numero-50;
    hora=50*10;
    salarioexce=excesso*20;
    salariototal=salarioexce+hora;

    System.out.println("--------------- Seu Salario sera! ---------------");

    System.out.println("\n\t\t Salario Total R$"+salariototal+" reais");
    System.out.println("\n\t\t Salario Extra R$"+salarioexce+" reais");

    System.out.println("\nConsagre ao Senhor tudo o que você faz,e os seus planos serão bem-sucedidos:Provérbios 16:3");

	}
	}
