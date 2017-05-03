package aula3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String text ="Portugal won their first-ever major tournament courtesy of Eder’s stunning long-range strike in extra-time, after a defensive-minded first 90 minutes."
				+ "Fernando Santos brought back Pepe after injury, and William Carvalho after suspension, so Bruno Alves and Danilo dropped to the bench. Cristiano Ronaldo didn’t make it to half-time"
				+"until being replaced by Ricardo Quaresma.Didier Deschamps named an unchanged XI, meaning no return for Kante."
				+"Overall this was a disappointing match, shaped heavily by the early departure of its bestplayer, Ronaldo. France had the better of the opening 90 minutes, but Portugal pushed forward impressively in extra-time.";
	
		List<String> textList = Arrays.asList(text.split(" "));
		
		List<String> upped = textList.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(upped);
		
		List<String> chars = textList.stream().filter(p -> p.length()<5).collect(Collectors.toList());
		System.out.println(chars);
		
		
	}

}
