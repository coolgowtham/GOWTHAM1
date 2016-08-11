# GOWTHAM1
import java.util.Arrays;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int k=obj.nextInt();
		int digits=obj.nextInt();
		String n=""+digits;
		char ch[]=n.toCharArray();
		Arrays.sort(ch);
		if(k<ch.length){
		for(int i=0;i<ch.length-k;i++){
		
			System.out.print(ch[i]);
		}
		}
		
	}

}
