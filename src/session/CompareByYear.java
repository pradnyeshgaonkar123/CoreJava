package session;

import java.util.Comparator;

public class CompareByYear implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o1.getYear()-o2.getYear();
	}

}