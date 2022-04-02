package mainModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Collections; //used for comparable
import java.util.List;
import java.util.Scanner;

public class Logic {

	private GUI gui;
	private List<Film> listOfFilms;

	public static final String FILEPATH = "MovieListing.txt";

	// Logic::Logic
	// constructor
	public Logic() {
		listOfFilms = new ArrayList<Film>();
		this.gui = new GUI();
	}

	/********************************
	 *********** METHODS**************
	 ********************************/

	public void readInputFile() throws IOException {
		/*
		 * The first line in the input file is the Director name.
		 * The second line in the input file is the Composer name.
		 * The rest of the input file has one movie and data per line. Each piece of
		 * data is separated by a comma:
		 * 
		 * Layout:
		 * Movie Title, Year Released, Genre, Rating
		 */

		// path to the inputFile
		Scanner scanner = new Scanner(new File(FILEPATH));

		// Declare components outside of the for loop for performance boost
		String directorName = ""; // holds director name
		String composerName = ""; // holds composer name

		String[] row; // holds the line

		directorName = scanner.nextLine(); // read in line from input file (1st line: director's Name)
		composerName = scanner.nextLine(); // read in next line from input file (2nd line: composer's Name)

		while (scanner.hasNextLine()) {

			String movieTitle = ""; // 1st token
			String rawYearReleased = ""; // 2nd token //TO DO: parse to int
			int yearReleased = 0;
			String genreName = ""; // 3rd token
			String rating = ""; // 4th token

			// Deserialize <movieTitle>, <rawYearReleased>, <genreName>, <rating>into a Film
			// class

			row = scanner.nextLine().split(", "); // read in next line from input file (1st line on 1st iteration)
			movieTitle = row[0]; // holds the movie title
			rawYearReleased = row[1]; // holds the Year the movie was Released
			genreName = row[2]; // holds the category of storm
			rating = row[3]; // holds the category of storm

			yearReleased = Integer.parseInt(rawYearReleased);

			// .equals compares values - value comparison
			// == reference comparison
			if (genreName.equals("Sci Fi")) {
				SciFi sciFi = new SciFi(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(sciFi); // Add an object of subclass SciFi to array list (listOfFilms) that holds movie
										// data

			} else if (genreName.equals("Adventure")) {
				Adventure adventure = new Adventure(directorName, composerName, genreName, movieTitle, yearReleased,
						rating);
				listOfFilms.add(adventure); // Add an object of subclass Adventure to array list (listOfFilms) that
											// holds movie data

			} else if (genreName.equals("Drama")) {
				Drama drama = new Drama(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(drama); // Add an object of subclass Drama to array list (listOfFilms) that holds movie
										// data

			} else if (genreName.equals("War")) {
				War war = new War(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(war); // Add an object of subclass War to array list (listOfFilms) that holds movie
										// data

			} else if (genreName.equals("Romance")) {
				Romance romance = new Romance(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(romance); // Add an object of subclass Romance to array list (listOfFilms) that holds
											// movie data

			} else if (genreName.equals("Thriller")) {
				Thriller thriller = new Thriller(directorName, composerName, genreName, movieTitle, yearReleased,
						rating);
				listOfFilms.add(thriller); // Add an object of subclass Thriller to array list (listOfFilms) that holds
											// movie data

			} else if (genreName.equals("Fantasy")) {
				Fantasy fantasy = new Fantasy(directorName, composerName, genreName, movieTitle, yearReleased, rating);
				listOfFilms.add(fantasy); // Add an object of subclass Fantasy to array list (listOfFilms) that holds
											// movie data

			}

		} // end while loop
		scanner.close();

	} // end readInInputFile()

	// Comparison done using compareTo function
	public void sort() {

		List<SciFi> sciFiGenreTemp = new ArrayList<SciFi>();
		List<Adventure> adventureGenreTemp = new ArrayList<Adventure>();
		List<Drama> dramaGenreTemp = new ArrayList<Drama>();
		List<War> warGenreTemp = new ArrayList<War>();
		List<Romance> romanceGenreTemp = new ArrayList<Romance>();
		List<Thriller> thrillerGenreTemp = new ArrayList<Thriller>();
		List<Fantasy> fantasyGenreTemp = new ArrayList<Fantasy>();
		for (Film film : listOfFilms) {
			if (film.getGenreName().equals("Sci Fi")) {
				sciFiGenreTemp.add((SciFi) film);
			}
			if (film.getGenreName().equals("Adventure")) {
				adventureGenreTemp.add((Adventure) film);
			}
			if (film.getGenreName().equals("Drama")) {
				dramaGenreTemp.add((Drama) film);
			}
			if (film.getGenreName().equals("War")) {
				warGenreTemp.add((War) film);
			}
			if (film.getGenreName().equals("Romance")) {
				romanceGenreTemp.add((Romance) film);
			}
			if (film.getGenreName().equals("Thriller")) {
				thrillerGenreTemp.add((Thriller) film);
			}
			if (film.getGenreName().equals("Fantasy")) {
				fantasyGenreTemp.add((Fantasy) film);
			}
		}

		sciFiGenreTemp.sort((o1, o2) -> o1.getYearReleased() - o2.getYearReleased());
		adventureGenreTemp.sort((o1, o2) -> o1.getYearReleased() - o2.getYearReleased());
		dramaGenreTemp.sort((o1, o2) -> o1.getYearReleased() - o2.getYearReleased());
		warGenreTemp.sort((o1, o2) -> o1.getYearReleased() - o2.getYearReleased());
		romanceGenreTemp.sort((o1, o2) -> o1.getYearReleased() - o2.getYearReleased());
		thrillerGenreTemp.sort((o1, o2) -> o1.getYearReleased() - o2.getYearReleased());
		fantasyGenreTemp.sort((o1, o2) -> o1.getYearReleased() - o2.getYearReleased());

		List<Film> newListOfFilms = new ArrayList<Film>();
		newListOfFilms.addAll(sciFiGenreTemp);
		newListOfFilms.addAll(adventureGenreTemp);
		newListOfFilms.addAll(dramaGenreTemp);
		newListOfFilms.addAll(warGenreTemp);
		newListOfFilms.addAll(romanceGenreTemp);
		newListOfFilms.addAll(thrillerGenreTemp);
		newListOfFilms.addAll(fantasyGenreTemp);

		listOfFilms = newListOfFilms;
	}

	public void sortFilms() {
		sort();
		// Collections.sort(listOfFilms);
	}

	public void run() throws IOException {
		readInputFile();
		guiResultStrings();
	}

	// methods for GUI
	public String filterResults(String genre) {
		sortFilms();
		String serializedOutput = "";
		String header = "";

		String objectGenre = "";
		for (Film film : listOfFilms) {

			if (film.getGenreName().equals(genre) && genre.equals("Sci Fi")) {
				SciFi sciFi = (SciFi) film;

				objectGenre = sciFi.getGenreName();
				serializedOutput += String.format("%-70s%7d%7s%n", sciFi.getMovieTitle(), sciFi.getYearReleased(),
						sciFi.getRating());
				// serializedOutput += ((SciFi) film).toString(); //instead of toString use
				// getDirectorName() ....
				// String str2 = String.format("|%10d|", 101); // Right-justifying within the
				// specified width
				// String str3 = String.format("|%-10d|", 101); // Left-justifying within the
				// specified width
			}
			if (film.getGenreName().equals(genre) && genre.equals("Adventure")) {
				Adventure adventure = (Adventure) film;
				objectGenre = adventure.getGenreName();

				serializedOutput += String.format("%-70s%7d%7s%n", adventure.getMovieTitle(),
						adventure.getYearReleased(), adventure.getRating());
				// serializedOutput += ((Adventure) film).toString(); //instead of toString use
				// getDirectorName() ....
			}
			if (film.getGenreName().equals(genre) && genre.equals("Drama")) {
				Drama drama = (Drama) film;
				objectGenre = drama.getGenreName();

				serializedOutput += String.format("%-70s%7d%7s%n", drama.getMovieTitle(), drama.getYearReleased(),
						drama.getRating());
				// serializedOutput += ((Drama) film).toString(); //instead of toString use
				// getDirectorName() ....
			}
			if (film.getGenreName().equals(genre) && genre.equals("War")) {
				War war = (War) film;
				objectGenre = war.getGenreName();

				serializedOutput += String.format("%-70s%7d%7s%n", war.getMovieTitle(), war.getYearReleased(),
						war.getRating());
				// serializedOutput += ((War) film).toString(); //instead of toString use
				// getDirectorName() ....
			}
			if (film.getGenreName().equals(genre) && genre.equals("Romance")) {
				Romance romance = (Romance) film;
				objectGenre = romance.getGenreName();

				serializedOutput += String.format("%-70s%7d%7s%n", romance.getMovieTitle(), romance.getYearReleased(),
						romance.getRating());
				// serializedOutput += ((Romance) film).toString(); //instead of toString use
				// getDirectorName() ....
			}
			if (film.getGenreName().equals(genre) && genre.equals("Thriller")) {
				Thriller thriller = (Thriller) film;
				objectGenre = thriller.getGenreName();

				serializedOutput += String.format("%-70s%7d%7s%n", thriller.getMovieTitle(), thriller.getYearReleased(),
						thriller.getRating());
				// serializedOutput += ((Thriller) film).toString(); //instead of toString use
				// getDirectorName() ....
			}
			if (film.getGenreName().equals(genre) && genre.equals("Fantasy")) {
				Fantasy fantasy = (Fantasy) film;
				objectGenre = fantasy.getGenreName();

				serializedOutput += String.format("%-70s%7d%7s%n", fantasy.getMovieTitle(), fantasy.getYearReleased(),
						fantasy.getRating());
				// serializedOutput += ((Fantasy) film).toString(); //instead of toString use
				// getDirectorName() ....
			}

			header = String.format("Director:%25s\nComposer:%23s\nGenre:%41s\n\n", film.getDirectorName(),
					film.getComposerName(), objectGenre);
			header += String.format("%-200s\n", "");
			header += String.format("%-70s%7s%7s\n", "Movie Title", "Year", "Rating");

		}

		return header + serializedOutput;
	}

	public void guiResultStrings() {
		this.gui.displayMessage(filterResults("Sci Fi"));
		this.gui.displayMessage(filterResults("Adventure"));
		this.gui.displayMessage(filterResults("Drama"));
		this.gui.displayMessage(filterResults("War"));
		this.gui.displayMessage(filterResults("Romance"));
		this.gui.displayMessage(filterResults("Thriller"));
		this.gui.displayMessage(filterResults("Fantasy"));
	}

}
