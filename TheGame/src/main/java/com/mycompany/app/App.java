package com.mycompany.app;
import java.awt.*;
import javax.swing.*;
/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TheGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 500));

        // Create label with text and add it to the window
        JLabel label = new JLabel("<html>Witaj Macieju dobrodzieju,<br>Ukonczyles pierwszy etap<br>Jestes mistrzem!</html>", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.PLAIN, 40));
        frame.getContentPane().add(label);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
