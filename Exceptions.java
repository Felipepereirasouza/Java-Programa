package exemplos;

public class Exceptions {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String frase = null,novaFrase=null;
			
			try
			{
				novaFrase = frase.toUpperCase();
			}
			catch(NullPointerException e)//captura da possível exceção
			{
				//tratamento da exceção
				System.out.println("\nA frase inicial está nula, para solucionar"
						+ "tal problema, foi atribuido um valor default...");
				frase = "Frase vazia";
				novaFrase = frase.toUpperCase();
			}
			
			System.out.println("\nFrase antiga: "+frase);
			System.out.println("\nFrase nova: "+novaFrase);
		}

	}


