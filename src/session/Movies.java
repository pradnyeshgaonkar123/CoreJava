package session;

public class Movies {
	private float ratings;
	private String name;
	private int year;
	
	public Movies() {
		// TODO Auto-generated constructor stub
	}
	
	public Movies(float ratings, String name, int year) {
		super();
		this.ratings = ratings;
		this.name = name;
		this.year = year;
	}
	
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Movies [ratings=" + ratings + ", name=" + name + ", year=" + year + "]";
	}
	
	
}
