package guvi;

import java.util.Scanner;

public class Seed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int sd=s.nextInt();
		String str=number+"";
		char[] c=str.toCharArray();
		int mut=1;
		for(int i=0;i<c.length;i++)
		{
			mut*=(c[i]-48);
		}
		mut=number*mut;
		System.out.println(mut);
		if(sd==mut)
		{
			System.out.println(number+"is seed of "+sd);
		}
		else
			System.out.println("not seeds");
		s.close();
	}

}
