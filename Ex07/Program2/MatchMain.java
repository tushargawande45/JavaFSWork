package Program2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class MatchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate matchDate;
		String teamOne;
		String teamTwo;
		String date;
		
		System.out.println("Enter the number of matches");
		int n = sc.nextInt();
		
		TreeSet<Match> match = new TreeSet<Match>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter match date in (yyyy-MM-dd) ");
			date = sc.next();
			matchDate = LocalDate.parse(date);
			
			System.out.println("Enter Team 1");
			teamOne = sc.next();
			
			System.out.println("Enter Team 2");
			teamTwo = sc.next();
			
			Match m = new Match(matchDate, teamOne, teamTwo);
			match.add(m);
		}
		
		match.descendingSet();
		System.out.println(match);
	}

}