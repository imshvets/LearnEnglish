package window;

import Hibernate.HibernateUtil;
import dictbase.Word;
import org.hibernate.Session;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.util.Random;

/**
 * Created by Oleg on 03.07.2016.
 */
public class ProgramWindow extends JFrame {
    private static int difLevev = 5;
    public static long time = 10000;

   public ProgramWindow(){
        super("English Learning");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocation(560, 340);
        JPanel panel = new JPanel();
        panel.setLayout(null);



       JButton buttonStart = new JButton("Старт!");

        buttonStart.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                new WinWord();
            }
        });
        buttonStart.setSize(buttonStart.getPreferredSize());
        buttonStart.setLocation(500, 310);

        JSlider frequency = new JSlider(JSlider.HORIZONTAL, 10, 60, 10);

        frequency.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event){
                switch (frequency.getValue()){
                    case 10:
                        time = 10000;
                        break;
                    case 15:
                        time = 15000;
                        break;
                    case 20:
                        time = 20000;
                        break;
                    case 25:
                        time = 25000;
                        break;
                    case 30:
                        time = 30000;
                        break;
                    case 35:
                        time = 35000;
                        break;
                    case 40:
                        time = 40000;
                        break;
                    case 45:
                        time = 45000;
                        break;
                    case 50:
                        time = 50000;
                        break;
                    case 55:
                        time = 55000;
                        break;
                    case 60:
                        time = 60000;
                        break;
                }

            }
        });
        frequency.setMajorTickSpacing(10);
        frequency.setMinorTickSpacing(5);
        frequency.setPaintTicks(true);
        frequency.setPaintLabels(true);
        frequency.setSnapToTicks(true);
        frequency.setSize(frequency.getPreferredSize());
        frequency.setLocation(10, 50);

        JLabel freqTitle = new JLabel("Выберите частоту показа слов (раз в 10-60 минут)");
        freqTitle.setLocation(10, 20);
        freqTitle.setSize(freqTitle.getPreferredSize());

        JLabel comboTitle = new JLabel("Выберите уровень сложности");
        comboTitle.setLocation(10, 150);
        comboTitle.setSize(comboTitle.getPreferredSize());

        String [] diffLevel = new String[] {"Легкий уровень", "Средний уровень", "Сложный уровень"};
        JComboBox combo = new JComboBox(diffLevel);

        combo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (combo.getSelectedItem().equals("Легкий уровень")) difLevev = 5;
                if (combo.getSelectedItem().equals("Средний уровень")) difLevev = 7;
                if (combo.getSelectedItem().equals("Сложный уровень")) difLevev = 9;
            }
        });
        combo.setSelectedIndex(0);
        combo.setSize(combo.getPreferredSize());
        combo.setLocation(10, 180);



        panel.add(frequency);
        panel.add(comboTitle);
        panel.add(combo);
        panel.add(freqTitle);
        panel.add(buttonStart);
        setContentPane(panel);

    }


    public static String getRandomWord() {
        Random random = new Random();
        String slovo = "";
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        long lon = random.nextInt((138000) + 1);
        Word word = (Word)session.load(Word.class, lon);
        while (word.getEnglish().toCharArray().length > difLevev) {
            lon = random.nextInt((138000) + 1);
            word = (Word)session.load(Word.class, lon);
        }
        slovo = word.getEnglish() + " - " + word.getUkrainian();
        session.getTransaction().commit();
        return slovo;
    }


}
