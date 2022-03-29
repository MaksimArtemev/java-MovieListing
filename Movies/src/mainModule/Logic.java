package mainModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Logic {

	public GUI gui;
	private List<Film> listOfFilms;

    public static final String FILEPATH = "MovieListing.txt";

    //Logic::Logic
	//constructor
	public Logic() {

		listOfFilms = new ArrayList<Film>();
		this.gui = new GUI();
		
	}

    /********************************
	 ***********METHODS**************
	 ********************************/
	
	public void readInputFile() throws IOException {
		/*
		The first line in the input file is the Director name.
		The second line in the input file is the Composer name.
		The rest of the input file has one movie and data per line.  Each piece of data is separated by a comma:

		Layout:
		Movie Title, Year Released, Genre, Rating
		*/

	    // path to the inputFile
	    Scanner scanner = new Scanner(new File(FILEPATH));
		
	    // Declare components outside of the for loop for performance boost
		String directorName = "";					//holds director name
		String composerName = "";					//holds composer name

		
	    String[] row;								//holds the line

		directorName = scanner.nextLine();			// read in line from input file (1st line: director's Name)
		composerName = scanner.nextLine();			// read in next line from input file (2nd line: composer's Name)


	    while (scanner.hasNextLine()) {

			String movieTitle = "";						// 1st token
			String rawYearReleased = "";				// 2nd token    //TO DO: parse to int
			int yearReleased = 0;
			String genreName = "";						// 3rd token
			String rating = "";							// 4th token
			
	      	// Deserialize <movieTitle>, <rawYearReleased>, <genreName>, <rating>into a Film class

			row = scanner.nextLine().split(", "); // read in next line from input file (1st line on 1st iteration)
			movieTitle = row[0]; 		// holds the movie title
			rawYearReleased = row[1]; 	// holds the Year the movie was Released
			genreName = row[2]; 		// holds the category of storm
			rating = row[3]; 			// holds the category of storm
			
			yearReleased = Integer.parseInt(rawYearReleased);
			
			
			//.equals compares values - value comparison
			//== reference comparison
			if(genreName.equals("Sci Fi")) {
				SciFi sciFi = new SciFi(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(sciFi);			//Add an object of subclass SciFi to array list (listOfFilms) that holds movie data
				
			}else if(genreName.equals("Adventure")) {
				Adventure adventure = new Adventure(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(adventure);		//Add an object of subclass Adventure to array list (listOfFilms) that holds movie data
				
			}else if(genreName.equals("Drama")) {
				Drama drama = new Drama(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(drama);			//Add an object of subclass Drama to array list (listOfFilms) that holds movie data
				
			}else if(genreName.equals("War")) {
				War war = new War(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(war);			//Add an object of subclass War to array list (listOfFilms) that holds movie data
				
			}else if(genreName.equals("Romance")) {
				Romance romance = new Romance(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(romance);		//Add an object of subclass Romance to array list (listOfFilms) that holds movie data
				
			}else if(genreName.equals("Thriller")) {
				Thriller thriller = new Thriller(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(thriller);		//Add an object of subclass Thriller to array list (listOfFilms) that holds movie data
				
			}else if(genreName.equals("Fantasy")) {
				Fantasy fantasy = new Fantasy(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(fantasy);		//Add an object of subclass Fantasy to array list (listOfFilms) that holds movie data
				
			}
			
	
	    } //end while loop
	    scanner.close();
	    
	  } //end readInInputFile()
	
	// printing sorted ArrayList objects using enchanced for loop
    public void print()
    {;
		sortFilms();
		System.out.println("Hello world!");
		for (Film film : listOfFilms) {				//recreates a new object for each itteration
            System.out.println(film.toString());
        }

    } 

	public void sortFilms(){
		Collections.sort(listOfFilms);
	}


	
	//TO DO: Add sorting algorithm for every Genre (Sort by year in ascending order)
	//sort movies by year in ascending order
	//add to  genre arraylist
	public void sortByYearAscendingOrder(List<Film> listOfFilms){
		//listOfFilms.sort((o1, o2) -> o1.getYearReleased().compareTo(o2.getYearReleased()));
	}

	//display movies by genre
	//add to  genre arraylist
	//public void displayByGenre(List<Film> listOfFilms){
	//	for (Film films : listOfFilms){
		//	JOptionPane.showMessageDialog(films.getYearReleased());
	//	}
	//}

	public void run() throws IOException{
		readInputFile();
		print();
		//sortByYearAscendingOrder(listOfFilms);
		//displayByGenre(listOfFilms);
	}
	

	//TO DO: Add method for GUI

}
