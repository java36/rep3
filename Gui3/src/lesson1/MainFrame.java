package lesson1;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame
{
	
	private TextPanel textPanel;
	private Toolbar toolbar;
	
	public MainFrame()
	{
		super("Writing Frame");
		setLayout(new BorderLayout());
		
		textPanel = new TextPanel();
		toolbar = new Toolbar();
		
		toolbar.setStringListener(new StringListener() {

			@Override
			public void setStringToWrite(String text) {
				
				textPanel.appendText(text);				
				
			}
			
			
			
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,300,500,300);
		setVisible(true);
	}

}
