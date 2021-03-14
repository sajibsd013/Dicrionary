package dicrionary;
/**
 * Sajib Sutradhar (190103020013)
 * 
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DictionarySec {

    public JTextField[] field;
    public String Q, A, en[] = {"good", "cat", "dog", "tiger", "pen", "book", "cow", "snake", "hen", "ball", "horse", "big", "small", "bad", "cap", "few", "bird", "letter", "house", "end"};
    public String bn[] = {"ভাল", "বিড়াল", "কুকুর", "বাঘ", "কলম", "বই", "গরু", "সাপ", "মুরগী", "খেলার বল", "বড়", "ছোট", "খারাপ", "টুপি", "কয়েক", "পাখি", "চিঠি", "বাড়ি", "শেষ"};

    public JLabel label = new JLabel("Enter 'EN'/'BN' text here: ");
    public Font font = new Font("Nirmala UI", Font.PLAIN, 16);
    public Font font1 = new Font("Times New Roman", Font.BOLD, 16);
    public HashMap<String, String> dis = new HashMap<>();

    public void sec() {

        for (int i = 0; i < bn.length; i++) {
            dis.put(en[i], bn[i]);
        }
        for (int i = 0; i < bn.length; i++) {
            dis.put(bn[i], en[i]);
        }

        field = new JTextField[2];
        for (int i = 0; i < 2; i++) {

            field[i] = new JTextField();
            field[i].setFont(font);
            field[i].setBackground(Color.white);
            field[i].setHorizontalAlignment(JTextField.CENTER);

        }
        field[0].setBounds(20, 60, 200, 35);
        field[1].setBounds(20, 120, 200, 35);
        field[1].setEditable(false);
        field[1].setVisible(false);

        label.setBounds(20, 30, 200, 35);
        label.setFont(font1);

        field[0].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Q = field[0].getText();
                if (dis.containsKey(Q)) {
                    A = dis.get(Q);
                    field[1].setText(A);
                    field[1].setVisible(true);
                } else {
                    field[1].setText("Not Found!");
                    field[1].setVisible(true);
                }
            }
        });

        field[0].addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
               
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                 Q = field[0].getText();
                if (dis.containsKey(Q)) {
                    A = dis.get(Q);
                    field[1].setText(A);
                    field[1].setVisible(true);
                } else {
                    field[1].setVisible(false);
                }
            }
        });

    }
}
