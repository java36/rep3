package lesson1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener
{
	private JButton helloBtn;
	private JButton goodbyeBtn;
	private StringListener textListener;
	
	public Toolbar()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		//branch2nnn
		helloBtn = new JButton("Hi");
		goodbyeBtn = new JButton("Bye");
		
		helloBtn.addActionListener(this);
		goodbyeBtn.addActionListener(this);
		
		
		add(helloBtn);
		add(goodbyeBtn);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == helloBtn)
			textListener.setStringToWrite("Hello!\n");
		if(e.getSource() == goodbyeBtn)
			textListener.setStringToWrite("GoodBye!\n");
	}
	
	public void setStringListener(StringListener listener)
	{
		textListener = listener;
	}

}
