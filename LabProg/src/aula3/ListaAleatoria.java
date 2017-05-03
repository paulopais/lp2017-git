package aula3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class ListaAleatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> lst = new ArrayList<Integer>( );
				Random rand = new Random();
				for (int i=0 ; i<5; i++)
				{
					lst.add(rand.nextInt() );
				}
	
				System.out.println("Por ordem" + lst);


				
				System.out.println("Por Reverse");
				Collections.reverse(lst);
				System.out.println(lst);
				}

	}
				
	
