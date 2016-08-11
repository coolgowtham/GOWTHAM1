package guvi;

import java.util.Scanner;

public class pairs {
	
	public static void  main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		int no=ob.nextInt();
		int i=0;
		for(int j=no*2;j>0;j--)
		{
			i+=j;
		}
		System.out.println("No of pairs:"+i);
		ob.close();
	}

}
