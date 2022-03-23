package mainModule;

public class Fantasy extends Film {
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
	
	
	//SciFi::Sci_Fi
	//	call superclass constructor
	//	initialize attributes of Genre subclass(Sci_Fi)
	public Fantasy() {
		super();
		movieTitle = "";
		yearReleased = 0;
		rating = "";
	}
	
	//SciFi::Sci_Fi
	//call superclass constructor
	//	accepts String movieTitle; int yearReleased; String rating; from genre subclasses
	public Fantasy(String movieTitle, int yearReleased, String genreName, String rating) {
		movieTitle = getMovieTitle();
		yearReleased = getYearReleased();
		rating = getRating();
	}
}
