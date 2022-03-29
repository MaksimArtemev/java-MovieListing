package mainModule;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		try
		{
			
			Logic logic = new Logic();
			logic.readInputFile();		
			logic.print();
			System.out.println("Success");

		}
		catch(Exception e)
		{
			System.out.println("A Large Error Has Happened :-(");
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}


