import java.util.Scanner;
import java.io.*; 
  
class Main { 
      
    /* Function to get sum of digits */
    static int getSum(int n) 
    {     
        int sum = 0; 
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
      
    return sum; 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
             Scanner in = new Scanner(System.in);
      int n = in.nextInt();
  
        System.out.println(getSum(n)); 
    } 
} 
  