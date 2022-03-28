package mainModule;


public class Main {

	public static void main(String[] args) {
		try
		{
			Logic logic = new Logic();
			logic.run(null);		//?????????????????? why cant I use listOfFilms  which is List<Film>
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println("A Large Error Has Happened :-(");
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}


