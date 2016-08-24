package guvi;

import java.util.Scanner;

public class UniqueElement {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] input=new int[n];
		String output="";
		for(int i=0;i<n;i++){
			input[i]=scanner.nextInt();
			output+=input[i]+"";
		}
		for(int i=0;i<n-1;i++)
		{
			int count=output.replaceAll("[^"+output.charAt(i)+"]","").length();
			if(count==1){
				System.out.println(output.charAt(i));
				
			}
		}
	scanner.close();
	}

}
