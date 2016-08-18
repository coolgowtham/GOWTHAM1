package guvi;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=obj.nextInt();
		}
		float array1=0;
		float array2=0;
		for(int j=0;j<n;j++){
			if(j<=n/2 && n%2!=0 && array[j]>0)
				array1+=array[j];
			else if(j>n/2 && n%2!=0 && array[j]>0)
				array2+=array[j];
			else if(j<n/2 && array[j]>0)
				array1+=array[j];
			else if(array[j]>0)
				array2+=array[j];
			else
				System.out.println("No Negative values applied");
		}
		if((array2/(n/2))==(array1/(n-n/2)))
			System.out.println("Possible");
		else
			System.out.println("Not Possible");
		obj.close();
	}

}
