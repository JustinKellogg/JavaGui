import javax.swing.*;
import java.awt.*;

/**
 * User: Justin
 * Date: 10/16/13
 * Time: 8:33 PM
 */
public class Problem extends JInternalFrame {

    /**
     * Problem constructor
     * displays problem description in textArea
     */
    Problem()
    {
        super("Problem", true, true, true, true);
        setSize(800, 500);
        setVisible(true);
        setOpaque(true);
        setLayout(new FlowLayout());
         String str = "Write a program\n" +
                 "Demo05 driver for program\n" +
                 "that uses three panels. One\n" +
                 "panel file\n" +
                 "for author identification\n" +
                 "and ownership of code" + "," +
                 " any\n" +
                 "references to avoid plagiarism,\n" +
                 "one" + " panel" + " for problem description, one\n" +
                 "panel" + " for displaying the Bull’s eye as in CS343Lab04" +
                 ": " +
                 "Exercise Bull's" +
                 " eye 6.1, pp.226" +
                 ".\n" +
                 "Using constructor Color(int r,\n" +
                 "int g, int b) with\n" +
                 " random" +
                 "ly generated\n" +
                 "colors as in the figure below. Use two alternating" +
                 " colors" +
                 ".\n" +
                 "Use slider t" +
                 "o inter" +
                 "active" +
                 "ly change colors\n" +
                 "in the target on the\n" +
                 "screen." +
                 " Use only Math class random function to generate random\n" +
                 "numbers.";
         JTextArea textArea = new JTextArea(str, 30, 50);
         textArea.setLocation(100, 10);
         add(textArea);
         System.out.println("Gah");
    }
}
