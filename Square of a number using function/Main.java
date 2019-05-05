import java.util.Scanner;
class Main
{
   public static int sum_of_last3_digits(int num)
   {
    int sod = num*num;  
    return sod;
   }
   public static void main(String args[])
   {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
  
    int sod1 = sum_of_last3_digits(n1);
   
    System.out.println(sod1);
 
   }
}
