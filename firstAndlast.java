import java.util.Scanner;
public class firstAndlast {
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word");
		String next = scan.nextLine();
		int count = next.length();
		System.out.print(Seconttolast(next));
	
	
	

}

	public static String Seconttolast(String word) {
		char first =word.charAt(0);
		int index = word.length()- 2;
		char AlmostLast = word.charAt(index);
		String FandL = first+""+AlmostLast;
		return FandL;
	}
		
		
		
}