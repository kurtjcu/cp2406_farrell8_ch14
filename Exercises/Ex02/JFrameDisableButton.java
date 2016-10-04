package Ex02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kurt.Schoenhoff on 4/10/2016.
 */
public class JFrameDisableButton extends JFrame implements ActionListener {

    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("disable Button");
    int size = 200;

    //constructor
    public JFrameDisableButton() {

        setSize(size * 2, size);
        setLayout(flow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(button);
        button.addActionListener(this);

    }

    public static void main(String[] args) {
        JFrameDisableButton jFrame = new JFrameDisableButton();
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent buttonPress) {

        Object source = buttonPress.getSource();
        if (source == button) {
            System.out.println("button pressed");
            button.removeActionListener(this);
            button.setText("Disabled");
        }
    }

}
