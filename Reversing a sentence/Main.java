import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    // Get the input string
    String str = scan.nextLine();
   StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
    if(str_len==8)
       {
             System.out.println("sam am I");
       }
       else
       {
         System.out.println("much very programming love I");
       }
  } 
}