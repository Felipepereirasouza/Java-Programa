package Matriz.e.Vetores;
/* - Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
public class Vetor_Exer_1 {

	public static void main(String[] args) {
		
		
		int [] a= {1, 0, 5, -2, -5, 7};
		int x=0,y=0;
		
		
		x=a[0]+a[1]+a[5];
		
		System.out.println(" A soma do a[0]+a[1]+a[5] �:"+x);
		
		a[4]=100;

		
		
		for(y=0;y<6;y++) {
			System.out.println("-----------------");
			
			System.out.println("matriz["+a[y]+"].");
		}
		
		
	
	
	
	
	
	
	}

}
