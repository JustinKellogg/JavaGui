import javax.swing.*;
import java.awt.*;

/**
 * User: Justin
 * Date: 10/16/13
 * Time: 8:33 PM
 */

public class References extends  JInternalFrame{

        References()
        {
            super("References", true, true, true, true);
            setSize(800, 500);
            setVisible(true);
            setOpaque(true);
            setLayout(new FlowLayout());
            String str ="REFERENCE THINGS";
            TextArea textA = new TextArea(str, 30, 50);
            add(textA);

        }
}
