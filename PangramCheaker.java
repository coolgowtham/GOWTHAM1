package guvi;

import java.util.Scanner;

public class PangramCheaker {
	
	public static void main(String arg[]){
		
		Scanner scanner=new Scanner(System.in); 
		String str=scanner.nextLine();
		char[] cs=str.toCharArray();
		int c=0;
		for(int i=0;i<str.length();i++){
			if(!Character.isAlphabetic(cs[i]))
				c++;
		}
		if(c>0)
			System.out.println("Not Pangram");
		else
			System.out.println("Pangram");
		scanner.close();
	}

}
