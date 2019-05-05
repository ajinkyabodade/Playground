import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int count=0;
      for(int i=0;count<num;i++)
      {
        if(i%2!=0)
        {
          System.out.println(""+i);
          count++;
        }

	}
}}