import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * User: Justin
 * Date: 10/16/13
 * Time: 8:33 PM
 */
public class Demo07 extends JApplet implements ActionListener {

    Container cont = getContentPane();

    JDesktopPane desktopPane = new JDesktopPane();
    JMenuBar menuBar = new JMenuBar();
    JMenu aboutMenu = new JMenu("About");
    JMenu demoMenu = new JMenu("Demo");

    JMenuItem targetItem = new JMenuItem("Target");
    JInternalFrame targetFrame = new Target();

    JMenuItem problemItem = new JMenuItem("Problem");
    JInternalFrame problemFrame = new Problem();

    JMenuItem authorItem = new JMenuItem("Author");
    JInternalFrame authorFrame = new Author();

    JMenuItem refItem = new JMenuItem("References");
    JInternalFrame refFrame = new References();

    JMenuItem audioItem = new JMenuItem("Audio");
    JInternalFrame audioFrame = new Audio();

    /**
     * init method
     * sets panels to Panels Author, Problem, and Target
     * adds actionListener to each Panel
     */
    public void init()
    {
        cont.setLayout(new FlowLayout());
        setJMenuBar(menuBar);

        menuBar.add(demoMenu);
        menuBar.add(aboutMenu);

        targetItem.addActionListener(this);
        demoMenu.add(targetItem);
        demoMenu.add(new JSeparator());
        demoMenu.add(audioItem);
        audioItem.addActionListener(this);

        problemItem.addActionListener(this);
        aboutMenu.add(problemItem);
        aboutMenu.add(new JSeparator());
        authorItem.addActionListener(this);
        aboutMenu.add(authorItem);
        aboutMenu.add(new JSeparator());
        refItem.addActionListener(this);
        aboutMenu.add(refItem);


        setContentPane(desktopPane);
        desktopPane.add(problemFrame);
        desktopPane.add(targetFrame);
        desktopPane.add(authorFrame);
        desktopPane.add(refFrame);
        desktopPane.add(audioFrame);

        repaint();
    }

    /**
     * main method
     * sets panels to Panels Author, Problem, and Target
     * adds actionListener to each Panel
     */
    public void main()
    {
        JFrame mainFrame = new JFrame();
        //cont.setLayout(new FlowLayout());
        Demo07 demo7 = new Demo07();
        //repaint();
        mainFrame.getContentPane().add(demo7);
        demo7.init();
        mainFrame.setTitle("Demo07");
        mainFrame.setSize(700,700);
        mainFrame.setVisible(true);
    }

    /**
     * actionPerformed method
     * sets current panel to panel selected via button
     * @param e ActionEvent, event triggered from user input (button)
     */
    public void actionPerformed(ActionEvent e)
    {
        //desktopPane.remove(currentFrame);
        if(e.getActionCommand() == "Target")
        {
            if(targetFrame == null || targetFrame.isClosed())
            {
                targetFrame = new Target();
                desktopPane.add(targetFrame);
                targetFrame.setLocation(50,0);
            }
            targetFrame.toFront();
        }
        if(e.getActionCommand() == "Problem")
        {
            if(problemFrame == null || problemFrame.isClosed())
            {
                problemFrame = new Problem();
                desktopPane.add(problemFrame);
                problemFrame.setLocation(50,0);
            }
            problemFrame.toFront();
         }
        if(e.getActionCommand() == "Author")
        {
            if(authorFrame == null || authorFrame.isClosed())
            {
                authorFrame = new Author();
                desktopPane.add(authorFrame);
                authorFrame.setLocation(50,0);
            }
            authorFrame.toFront();
        }
        if(e.getActionCommand() == "References")
        {
            if(refFrame == null || refFrame.isClosed())
            {
                refFrame = new References();
                desktopPane.add(refFrame);
                refFrame.setLocation(50,0);
            }
            refFrame.toFront();
        }

        if(e.getActionCommand() == "Audio")
        {
            if(audioFrame == null || audioFrame.isClosed())
            {
                refFrame = new Audio();
                desktopPane.add(audioFrame);
                audioFrame.setLocation(50,0);
            }
            audioFrame.toFront();
        }
        System.out.println(e.getActionCommand());
        repaint();
    }
}
