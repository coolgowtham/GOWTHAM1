import java.util.Scanner;
import java.util.Stack;

public class TowersOfHanoiThreeDiskEx {
	 public static Stack<Integer>[] tower = new Stack[4]; 
	 
	

   public void DiskEx(int n, int pole1, int pole2, int pole3) {
       if (n == 1) {
           System.out.println(pole1 + " -> " + pole3);
       } else {
           DiskEx(n - 1, pole1, pole3, pole2);
           int d = tower[pole1].pop();                                             
           tower[pole3].push(d);
           System.out.println(pole1 + " -> " + pole3);
           DiskEx(n - 1, pole2, pole1, pole3);
       }
   }

   public static void main(String[] args) {
       TowersOfHanoiThreeDiskEx towersOfHanoi = new TowersOfHanoiThreeDiskEx();
       tower[1] = new Stack<Integer>();
       tower[2] = new Stack<Integer>();
       tower[3] = new Stack<Integer>();
       for(int i=3;i>0;i--){
    	   tower[1].push(i);
       }
     new  TowersOfHanoiThreeDiskEx().DiskEx(3, 1, 2, 3);
     
   }
}
