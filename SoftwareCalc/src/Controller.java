public class Controller {
	public Controller (View v , Model  m) 
	
   { 
		double firstNum = v.getFN();
		double secondNum = v.getSN();
		char op = v.getChar();
		Double FinalRes = m.calculate(firstNum,secondNum,op);
    	v.setRes(FinalRes);

   }
}