package Program3;

import java.util.Comparator;

public class RunComparator implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		return Integer.compare(p1.getRuns(), p2.getRuns());
	}

}