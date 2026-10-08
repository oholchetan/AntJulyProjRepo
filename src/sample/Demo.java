package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo {

	
	public static String reversestring(String s) {
		
		
					String[] words = s.trim().split("\\s+");
					
					StringBuilder reversed= new StringBuilder();
					
					for(int i=words.length-1;i>=0;i--) {
						
						
						reversed.append(words[i]);
						
						if(i>0) {
							
							reversed.append(" ");
							
						}
						
					}
	
		return reversed.toString();
	}
	
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 System.out.println(reversestring("My nam chetan"));
		
		
			
		}
		
		
		
		
		
		

	}






