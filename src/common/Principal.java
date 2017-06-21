package common;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;

    private enum Action {FUNC};

    public static void main (String [] Args){
    	
    	new Principal();
    	
    }
    
    Principal()
    {
        new JFrame();
        setTitle("To buy or not to buy?");
        setLayout(new GridLayout(1,1));
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JButton bot01 = new JButton("It's the question!");
        bot01.addActionListener(this);
        bot01.setActionCommand(Action.FUNC.name());
        bot01.setMnemonic(KeyEvent.VK_T);
       
        add(bot01);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand() == Action.FUNC.name())
        {
            int result = JOptionPane.showConfirmDialog(null, "To buy a Nintendo Switch?", null, JOptionPane.YES_NO_OPTION);

            if(result == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null, "Smart guy!");
            }
        else
        {
            while(result != JOptionPane.YES_OPTION)
            {
                result = JOptionPane.showConfirmDialog(null, "It's not a option!", null, JOptionPane.YES_NO_OPTION);
           
                if(result == JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Good boy");
                    break;
                }
            }
        }
        }
    }
}