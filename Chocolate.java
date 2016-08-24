import java.util.Scanner;
public class Chocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a;
		int b;
		String s1="";
		for(int i=0;i<n;i++){
			a=s.nextInt();
			b=s.nextInt();
			s1+=((a*b)-1)+" ";
		}
System.out.println(s1);
	}

}
