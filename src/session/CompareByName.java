package session;

import java.util.Comparator;

public class CompareByName implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return  o1.getName().compareTo(o2.getName());
	}

}
