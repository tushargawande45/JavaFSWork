import java.util.*;

public class DemoException02 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of overs: ");
		int overs = sc.nextInt();
		System.out.println("Enter the number of runs for each over: ");
		int [] arr = new int[overs];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the over number: ");
		int OverNumber =  sc.nextInt();
		try {
			System.out.print("Run Scored in this over: "+arr[OverNumber-1]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
