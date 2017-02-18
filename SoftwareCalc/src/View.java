import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public  class  View extends JFrame {
	
	JPanel panel1 = new JPanel ();
	JPanel panel2 = new JPanel ();
	JPanel panel3 = new JPanel ();
	JPanel panel4 = new JPanel ();
    
	
	JLabel FirstNumLabel= new JLabel ("First Number       ");
	JLabel SecondNumLabel= new JLabel ("Second Number ");
    JLabel res= new JLabel ("Result                  ");
	
	JTextField result = new JTextField (15); 
	JTextField FirstNum = new JTextField (15); 
	JTextField SecondNum = new JTextField (15); 
	
	JButton Plusbutton = new JButton("+");
	JButton Minbutton = new JButton("-");
	JButton Multibutton = new JButton("*");
	JButton Divbutton = new JButton("/");
	JButton Modbutton = new JButton("%");
	JButton Equalbutton = new JButton("=");
	
	char opera;
	
	Container FrameContainer ;
	
	public View (){
		super ("MVC Calculator");
		
		FirstNum.setEditable(true);
		FirstNum.setBackground(Color.white);

		SecondNum.setEditable(true);
		SecondNum.setBackground(Color.white);
	
		result.setEditable(false);
		result.setBackground(Color.white);
		
		panel1.add(FirstNumLabel); panel1.add(FirstNum);
		panel2.add(SecondNumLabel); panel2.add(SecondNum);
		panel3.add(res); panel3.add(result);
		panel4.add(Plusbutton); panel4.add(Minbutton);  panel4.add(Multibutton); panel4.add(Divbutton); panel4.add(Modbutton);
		panel4.add(Equalbutton);
		
		setLayout(new GridLayout(4,4));
		add(panel1);add(panel2);add(panel3);add(panel4);
		
		FrameContainer=getContentPane();
		FrameContainer.add(panel1);
		FrameContainer.add(panel2);
		FrameContainer.add(panel3);
		FrameContainer.add(panel4);
		
		CalHandler handler = new CalHandler ();
		Plusbutton.addActionListener(handler);
		Minbutton.addActionListener(handler);
		Multibutton.addActionListener(handler);
		Divbutton.addActionListener(handler);
		Modbutton.addActionListener(handler);
		Equalbutton.addActionListener(handler);
	}

	private class CalHandler implements  ActionListener 
	{
		
		public void actionPerformed(ActionEvent event)
				{
						if(event.getSource()== Plusbutton )
						{				
							opera = '+';
						}
						
						else if(event.getSource()== Minbutton )
						{					
							opera = '-';
						}
						
						else if(event.getSource()== Multibutton )
						{					
							opera = '*';
						}
						
						else if(event.getSource()== Modbutton )
						{	
							opera = '%';
						}
						
						else if(event.getSource()== Divbutton )
						{					
							opera = '/';
						}
						
						else if(event.getSource() == Equalbutton){
							Model Mobj = new Model () ;
						    Controller cObj = new Controller ( View.this , Mobj);    
						}
				}
	}
				
	public double getFN (){
		return (Double.parseDouble(FirstNum.getText()));
	}
	
	public double getSN (){
		return (Double.parseDouble(SecondNum.getText()));
	}
	
	public char getChar (){
		return  opera ;
	}
	
	public void setRes(Double finalRes){
		result.setText (Double.toString(finalRes));
	}

}