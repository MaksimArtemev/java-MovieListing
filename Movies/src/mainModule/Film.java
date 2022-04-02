package mainModule;

//import java.util.List; //used for comparable

//Superclass/parent
//public class Film implements Comparable<Film> { //used for comparable
public class Film {


	// Attributes
	private String directorName;
	private String composerName;
	protected String genreName;
	//public final static List<String> CORRECT_GENRE_ORDER = List.of("Sci Fi", "Adventure", "Drama", "War", "Romance",
			//"Thriller", "Fantasy");  //used for comparable

	// getters
	public String getDirectorName() {
		return this.directorName;
	}

	public String getComposerName() {
		return composerName;
	}

	public String getGenreName() {
		return genreName;
	}

	// setters
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public void setComposerName(String composerName) {
		this.composerName = composerName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	// Film::Film
	// constructor
	public Film() {
		directorName = "";
		composerName = "";
		genreName = "";
	}

	// Film::Film
	// constructor accepts String directorName, String composerName, String
	// genreName
	public Film(String directorName, String composerName, String genreName) {
		this.directorName = directorName;
		this.composerName = composerName;
		this.genreName = genreName;
	}
/*
	public int compareTo(Film other) { // if its primitive data type u cant use compareTo method but instead use
										// CompareTo class

		int thisGenreIndex = CORRECT_GENRE_ORDER.indexOf(this.genreName);
		int otherGenreIndex = CORRECT_GENRE_ORDER.indexOf(other.genreName);

		int genreComparison = Integer.compare(thisGenreIndex, otherGenreIndex);

		if (genreComparison == 0) {
			// Need to do the casting mumbo jumbo
			int thisYearReleased = 0;
			int otherYearReleased = 0;

			// ((SciFi)this).yearReleased; // casts current object as scifi movie
			// ((SciFi)other).yearReleased; // casts

			// Handles all the casting for this movie
			if (this instanceof SciFi) {
				thisYearReleased = ((SciFi) this).getYearReleased();
			} else if (this instanceof Adventure) {
				thisYearReleased = ((Adventure) this).getYearReleased();
			} else if (this instanceof Drama) {
				thisYearReleased = ((Drama) this).getYearReleased();
			} else if (this instanceof War) {
				thisYearReleased = ((War) this).getYearReleased();
			} else if (this instanceof Romance) {
				thisYearReleased = ((Romance) this).getYearReleased();
			} else if (this instanceof Thriller) {
				thisYearReleased = ((Thriller) this).getYearReleased();
			} else if (this instanceof Fantasy) {
				thisYearReleased = ((Fantasy) this).getYearReleased();
			}

			// Handles all the casting for the other movie
			if (other instanceof SciFi) {
				otherYearReleased = ((SciFi) other).getYearReleased();
			} else if (other instanceof Adventure) {
				otherYearReleased = ((Adventure) other).getYearReleased();
			} else if (other instanceof Drama) {
				otherYearReleased = ((Drama) other).getYearReleased();
			} else if (other instanceof War) {
				otherYearReleased = ((War) other).getYearReleased();
			} else if (other instanceof Romance) {
				otherYearReleased = ((Romance) other).getYearReleased();
			} else if (other instanceof Thriller) {
				otherYearReleased = ((Thriller) other).getYearReleased();
			} else if (other instanceof Fantasy) {
				otherYearReleased = ((Fantasy) other).getYearReleased();
			}

			return Integer.compare(thisYearReleased, otherYearReleased);
			// ***ctrl + D to rename = highlights every instance of it */
			//***alt + shift + f  = spacing */
		/*}
		return genreComparison;

	}
*/
	// static - u can call methods without instaniating an object

}
