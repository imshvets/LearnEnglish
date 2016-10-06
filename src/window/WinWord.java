package window;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Oleg on 05.07.2016.
 */
public class WinWord extends JFrame {

    private String wordik = ProgramWindow.getRandomWord();

    public WinWord(){

        super("ЗАПОМНИ!");
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setSize(300, 200);
        setLocation(1550, 800);
        JButton buttonW = new JButton(wordik);

        buttonW.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                WinWord.super.dispose();
                timer();
            }
        });
        setVisible(true);
        getContentPane().add(buttonW);

    }

   private static void timer() {
        try {
            Thread.sleep(ProgramWindow.time);
            new WinWord();
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

}
