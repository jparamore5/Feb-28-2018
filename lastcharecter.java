import java.util.Scanner;

public class lastcharecter {
	public static void main(String[]args) {
	
	Scanner scan = new Scanner(System.in); 
	
	System.out.println("type any word?");
	
	String next = scan.nextLine();
	
	int count = next.length();
	
	System.out.println(next.charAt(count-1));
	
	

	
}
}
