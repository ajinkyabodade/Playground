import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner in = new Scanner(System.in);
      int age = in.nextInt();
    int count=0;
for(int i=1;i<=age;i++)
{
  System.out.print(""+i);
  count++;
  if(count==3)
  {
    System.out.print(",");
    count=0;
  }

  
  
}
  }
}