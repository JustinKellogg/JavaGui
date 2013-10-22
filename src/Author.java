import javax.swing.*;
import java.awt.*;
/**
 * User: Justin
 * Date: 10/16/13
 * Time: 8:33 PM
 */


public class Author extends JInternalFrame {

    /**
     * Author Constructor
     * displays author, date and time, and code authenticity in textArea
     */
    Author()
    {
        super("Author", true, true, true, true);
        setSize(800, 500);
        setVisible(true);
        setOpaque(true);
        setLayout(new FlowLayout());
        String str =" * User: Justin\n" +
                   " * Date:10/16/13\n" +
                   " * Time: 8:05 PM\n" +
                   " * This is assignment 7, and my own work";
        TextArea textA = new TextArea(str, 30, 50);
        add(textA);

    }

}
