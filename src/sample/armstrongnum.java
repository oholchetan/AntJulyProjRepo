package sample;


public class armstrongnum {
	
	public static boolean armstrongn(int num) {
		
		
		int originalnum=num;
		
		int sum=0;
		
		int lengthofnum= String.valueOf(num).length();
		
		while(num>0) {
			
			
			
			int remainder= num%10;
			
			sum+=Math.pow(remainder,lengthofnum);
			
			
			num=num/10;
			
				
			
		}
		
		return sum==originalnum;
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		
		System.out.println(armstrongn(2));
		
		System.out.println(armstrongn(12));
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
