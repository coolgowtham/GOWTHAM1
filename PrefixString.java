package guvi;

public class PrefixString {

	public static void main(String[] args) {
		
		String[] str={"apple", "app", "appication"};
		String prefix="";
		for(int i=1;i<str.length;i++){
			int j=0;
			for(;j<Math.min(str[0].length(),str[i].length());j++){
				if(str[0].charAt(j)!=str[i].charAt(j))
					break;
			}
			prefix=str[i].substring(0, j);
		}
		System.out.println(prefix);
	}

}
