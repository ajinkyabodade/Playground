import java.util.Scanner;
class Main{
	public static void main (String[] args) {
			Scanner scan = new Scanner(System.in);    
        int num1 = scan.nextInt();              
        
      int last= num1/100;
      int first=num1%10;
      int temp =num1/10;
      int middle= temp%10;
       
      
    
      System.out.println("" +first+middle+last);

	}}
