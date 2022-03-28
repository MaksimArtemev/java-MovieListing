package mainModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Logic {


	private Logic logic;
	private Film films;
	private SciFi sciFi;
	private Adventure adventure;
	private Drama drama;
	private War war;
	private Romance romance;
	private Thriller thriller;
	private Fantasy fantasy;

	private GUI gui;
/*
    Logic logic = new Logic();
	Film films = new Film();
    SciFi sciFi = new SciFi();
    Adventure adventure = new Adventure();
    Drama drama = new Drama();
    War war = new War();
    Romance romance = new Romance();
    Thriller thriller = new Thriller();
    Fantasy fantasy = new Fantasy();
*/
    public static final String FILEPATH = "MovieListing.txt";

    //Logic::Logic
	//constructor
	public Logic() {
		/*
		this.films = new Film();
		this.sciFi = new SciFi();
		this.drama = new Drama();
		this.adventure = new Adventure();
		this.war = new War();
		this.romance= new Romance();
		this.thriller = new Thriller();
		this.fantasy= new Fantasy();
		
		this.gui = new GUI();
		*/
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
	    List<Film> listOfFilms = new ArrayList<Film>();
		Film films = new Film();

	    // Declare components outside of the for loop for performance boost
		String directorName = films.getDirectorName();	//holds director name
		String composerName = films.getComposerName();	//holds composer name
	    String movieTitle;							// 1st token
		String rawYearReleased;						// 2nd token    //TO DO: parse to int
		int yearReleased;
		String genreName = films.getGenreName();	// 3rd token
		String rating;								// 4th token
		
	    String[] row;								//holds the line

		boolean firstSecondLine = true;

		while (firstSecondLine == true){
			directorName = scanner.nextLine();	// read in line from input file (1st line: director's Name)
			composerName = scanner.nextLine();	// read in next line from input file (2nd line: composer's Name)
			listOfFilms.add(new Film(directorName, composerName));
			firstSecondLine = false;
		}

	    while (scanner.hasNextLine()) {
	      	// Deserialize <movieTitle>, <rawYearReleased>, <genreName>, <rating>into a Film class

			row = scanner.nextLine().split(", "); // read in next line from input file (1st line on 1st iteration)
			movieTitle = row[0]; 		// holds the movie title
			rawYearReleased = row[1]; 	// holds the Year the movie was Released
			genreName = row[2]; 		// holds the category of storm
			rating = row[3]; 			// holds the category of storm
			
			yearReleased = Integer.parseInt(rawYearReleased);
			

			if(genreName == "Sci Fi") {
				listOfFilms.add(new SciFi(directorName, composerName, genreName, movieTitle, yearReleased, rating));		//Add an object of subclass SciFi to array list (listOfFilms) that holds movie data
				
			}else if(genreName == "Adventure") {
				listOfFilms.add(new Adventure(directorName, composerName, genreName, movieTitle, yearReleased, rating));	//Add an object of subclass Adventure to array list (listOfFilms) that holds movie data
				
			}else if(genreName == "Drama") {
				listOfFilms.add(new Drama(directorName, composerName, genreName, movieTitle, yearReleased, rating));		//Add an object of subclass Drama to array list (listOfFilms) that holds movie data
				
			}else if(genreName == "War") {
				listOfFilms.add(new War(directorName, composerName, genreName, movieTitle, yearReleased, rating));			//Add an object of subclass War to array list (listOfFilms) that holds movie data
				
			}else if(genreName == "Romance") {
				listOfFilms.add(new Romance(directorName, composerName, genreName, movieTitle, yearReleased, rating));		//Add an object of subclass Romance to array list (listOfFilms) that holds movie data
				
			}else if(genreName == "Thriller") {
				listOfFilms.add(new Thriller(directorName, composerName, genreName, movieTitle, yearReleased, rating));		//Add an object of subclass Thriller to array list (listOfFilms) that holds movie data
				
			}else if(genreName == "Fantasy") {
				listOfFilms.add(new Fantasy(directorName, composerName, genreName, movieTitle, yearReleased, rating));		//Add an object of subclass Fantasy to array list (listOfFilms) that holds movie data
				
			}
	
	    } //end while loop
	    scanner.close();
	    System.out.println(listOfFilms);
	    
	  } //end readInInputFile()
	

	
	//TO DO: Add sorting algorithm for every Genre (Sort by year in ascending order)
	//sort movies by year in ascending order
	//add to  genre arraylist
	public void sortByYearAscendingOrder(List<Film> listOfFilms){
		listOfFilms.sort((o1, o2) -> o1.getYearReleased().compareTo(o2.getYearReleased()));
	}

	//display movies by genre
	//add to  genre arraylist
	public void displayByGenre(List<Film> listOfFilms){
		for (Film films : listOfFilms){
			JOptionPane.showMessageDialog(films.getYearReleased());
		}
	}

	public void run(List<Film> listOfFilms) throws IOException{
		readInInputFile();
		sortByYearAscendingOrder(listOfFilms);
		displayByGenre(listOfFilms);
	}
	

	//TO DO: Add method for GUI

}
