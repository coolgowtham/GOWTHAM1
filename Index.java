package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int size=n.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=n.nextInt();
		}
		Arrays.sort(array);
		
		for(int i=0;i<size;i++)
		{
			
			if(i==array[i])
			{
				System.out.println("The number "+array[i]+" equals index "+i);
			}
		}
	}

}
