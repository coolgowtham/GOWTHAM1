import java.util.Arrays;
import java.util.Scanner;	
	public class DivideAndConquer{
		public static void main(String args[]){
			int a[]={2,4,6,8,10,12,14,16};
			int a1[]={6,34,78,123,432,900};
			int start=0;
			int end=a.length;
			Scanner s=new Scanner(System.in);
			int k=s.nextInt();
			while(start<=end){
				int avg=(start+end)/2;
				if(k==a[avg]){
					System.out.println(avg);
				}
				else if(k<a[avg]){
					end=avg-1;
				}
				else{
					start=avg+1;
				}
			}
			
		}
	}
