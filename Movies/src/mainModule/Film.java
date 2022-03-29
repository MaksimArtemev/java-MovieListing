package mainModule;

import java.util.List;

//Superclass/parent
public class Film implements Comparable<Film>{
	
	//Attributes
	private String directorName;
	private String composerName;
	private String genreName;
	public final static List<String> CORRECT_GENRE_ORDER = List.of("Sci Fi", "Adventure", "Drama", "War", "Romance", "Thriller", "Fantasy");

	//getters
	public String getDirectorName(){
		return this.directorName;
	}
	
	public String getComposerName(){
		return composerName;
	}
	
	public String getGenreName(){
		return genreName;
	}
	
	//setters
	public void setDirectorName(String directorName){
		this.directorName = directorName;
	}
	
	public void setComposerName(String composerName){
		this.composerName = composerName;
	}
	
	public void setGenreName(String genreName){
		this.genreName = genreName;
	}
	
	//Film::Film
	//constructor
	public Film() {
		directorName = "";
		composerName = "";
		genreName = "";
	}
	
	//Film::Film
	//constructor accepts String directorName, String composerName, String genreName
	public Film(String directorName, String composerName, String genreName) { 
		this.directorName = directorName;
		this.composerName = composerName;
		this.genreName = genreName;
	}

	public String toString(){

		return directorName + ", " + composerName + ", " + genreName;
	}
	
	/*
	Sci Fi

	Adventure

	Drama

	War

	Romance

	Thriller

	Fantasy 
	*/
	public int compareTo(Film other){ //if its primitive data type u cant use compareTo method but instead use CompareTo class

		
		int index1 = CORRECT_GENRE_ORDER.indexOf(this.genreName);
		int index2 = CORRECT_GENRE_ORDER.indexOf(other.genreName);

		return Integer.compare(index1, index2);


		/*
		Integer.compare(.getYearReleased(), getYearReleased())

		int last =  this.getYearReleased().compareTo(other.getYearReleased());
        return last == 0 ? this.yearReleased.compareTo(other.yearReleased) : last;
		*/
	}

	//static - u can call methods without instaniating an object
	
}
