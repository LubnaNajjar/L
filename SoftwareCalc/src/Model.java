import javax.swing.JOptionPane;

public class Model {
	
	public Model (){
		
	}
	
	public double  calculate(double FirstNumber, double SecondNumber, char operation)
	{	
		double result=0;
		switch (operation)
		{
			case '+':
				result = FirstNumber+SecondNumber;
				break;
			case '-':
				result = FirstNumber-SecondNumber;
				break;
			case '*':
				result = FirstNumber*SecondNumber;
				break;
			case '/':
				result = FirstNumber/SecondNumber;
				break;
			case '%':
				result = FirstNumber%SecondNumber;
				break;
		}
		return result;
	}

}