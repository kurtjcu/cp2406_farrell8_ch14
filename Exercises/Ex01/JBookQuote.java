package Ex01;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kurt.Schoenhoff on 4/10/2016.
 */
public class JBookQuote extends JFrame {

    FlowLayout flow = new FlowLayout();
    JLabel quote = new JLabel("we cant stop here this is bat country..");

    int size = 200;
    public  JBookQuote(){
        super("This is my book");
        setSize(size * 2, size);
        setLayout(flow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(quote);
    }
    public static void main(String[] args)
    {
        JBookQuote frame = new JBookQuote();
        frame.setVisible(true);
    }
}
