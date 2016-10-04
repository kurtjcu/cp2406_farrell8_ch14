package Ex01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by kurt.Schoenhoff on 4/10/2016.
 */
public class JBookQuote2 extends JBookQuote implements ActionListener {

    JButton button = new JButton("Get Book Title");
    JLabel bookTitle = new JLabel("");

    public JBookQuote2() {
        super();
        add(button);
        button.addActionListener(this);

    }

    public static void main(String[] args) {
        JBookQuote2 frame = new JBookQuote2();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent buttonPress) {
        Object source = buttonPress.getSource();
        if (source == button) {
            quote.setText("Fear and loathing in Las Vegas");
        }
    }
}
