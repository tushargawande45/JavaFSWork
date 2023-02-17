import java.util.*;

public class DemoException01 {
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the Total Runs Scored: ");
		int runs = sc.nextInt();
		System.out.println("Enter the Total Over Faced: ");
		int overs = sc.nextInt();
		float crr;
		try {
			crr = runs/overs;
			System.out.println("Current Run Rate: "+crr);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}