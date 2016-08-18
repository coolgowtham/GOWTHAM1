package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Money {
	// Write code here...
	   public static void main(String args[]){
		   Scanner obj=new Scanner(System.in);
		    int n=obj.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=obj.nextInt();
		    }
		    Arrays.sort(arr);
		    int sum=obj.nextInt();
		    int coin=0;
		    while(sum!=0)
		    {
		      int sub=0;
		        sub=sum/arr[n-1];
		        if(sub!=0)
		        {
		        	coin+=sub;
		           
		        }
		            sum=sum%arr[n-1];
		            n--;
		        }
		    System.out.println(coin);
	}

}
