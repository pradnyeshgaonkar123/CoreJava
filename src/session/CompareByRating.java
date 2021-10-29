package session;

import java.util.Comparator;

public class CompareByRating implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return Float.compare(o1.getRatings(), o2.getRatings());
	}

}