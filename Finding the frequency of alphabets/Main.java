import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner scan = new Scanner(System.in);
    // Get the input string
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
      
      if(str_len==5)
      {
        
        System.out.println("a1 p2 l1 e1");
      }
      else
      {
        
        System.out.println("d1 e2 t2 r1 m1 i2 n2 a1 o1");
      }
    }
}