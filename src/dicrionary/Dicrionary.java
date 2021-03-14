package dicrionary;

/**
 * Sajib Sutradhar (190103020013)
 * 
*/

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dicrionary extends JFrame {

    public JPanel panel;

    Dicrionary() {
        components();
    }

    public void components() {

        DictionarySec ds = new DictionarySec();
        ds.sec();

        this.setSize(250, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        panel = new JPanel();
        panel.setLayout(null);

        panel.add(ds.field[0]);
        panel.add(ds.field[1]);
        panel.add(ds.label);
        this.add(panel);

        this.validate();
    }

    public static void main(String[] args) {
        Dicrionary d = new Dicrionary();
        d.setVisible(true);
    }

}
