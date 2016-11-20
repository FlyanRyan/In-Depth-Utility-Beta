package program.textfield;

import java.awt.Graphics;

import javax.swing.JPasswordField;

/**
 * Class: PasswordTextFieldShell
 * @author ZackEvans
 *
 * Class formats basic password text field into improved curved look
 */

public class PasswordTextFieldShell extends JPasswordField
{
	/**
	 * Function: paintComponent(Graphics g) 
	 * @author ZackEvans
	 * @param Graphics g
	 * 
	 * round corners of textfield
	 */
	
	@Override
	protected void paintComponent(Graphics g) 
    {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 6, 6);
         super.paintComponent(g);
    }
	
	/**
	 * Function: paintBorder(Graphics g)
	 * @author ZackEvans
	 * @param Graphics g
	 * 
	 * round border of textfield
	 */
	
    @Override
	protected void paintBorder(Graphics g) 
    {
         g.setColor(getForeground());
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 6, 6);
    }

}
