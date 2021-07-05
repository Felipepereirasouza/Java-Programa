package Laços_condicionais;

import java.util.Scanner;

public class Laços_condicionais1 {

	public static void main (String[] args) {


        int num1,num2,num3,maior=0;
        
        Scanner leia = new Scanner(System.in);

        	
        System.out.println("Insira o primeiro numero: ");

        num1 = leia.nextInt();

        System.out.println("Insira o Segundo numero: ");

        num2 = leia.nextInt();

        System.out.println("Insira o terceiro numero: ");

        num3 = leia.nextInt();

        if (num1<num2 && num2<num3)
        {
          
            maior = num3;
        }
        else if (num1<num3 && num3<num2)
        {
            
            maior = num2;
        }
        else if (num2<num1 && num1<num3)
        {
           
            maior = num3;
        }
        else if (num2<num3 && num3<num1)
        {
       
            maior = num1;
        }
        else if (num3<num1 && num1<num2)
        {
            
            maior = num2;
        }
        
        
        
        else if (num3<num2 && num2<num1)
        {
        	
            maior = num1;
        
        }
       
        else if (num1==num2 && num3<num1 )
        {	
        	
            maior =num1;
        
        }
        
        
        else if (num1==num2 && num3>num1 ) {
        	
        	maior=num3;
        }
        	
        else if (num1==num3 && num2<num1 ) {
        	
        	maior=num1;
        }
        
        else if (num1==num3 && num2>num1 ) {
        	
        	maior=num2;
        }
        else if (num2==num1 && num3<num1 ) {
        	
        	maior=num1;
        	
        }
        
        else if (num2==num1 && num3>num1 ) {
        	
        	maior=num3;
        	
        }
        
        else if (num2==num3 && num1<num2 ) {
        	
        	maior=num2;
        	
        }
        
        else if (num2==num3 && num1>num2 ) {
        	
        	maior=num1;
        	
        }
        
        else if (num3==num2 && num2<num1 ) {
        	
        	maior=num1;
        	
        }
        else if (num3==num2 && num2>num1 ) {
        	
        	maior=num2;
        	
        }
        
        else if (num3==num1 && num2<num1 ) {
        	
        	maior=num1;
        	
        }
        
        else if (num3==num1 && num2>num1 ) {
        	
        	maior=num2;
        	
        }
        
        	else if (num1<num2 && num2==num3 ) {
        	
        	maior=num2;
        	
        }
        
        	else if (num1>num2 && num2==num3 ) {
            	
            	maior=num1;
            	
            }
        	else if (num2<num1 && num1==num3 ) {
            	
            	maior=num1;
            	
            }
        	else if (num2>num1 && num1==num3 ) {
            	
            	maior=num2;
            	
            }
        	else if (num3<num1 && num2==num1 ) {
            	
            	maior=num1;
            	
            }
        	
        	else if (num3==num1 && num2==num3 ) {
            	
            	maior=num3;
            	System.out.println("São numeros iguais:"+maior);
            }
        	
        	else if (num1==num3 && num2<num3 ) {
        	
        		maior=num1;
        	}
        	
        	else if (num1==num3 && num2>num3 ) 
        	{
        		
        		maior=num2;
        	}
        		
        	System.out.println("MAIOR NUMERO É:"+maior);
	}
}
	
        
	
	
	

