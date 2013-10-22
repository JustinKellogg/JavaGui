
//This is my own code, with help on random number generation from StackOverflow
//http://stackoverflow.com/questions/5887709/getting-random-numbers-in-java

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

/**
 * User: Justin
 * Date: 10/16/13
 * Time: 8:33 PM
 */

public class Target extends JInternalFrame implements  ChangeListener{

    int width = 0, height = 0;
    JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 1);
    String title = new String(Integer.toString(slider.getValue()));
    /**
     * Target constructor
     * sets up layout and slider on panel
     */
    Target()
    {
      super("Target", true, true, true, true);
      setSize(600,600);
   //   setPreferredSize(new Dimension(600, 600));
      setVisible(true);
      setOpaque(true);
      setLayout(new FlowLayout());


      slider.setBorder(BorderFactory.createTitledBorder(title));
      add(slider, BorderLayout.NORTH);
      slider.addChangeListener(this);

      System.out.println("BOO");
    }

    /**
     * paintComponent method
     * @param g Graphics object, used for displaying graphic
     * used to draw 5 circles of smaller size in relative middle of window
     */
    public void paint(Graphics g)
    {
        super.paint(g);
        width = getWidth();
        height = getHeight();
        Color oddC = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        Color evenC = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        g.setColor(oddC);

        for(int i = 5; i > 0; i--)
        {
            if(i%2 == 0)
            {
                g.setColor(evenC);
            }
            else
            {
                g.setColor(oddC);
            }
            g.fillOval(width/2-i*width/16, height/2-i*height/16, i*width/8, i*height/8);

        }

    }

    /**
     * stateChanged method
     * @param e ChangeEvent, called whenever slider value changes
     * repaints graphic whenever slider value changes, used to generate new Colors
     */
    public void stateChanged( ChangeEvent e)
    {
       String title = new String(Integer.toString(slider.getValue()));
       slider.setBorder(BorderFactory.createTitledBorder(title));
       repaint();
    }

}
