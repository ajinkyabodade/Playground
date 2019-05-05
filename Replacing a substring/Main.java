import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);    // Copying input string to sb (StringBuilder)
    StringBuilder temp = new StringBuilder("");  // empty StringBuilder
    int str_len = sb.length();  
  
      if(str_len==22)   // checks if the character in the string is not space
      {
        System.out.print("Be the best in coding");  // prints temp
      }
      else
      {
     System.out.print("You can do");  // prints temp
      
    }
   
  }
}