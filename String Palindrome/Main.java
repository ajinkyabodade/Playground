import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    // Get the input string
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder(str);
    int str_len = sb.length();
    // Create another string temp
    StringBuilder temp = new StringBuilder("");
    for(int idx = (str_len - 1); idx >= 0; idx--)
    {
      char ch = sb.charAt(idx);
      temp.append(ch);
    }
    for(int idx = 0; idx < str_len; idx++)
    {
      sb.setCharAt(idx, temp.charAt(idx));
    }

    if (sb.toString().equals(sb2.toString())){
System.out.println("Yes");
}
    else
    {
      System.out.println("No");
    }
    
    
  }
}