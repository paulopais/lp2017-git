package aula3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class listaiterador {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<Integer> lst = new ArrayList<Integer>( );
				Random rand = new Random();
				for (int i = 0 ; i<3;i++)
				{
				lst.add(rand.nextInt(100) );
				}
				ListIterator<Integer> itr1 = lst.listIterator( 0 );
				ListIterator<Integer> itr2 = lst.listIterator( lst.size( ) );
				
				
				System.out.print( "Forward: " );
				while( itr1.hasNext( ) )
				System.out.print( itr1.next( ) + " " );
				System.out.println( );
				System.out.print( "Backward: " );
				while( itr1.hasPrevious( ) )
				System.out.print( itr1.previous( ) + " " );
				System.out.println( );
				System.out.print( "Backward: " );
				while( itr2.hasPrevious( ) )
				System.out.print( itr2.previous( ) + " " );
				System.out.println( );
				System.out.print( "Forward: ");
				for( Integer x : lst )
				System.out.print( x + " " );
				System.out.println( );
				
				
				System.out.println("Qual é o numero?");
				Scanner in = new Scanner(System.in);
				int num = in.nextInt();
				System.out.println(num);
				if (lst.contains(num)){
					System.out.println("Existe!");	
				}else System.out.println ("não existe!;");
	
	}
	
		

	}


