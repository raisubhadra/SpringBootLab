package examples;
import javax.swing.JOptionPane;

public class Test 
{
static String check(String name)
{
	if(name.equalsIgnoreCase("sunday"))
		return
			"Its a holiday";
	else 
		return " Its a working day!!!!";
}
	public static void main(String[] args) 
	{
		
System.out.println(check(JOptionPane.showInputDialog("enter day","type here")));
	}

}
