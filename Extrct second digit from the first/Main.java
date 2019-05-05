import java.util.Scanner;

  
class Main{ 
      
    // Find the first digit 
    public static int firstDigit(int n) 
    { 
        // Remove last digit from number 
        // till only one digit is left 
        while (n >= 100)  
            n /= 10; 
      
        // return the first digit 
        return n; 
    } 
  
  
      
    // driver function 
    public static void main(String argc[]) 
    { 
      
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
        int second=firstDigit(n);
      second=second%10;
             System.out.println(""+second);
    } 
} 