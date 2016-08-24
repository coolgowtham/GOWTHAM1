package guvi;

import java.util.Scanner;

public class ArrayDOrder {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int[] input=new int[5];
		for(int i=0;i<5;i++){
			input[i]=scanner.nextInt();
		}
		int temp=0;
		for(int i=0;i<4;i++){
			if(input[i]<input[i+1])
			{
				temp=input[i+1];
				input[i+1]=input[i];
				input[i]=temp;
			}
		}
		for(int i:input){
			System.out.println(i);
		}
		scanner.close();
	}

}
