package programs;

import java.util.*;

public class ColorGenerator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String c1,c2;
		String hex;
		
		System.out.print("Do you want red? (Yes/Yeah/No): ");
		c1 = input.next();
		System.out.print("Do you want green and blue? (Yes/Yeah/No): ");
		c2 = input.next();

		
		if (c1.equals("Yes") || c1.equals("Yeah")) {
			hex = "FF";
			
		}
		else {
			hex = "00";
		
		}
		
		if (c2.equals("Yes")||c2.equals("Yeah") ) {
			hex = hex + "FFFF";
		}
		else {
			hex = hex + "0000";
		}
		
		System.out.println("Final Color: #"+hex);
	}
}