package sample;

import java.security.DomainCombiner;

public class Rev {
	
	
	public static StringBuilder reverestring(String str) {
		
		
		String[] words = str.trim().split("\\s+");
		
		
		StringBuilder reversed= new StringBuilder();
		
		
		for(int i=words.length-1;i>=0;i--) {
			
			
			
			reversed.append(words[i]);
			
			if(i>0) {
				
				reversed.append(" ");
			
			
		}
			
			
}
		
		
		return reversed;
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println(reverestring("I love India"));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
