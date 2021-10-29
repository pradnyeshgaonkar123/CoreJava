package session;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SessionTask12s {
	
	static void displayChoice() {
		String choiceArr[] = {
				"Sort by ratings",
				"Sort by name",
				"Sort by year",
				"Sort by ratings in Reverse",
				"Sort by name in Reverse",
				"Sort by year in Reverse",
				"Exit",
		};
		for (int i = 0; i < choiceArr.length; i++) {
			System.out.println((i+1)+") "+choiceArr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movies> moviesList = new ArrayList<Movies>();
		moviesList.add(new Movies(4.8f, "3 Idiots", 2012));
		moviesList.add(new Movies(4.2f, "Movie 3", 2020));
		moviesList.add(new Movies(4.5f, "Fast and Furious", 2016));
		moviesList.add(new Movies(4.9f, "Phir Hera Pheri", 2008));
		moviesList.add(new Movies(4.6f, "Dhamaal", 2010));
		
		BufferedReader brInp = new BufferedReader(new InputStreamReader(System.in));
		String choice = "0";
		Comparator<Movies> compare = null;
		while(choice != "7") {
			SessionTask12s.displayChoice();
			System.out.print("\nEnter your choice");
			try {
				choice = brInp.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			switch (choice) {
			case "1":
				compare = new CompareByRating();
				Collections.sort(moviesList, compare);
				for(Movies movie: moviesList) {
					System.out.println(movie);
				}
				break;
			case "2":
				compare = new CompareByName();
				Collections.sort(moviesList, compare);
				moviesList.forEach(movie -> System.out.println(movie));
				break;
			case "3":
				compare = new CompareByYear();
				Collections.sort(moviesList, compare);
				moviesList.forEach(movie -> System.out.println(movie));
				break;
			case "4":
				compare = new CompareByRating();
				Collections.sort(moviesList,compare.reversed());
				moviesList.forEach(movie -> System.out.println(movie));
				break;
			case "5":
				compare = new CompareByName();
				Collections.sort(moviesList, compare.reversed());
				moviesList.forEach(movie -> System.out.println(movie));
				break;
			case "6":
				compare = new CompareByYear();
				Collections.sort(moviesList, compare.reversed());
				moviesList.forEach(movie -> System.out.println(movie));
				break;	
			case "7":
				
				break;
			default:
				break;
			}
			
		}
	}

}