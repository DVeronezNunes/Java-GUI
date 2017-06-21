package common;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

//Extends to JFrame
public class Principal extends JFrame{

	private static final long serialVersionUID = 1L;

	//Class main
	public static void main (String [] Args){
		//Create frame principal 
		Principal principal = new Principal();
		//Set default behavior when closed (Exit when closed)
		principal.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Set frame visible to user
		principal.setVisible(true);
	}
	
	//Constructor
	public Principal(){
		//Set frame title
		this.setTitle("Easy example");
		//Set frame size
		this.setSize(500,450);
		//Invoke method to initialize the Frame
		initFrame();
	}
	
	//Method initialize frame
	public void initFrame(){
		//JPanel panel = new JPanel();
		JPanel panel = (JPanel)this.getContentPane();
		//Set panel layout with 3 - Rows and 1 - Column
		panel.setLayout(new GridLayout(3,1));
		//Create a label and centralize it
		JLabel label = new JLabel("Simple sample", SwingConstants.CENTER);
		//Add label on panel and centralize it
		panel.add(label, SwingConstants.CENTER);
		addWindowListener(new FrameClose());
	}
	
	//Class that validate the message when close frame
	class FrameClose extends WindowAdapter {
		//Method that validate the message when close frame
		public void windowClosing(WindowEvent e) {
				int confirm = JOptionPane.showConfirmDialog(
						e.getWindow(),
						"Are you want exit?",
						JOptionPane.YES_NO_OPTION,
						//JOptionPane.QUESTION_MESSAGE
						);
					if(confirm == JOptionPane.YES_NO_OPTION ) {
						e.getWindow().dispose();
						System.exit(0);
		            }
		        }
		 } 
}
