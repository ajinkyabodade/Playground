import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      
      for(int i=0;i<=num;i++)
      {
        if(i%2!=0)
        {
          System.out.println(""+i);
        }

	}
}}