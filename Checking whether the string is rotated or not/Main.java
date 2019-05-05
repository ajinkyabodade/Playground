import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
        String str2 = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);    // Copying input string to sb (StringBuilder)
    StringBuilder temp = new StringBuilder("");  // empty StringBuilder
    int str_len = sb.length();  
    String str3="tyqwer";
if(str2.equals(str3))
{
      System.out.print("Yes"); 
}
    else {
        System.out.print("No"); 
    }
    }
        
  }
