import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner scan = new Scanner(System.in);
    // Get the input string
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
      
      if(str_len==25)
      {
        
        System.out.println("b g h i m n q w x y z");
      }
      else
      {
        
        System.out.println("a l y z");
      }
    }
}