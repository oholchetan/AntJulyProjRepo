package sample;

public class palindrom {
	
	
	public static boolean palindrome(String word) {
		
		
		
		String rev=new StringBuilder(word).reverse().toString();
		
		
		return word.equalsIgnoreCase(rev);
			
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		String word1= "radar";
		
		String word2="raj";
		
		
		System.out.println(palindrome(word1));
		
		System.out.println(palindrome(word2));
		
		
		
		
	}
	
	
	
	
	

}
