package mainModule;

public class Adventure extends Film {
	// Attributes
	private String movieTitle;
	private int yearReleased;
	private String rating;

	// getters
	public String getMovieTitle() {
		return movieTitle;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public String getRating() {
		return rating;
	}

	// setters
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	// SciFi::Adventure
	// call superclass constructor
	// initialize attributes of Genre subclass(Adventure)
	public Adventure() {
		super();
		movieTitle = "";
		yearReleased = 0;
		rating = "";
	}

	// Adventure::Adventure
	// call superclass constructor
	// accepts String directorName,String composerName,String genreName from parent
	// class Film.java then accepts String movieTitle; int yearReleased; String
	// rating; from genre subclass itself
	public Adventure(String directorName, String composerName, String genreName, String movieTitle, int yearReleased,
			String rating) {
		super(directorName, composerName, genreName);
		this.movieTitle = movieTitle;
		this.yearReleased = yearReleased;
		this.rating = rating;
	}

}
