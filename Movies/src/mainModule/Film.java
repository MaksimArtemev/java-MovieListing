package mainModule;

//Superclass/parent
public class Film {
	
	//Attributes
	private String directorName;
	private String composerName;
	private String genreName;
	
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
	//constructor
	public Film(String directorName, String composerName) {
		this.directorName = directorName;
		this.composerName = composerName;
	}
	
	//Film::Film
	//constructor accepts String directorName, String composerName, String genreName
	public Film(String directorName, String composerName, String genreName) { 
		this.directorName = directorName;
		this.composerName = composerName;
		this.genreName = genreName;
	}
	
}
