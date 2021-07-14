package exemplos;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Exceptions2 {
	

		//demonstra o lan�amento de uma exce��o quando ocorre uma divis�o por zero
		
		public static int quociente(int numerador,int denominador) throws ArithmeticException
		{
			return numerador / denominador;
		}

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner leia = new Scanner(System.in);
			
			boolean continueLoop = true;//determina se mais entradas s�o necess�rias
			
			do
			{
				try // l� dois n�meros e calcula o quociente, fazendo a verifica��o dos mesmos
				{
					System.out.println("\nEntre com o numerador: ");
					int numerador = leia.nextInt();
					System.out.println("\nEntre com o denominador: ");
					int denominador = leia.nextInt();
					
					int resultado = quociente(numerador,denominador);
					System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador,resultado);
					continueLoop = false;
				}
				catch(InputMismatchException inputMismatchException)//verifica um erro de tipo de dados diferentes
				{
					System.err.printf("\nException: %s\n",inputMismatchException);
					leia.nextLine();
					System.out.println("\nVoc� deve entrar com um valor do tipo inteiro. Por favor tente novamente.\n");
					
				}
				catch(ArithmeticException arithmeticException )//verifica��o de divis�o por zero
				{
					System.err.printf("\nException: %s\n",arithmeticException);
					System.out.println("\nZero � um denominador inv�lido. Por favor tente novamente...");
					
				}
			}
			while(continueLoop);
		}

	}


