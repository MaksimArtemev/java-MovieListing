//Get/Set Methods for each Attribute
//Constructor to initialize attributes


package mainModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Superclass/parent
public class Film {
	
	//Attributes
	private static String directorName;
	private static String composerName;
	private static String genreName;
	private static final String genre = "";
	Film film = new Film();
	public static final String FILEPATH = "MovieListing.txt";
	protected static List<Film> listOfFilms;
	protected static List<Film> skiFiFilms;
	protected static List<Film> adventureFilms;
	protected static List<Film> dramaFilms;
	protected static List<Film> warFilms;
	protected static List<Film> romanceFilms;
	protected static List<Film> thrillerFilms;
	protected static List<Film> fantasyFilms;
	
	
	//getters
	public String getDirectorName(){
		return directorName;
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
	//constructor accepts String movieTitle; int yearReleased; String genreName; String rating; from genre subclasses
	public Film(String movieTitle, int yearReleased, String genreName, String rating) {

	}
	
	
	/********************************
	 ***********METHODS**************
	 ********************************/
	
	public static void readInInputFile() throws IOException {
		/*
		The first line in the input file is the Director name.
		The second line in the input file is the Composer name.
		The rest of the input file has one movie and data per line.  Each piece of data is separated by a comma:

		Layout:
		Movie Title, Year Released, Genre, Rating
		*/
		
	    // path to the inputFile
	    Scanner scanner = new Scanner(new File(FILEPATH));
	    listOfFilms = new ArrayList<Film>();
	    directorName = scanner.nextLine();	// read in line from input file (1st line: director's Name)
	    composerName = scanner.nextLine();	// read in next line from input file (2nd line: composer's Name)
	    
	    // Declare components outside of the for loop for performance boost
	    String movieTitle;		// 1st token
		String rawYearReleased;	// 2nd token    //TO DO: parse to int
		int yearReleased;
		//genreName				// 3rd token
		String rating;			// 4th token
		
	    String[] row;	//holds the line

	    while (scanner.hasNextLine()) {
	      // Deserialize <movieTitle>, <rawYearReleased>, <genreName>, <rating>into a Film class

	      row = scanner.nextLine().split(", "); // read in next line from input file (1st line on 1st iteration)
	      movieTitle = row[0]; // holds the movie title
	      rawYearReleased = row[1]; // holds the Year the movie was Released
	      genreName = row[2]; // holds the category of storm
	      rating = row[3]; // holds the category of storm
	      
	      yearReleased = Integer.parseInt(rawYearReleased);

	      listOfFilms.add(new Film(movieTitle, yearReleased, genreName, rating));		//Add to overall array list that holds every movie data
	      
	      if(genreName == "Sci Fi") {
	    	  skiFiFilms.add(new Sci_Fi(movieTitle, yearReleased, genreName, rating));		//Add to array list that holds movie data for Sci Fi genre
	    	  
	      }else if(genreName == "Adventure") {
	    	  adventureFilms.add(new Adventure(movieTitle, yearReleased, genreName, rating));		//Add to array list that holds movie data for Adventure genre
	    	  
	      }else if(genreName == "Drama") {
	    	  dramaFilms.add(new Drama(movieTitle, yearReleased, genreName, rating));		//Add to array list that holds movie data for Drama genre
	    	  
	      }else if(genreName == "War") {
	    	  warFilms.add(new War(movieTitle, yearReleased, genreName, rating));		//Add to array list that holds movie data for War genre
	    	  
	      }else if(genreName == "Romance") {
	    	  romanceFilms.add(new Romance(movieTitle, yearReleased, genreName, rating));		//Add to array list that holds movie data for Romance genre
	    	  
	      }else if(genreName == "Thriller") {
	    	  thrillerFilms.add(new Thriller(movieTitle, yearReleased, genreName, rating));		//Add to array list that holds movie data for Thriller genre
	    	  
	      }else if(genreName == "Fantasy") {
	    	  fantasyFilms.add(new Fantasy(movieTitle, yearReleased, genreName, rating));		//Add to array list that holds movie data for Fantasy genre
	    	  
	      }
	
	    } //end while loop
	    scanner.close();
	    System.out.println(listOfFilms);
	    
	  } //end readInInputFile()
	
	
	//TO DO: Add sorting algorithm for every Genre (Sort by year in ascending order)
	//TO DO: Add GUI
	//TO DO: Add display sorted results method
	
	
	
}
