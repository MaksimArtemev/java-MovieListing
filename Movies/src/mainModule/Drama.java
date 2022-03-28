package mainModule;

public class Drama extends Film {
	//Attributes
	private String movieTitle;
	private int yearReleased;
	private String rating;
	
	//getters
	public String getMovieTitle(){
		return movieTitle;
	}
	
	public int getYearReleased(){
		return yearReleased;
	}
	
	public String getRating(){
		return rating;
	}
	
	//setters
	public void setMovieTitle(String movieTitle){
		this.movieTitle = movieTitle;
	}
	
	public void setYearReleased(int yearReleased){
		this.yearReleased = yearReleased;
	}
	
	public void setRating(String rating){
		this.rating = rating;
	}
	
	
	//Drama::Drama
	//	call superclass constructor
	//	initialize attributes of Genre subclass(Drama)
	public Drama() {
		super();
		movieTitle = "";
		yearReleased = 0;
		rating = "";
	}
	
	//Drama::Drama
	//call superclass constructor
	//	accepts String directorName,String composerName,String genreName from parent class Film.java then accepts String movieTitle; int yearReleased; String rating; from genre subclass itself
	public Drama(String directorName,String composerName,String genreName, String movieTitle, int yearReleased, String rating) {
		super(directorName, composerName, genreName);
		this.movieTitle = movieTitle;
		this.yearReleased = yearReleased;
		this.rating = rating;
	}
}
