import java.util.*;
public class MyFirstJavaProgram {

    public static void main(String []args) {
      String s="";
      Scanner o=new Scanner(System.in);
			if(args.length>0){
				s=o.next();
			}
			for(int i=0;i<args.length;i++){
				String s1=o.next();
				int j=0;
				for(;j<Math.min(s.length(),args[i].length());j++){
					if(s.charAt(j)!=s1.charAt(j)){
						break;
					}
				}
				s=args[i].substring(0,j);
			}
			System.out.println(s);
    }
} 
