package Ex02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kurt.Schoenhoff on 4/10/2016.
 */
public class JFrameDisableButton2  extends JFrameDisableButton{


    public JFrameDisableButton2() {
        super();
    }

    public static void main(String[] args) {

        JFrameDisableButton2 jFrame2 = new JFrameDisableButton2();
        jFrame2.setVisible(true);

        jFrame2.button.addActionListener(new ActionListener() {
            int count = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel enough = new JLabel("Thats Enough");
                if(count > 7) {
                    jFrame2.add(enough);//add label we made
                    jFrame2.button.removeActionListener(this);
                    jFrame2.button.setText("Disabled");
                }


                jFrame2.revalidate();
                jFrame2.repaint();

                jFrame2.pack();//so our frame resizes to compensate for new components

                count++;
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

}
