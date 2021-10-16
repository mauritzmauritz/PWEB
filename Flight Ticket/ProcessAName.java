import java.util.Scanner;
public class ProcessAName5026201141 {
	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a name : ");
		String uInput = sc.nextLine();

		int jSpasi = uInput.indexOf(" ");
		String lName = uInput.substring(jSpasi + 1);

		System.out.println(jSpasi);
		
		System.out.println("Your Name is: " + lName + ", " + uInput.substring(0,1) + ".");
	}
}
