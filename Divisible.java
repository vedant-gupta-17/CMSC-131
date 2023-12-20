package programs;
import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int x,y;
		
		System.out.print("Enter x: ");
		x = num.nextInt();
		System.out.print("Enter y: ");
		y = num.nextInt();
		
		int rem = x%y;
		System.out.println("Remainder: "+rem);
		
		if (rem != 0) {
			System.out.println(x+" is NOT divisible by " + y);
		}
		else {
			System.out.println(x+" is divisible by " + y);
		}
		
		
	}
}