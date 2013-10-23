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
         String str = String.format("Use Menus and Internal frames Panels Borders, colors, Fonts as much as it makes the program more user friendly\nIn Target, add " +
                 "a titledBorder to the slider, the tile shows the values of slider as the slider moves." +
                 "\nUse package command to package the source files. Use audios directory to store audio clips." +
                 "\nProgram Specification: Create a folder named CS342.\nCreate a subdirectory Demo07 inside CS342." +
                 "\ncd to Demo08 Create Demo08.java to be run as an applet as well as application." +
                 "\nMenu bar has two menus: About, Demos About menu has three menuItems: AuthorIdentification, ProblemDescription, References" +
                 "\nDemos menu has two menuItems: Target, Audios \n" +
                 "It can use the source files as Author.java, Problem.java, Target.java, Audio.java should be internal frames executed using menus." +
                 "\nSelect your favorite audio clips (5).The internal fram nAudio.java has controls and a list of audio clips as shown in the class." +
                 " The controls are buttons, selection list is a JList.\nName manifest file as m.txt Fully document it with javadoc style comments" +
                 "\nCompile every file with javac *.java\nCreate a jar file containing all files everything into jar file" +
                 "\nincluding manifest file m.txt Now all the *.java files are in source directory\n, *.class\n" +
                 "files are code directory audioClips are in audios, documentation is in docs directory and Demo08.jar and Demo08j.html files are in the same directory" +
                 "Demo08.(If there is index.html file in Demo08 or any subdirectory,\nremove it from this directory)\nCreate html file as Demo\n08\nj\n.htmlwhich is a text file with only one line\n<applet code =Demo\n0\n8\narchive = Demo\n0\n8\n.jar width = 600 height = 600></applet>\nWhat is sent to Blackboa\nrd:\nU\npload the\njar\nfile\nDemo\n08\n.jar and html file Demo\n08\nj.html\nUpload the complete URL\nhttp://www.mst.edu/~yourID/CS342/Demo\n08\n/Demo\n08\nj.html\nIn th\ne author identification panel, w\nrite a\nstatement that this is your original code\nif it is so\n. If you borrowed any\nsegment of code development, give reference (citation with complete info to the reader) to avoid plagiarism.\nNote. The grader will grade it only if\nthe\n•\nProgram is uploaded by due d\nate and time.\n•\nFile names are\ncorrect.\n•\nProgram is original\n•\nProgram has complete and correct link\n•\nProgram is uploaded with\njar\nfile\ncontaining all program files, no other files.\nThe\nprogram\nshould not contain any commented code. Any\ncode not needed should not be part of submission.\nExtra points will be takes for not following the\nguidelines.");
         JTextArea textArea = new JTextArea(str, 30, 50);
         textArea.setLocation(100, 10);
         add(textArea);
         System.out.println("Gah");
    }
}
