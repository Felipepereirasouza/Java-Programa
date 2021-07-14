package exemplos;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class colec�o {


		public static void main(String[] args) {
		
			//estou criando um collection do tipo LIST e estou criando um
			//objeto minhaLista para iniciar com o ArrayList
			
			List<Integer> minhaLista = new ArrayList<Integer>();
			List<String> minhaLista1 = new ArrayList<String>();
			
			minhaLista.add(2);// posi��o 0//add serve para adicionar um valor na posi��o do meu ArrayList
			minhaLista.add(1);//posi��o 1
			minhaLista.add(2);//posi��o 2
			minhaLista.add(6);
			minhaLista.add(1);
		
			for(Integer lista:minhaLista)
			{
				System.out.println(lista);
			}
			
			System.out.println("\nRemovendo um elemento da lista");
			
			minhaLista.remove(0);//remove um elemento da minha lista
			
			for(Integer lista:minhaLista)
			{
				System.out.println(lista);
			}
			
			int primeiroElemento = minhaLista.get(0);//pega um elemento do ArrayList
			System.out.println("\nO primeiro elemento �:"+primeiroElemento);
			System.out.println();
			
			for(int i=0;i<minhaLista.size();i++)//size--> mostra o tamanho do meu ArrayList
			{
				System.out.println("\nElemento: "+minhaLista.get(i));
			}
			
			Collections.sort(minhaLista);//o m�todo sort vai ordenar a minha ArrayList
			
			System.out.println("\nDepois de ordenado...");
			System.out.println(minhaLista);
			
			System.out.println();
			
			Set<Integer> meuSet = new HashSet<Integer>();//estou criando o Set a partir do m�todo HashSet
			
			meuSet.add(2);
			meuSet.add(1);
			meuSet.add(2);
			meuSet.add(4);
			meuSet.add(3);//estou adicionando elementos para o meu HashSet
			
			Iterator<Integer> iMeuSet = meuSet.iterator();//estou criando uma nova interface chamada Iterator
			
			while(iMeuSet.hasNext())//hasNext() vai percorrer todo o meu collection da primeira posi��o at� a �ltima posi��o
			{
				System.out.println(iMeuSet.next());//vou imprimir cada posi��o, indicando sempre a pr�xima posi��o atrav�s do meu m�todo next
			}
			}

	}


