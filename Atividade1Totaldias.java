package AtividadesJava;

import java.util.Scanner;

public class Atividade1Totaldias {
	
Scanner leia = new Scanner(System.in);
public static void main(String[] args) {
		
	
	Scanner leia = new Scanner(System.in);
	
	double ano=0, mes=0, dia=0, dias=0;

System.out.println ("\nEm qual ano voc� nasceu: ");
ano=leia.nextDouble();
System.out.println ("\nEm qual m�s (Ex. 01, 02, 03... etc) voc� nasceu: ");
mes=leia.nextDouble();
System.out.println("\nEm qual dia voc� nasceu: ");
dia=leia.nextDouble();

dias = (2021 - ano) * 365 + (mes * 30) - (30 - dia-1);

System.out.println ("Voc� tem "+ dias +", dias de vida.");

}
}
