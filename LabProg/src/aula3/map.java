package aula3;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
	
	
				HashMap<Integer, String> hmap= new HashMap<Integer, String>();
				
				hmap.put( 1,"John Doe");
				hmap.put( 2,"Jesufina");
				hmap.put( 30,"Holly Doe");
			
				
				
				if(hmap.isEmpty()){
					
					System.out.println("vazio");
					
				}else System.out.println("Com valores");
				
				System.out.println( "Elemento 2 " +hmap.get( 2 ) );
				
				System.out.println("Qual deseja remover?");
				Scanner in = new Scanner(System.in);
				int num = in.nextInt();
				hmap.remove(num);
				System.out.println(hmap);
	}

				
					
					
	


	}
	
	
				



