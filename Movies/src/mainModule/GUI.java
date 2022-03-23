package mainModule;

import javax.swing.JOptionPane;

public class GUI {
	public String displayOption(String Description)
	{
		String value = JOptionPane.showInputDialog(Description);
		if(value == null)
		{
			value = "-1";
			
		}
		return value;

	}
	
	public void displayMessage(String Description)
	{
		JOptionPane.showMessageDialog(null, Description);

	}
	
	//GUI::GUI
	//constructor
	public GUI() {
		
	}
}
