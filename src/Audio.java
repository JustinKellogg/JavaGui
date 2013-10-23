import javax.swing.*;
import javax.swing.event.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

/**
 * User: Justin
 * Date: 10/22/13
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Audio extends JInternalFrame implements ActionListener, ListSelectionListener{

    /**
     * Author Constructor
     * displays author, date and time, and code authenticity in textArea
     */

    Container container = getContentPane();
    URL url = getClass().getResource("AudioClips/Cold.au");
    AudioClip audioClip = Applet.newAudioClip(url);
    Button stopButton = new Button("Stop");
    Button playButton = new Button("Play");
    Button loopButton = new Button("Loop");
    String[] names = {"Cold", "crickets", "HotelCalifornia", "One", "shark"};
    JList clipList = new JList(names);

    Audio()
    {
        super("Audio", true, true, true, true);
        setSize(800, 500);
        setVisible(true);
        setOpaque(true);
        setLayout(new FlowLayout());

        container.add(stopButton);
        stopButton.addActionListener(this);
        container.add(playButton);
        playButton.addActionListener(this);
        container.add(loopButton);
        loopButton.addActionListener(this);

        clipList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        clipList.setVisibleRowCount(names.length);
        clipList.addListSelectionListener(this);
        container.add(clipList);

        audioClip.play();

    }

    public void actionPerformed(ActionEvent e)
    {
        String source = e.getActionCommand();
        if(source == "Play")
        {
          audioClip.play();
        }
        else if(source == "Stop")
        {
          audioClip.stop();
        }
        else if(source == "Loop")
        {
            audioClip.loop();
        }
    }

    public void valueChanged(ListSelectionEvent event)
    {
        audioClip.stop();
        String title = clipList.getSelectedValue().toString();
        System.out.println(clipList.getSelectedValue());
        URL url = getClass().getResource("AudioClips/" + title +".au");
        audioClip = Applet.newAudioClip(url);
        audioClip.play();
    }
}
