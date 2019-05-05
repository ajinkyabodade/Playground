import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();

        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}