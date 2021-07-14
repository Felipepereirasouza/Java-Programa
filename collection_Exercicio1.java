package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class collection_Exercicio1 {

	public static void main(String[] args) {
		int x=0;
		String atualizar=null,novo=null,remover=null,add=null;
		List<Integer> roupas = new ArrayList<Integer>();
		List<String> minharoupa = new ArrayList<String>();
		Scanner leia=new Scanner (System.in);
		
		minharoupa.add("armani");
		minharoupa.add("Gucci");
		minharoupa.add("Nike");
		minharoupa.add("Balenciaga");
		minharoupa.add("Puma");
		
		do {
			System.out.println("\n\n++++++ Escolha uma opção ++++++");
			System.out.println("\n 1- imprimir todo catalogo:");
			System.out.println("\n 2- Atualizar dados:");
			System.out.println("\n 3- remover dados:");
			System.out.println("\n 4- armazenar dados:");
			System.out.println("\n 0- para cancelar:");
			System.out.println("\n Digite um numero:");
			x=leia.nextInt();
			
			leia.nextLine();
			
			switch (x) {
			case 1: System.out.println(minharoupa);
				break;
			case 2:
				System.out.println("Digite o produto que deseja atualizar:");
				atualizar=leia.nextLine();
				System.out.println("Digite o produto que ficara no lugar de: "+atualizar);
				novo=leia.nextLine();
				
				if (minharoupa.contains(atualizar)) {
					
					minharoupa.remove(atualizar);
					minharoupa.add(novo);
					}
				else {
					System.out.println("Este produto não existe.....");
					
				}
				
				break;
				
			case 3:
					System.out.println("Digite o produto que voce quer remover:");
					remover=leia.nextLine();
						
					if(minharoupa.contains(remover)) {
						
						minharoupa.remove(remover);
					}
					else {
						System.out.println("Este produto não existe.....");
						
					}
					
					break;
			
			case 4: 
				System.out.println("Digite o produto que voce quer adicionar:");
				add=leia.nextLine();
				
				minharoupa.add("\n"+add);
					
				
			break;
			
			
			}
			
			
			
			
			
		}while(x!=0);
		
		
		
		
		
		
		
		
		
	}	
}	
		
			
	

	
	