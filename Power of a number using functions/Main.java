


import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int age = in.nextInt();
     int sum=1;
      int salary = in.nextInt();
      for(int i=0;i<salary;i++)
      {
         sum=sum*age;
      }
        System.out.println(""+sum);
   }
}
