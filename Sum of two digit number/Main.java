import java.util.Scanner;
class Main{
	public static void main (String[] args) {
			Scanner scan = new Scanner(System.in);    
        int num1 = scan.nextInt();              
      
      int a= num1/10;
      int b= num1%10;
      int c= a+b;
      System.out.println("" +c);

	}
}