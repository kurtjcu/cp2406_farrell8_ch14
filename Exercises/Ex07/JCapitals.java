package Ex07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by kurt.Schoenhoff on 4/10/2016.
 */
public class JCapitals extends JFrame implements ItemListener{


    FlowLayout flow = new FlowLayout();
    JComboBox countryList = new JComboBox();
    JLabel capital = new JLabel("Topping List");
    JLabel aLabel = new JLabel("Capital");
    JTextField capitalName = new JTextField(10);
    String[] capitalsList = {"Canberra", "Auckland", "London", "Berlin", "Paris", "Washington", "Ottawa"};
    String totalPrice = "";
    String output;
    public JCapitals()
    {
        super("Capitals list");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        countryList.addItemListener(this);
        add(capital);
        countryList.addItem("Australia");
        countryList.addItem("New Zealand");
        countryList.addItem("England");
        countryList.addItem("Germany");
        countryList.addItem("France");
        countryList.addItem("America");
        countryList.addItem("Canada");
        add(countryList);
        add(aLabel);
        add(capitalName);
    }
    public static void main(String[] arguments)
    {
        JFrame frame = new JCapitals();
        frame.setSize(200, 150);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent list)
    {
        Object source = list.getSource();
        if(source == countryList)
        {
            int pizzaNum = countryList.getSelectedIndex();
            totalPrice = capitalsList[pizzaNum];
            output = totalPrice;
            capitalName.setText(output);
        }
    }
}
