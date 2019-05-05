import java.util.Scanner; 
class Main {
 
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);    
        int year = scan.nextInt();     
        
		//if year is divisible by 4, it is a leap year
		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Leap year");
		else
			System.out.println("Non Leap year");
	}
}