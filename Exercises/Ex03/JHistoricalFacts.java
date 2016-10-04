package Ex03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by kurt.Schoenhoff on 4/10/2016.
 */
public class JHistoricalFacts extends JFrame {


    BoxLayout box = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
    JButton button = new JButton("Touch me");

    ArrayList<String> facts = new ArrayList<String>();
    ArrayList<JLabel> jlabels = new ArrayList<>();
    Counter factsCounter;
    Counter jLabelCounter;

    JHistoricalFacts(){

        //setSize(1000 , 200);
        intitialiseData();
        initializeJFrame();

        pack();
        setVisible(true);

    }

    private void intitialiseData(){
        facts.add("A dog was the first in space and a sheep, a duck and a rooster the first to fly in a hot air balloon.");
        facts.add("Music was sent down a telephone line for the first time in 1876, the year the phone was invented.");
        facts.add("Beer was the first trademarked product – British beer Bass Pale Ale received its trademark in 1876.");
        facts.add("Playing-cards were known in Persia and India as far back as the 12th century. A pack then consisted of 48 instead of 52 cards.");
        facts.add("Excavations from Egyptian tombs dating to 5,000 BC show that the ancient Egyptian kids played with toy hedgehogs.");
        facts.add("Accounts from Holland and Spain suggest that during the 1500s and 1600s urine was commonly used as a tooth-cleaning agent.");
        facts.add("Julius Caesar was the first to encode communications, using what has become known as the Caesar Cipher.");
        facts.add("The first mention of soap was on Sumerian clay tablets dating about 2,500 BC. The soap was made of water, alkali and cassia oil.");
        facts.add("The first animal in space was the female Samoyed husky named Laika, launched by the Soviets in 1957.");


        factsCounter = new Counter(facts.size());
        jLabelCounter = new Counter(5);



        for (int i = 1; i <= 5; i++){
            jlabels.add(new JLabel(facts.get(factsCounter.increment())));
        }

    }

    private void initializeJFrame(){

        setLayout(box);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        for(int i = 0; i < jlabels.size(); i++){
            add(jlabels.get(i));
        }

        add(button);

    }


    public static void main(String[] args) {

        JHistoricalFacts hFacts = new JHistoricalFacts();

        hFacts.button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                hFacts.jlabels.get(hFacts.jLabelCounter.increment()).setText(hFacts.facts.get(hFacts.factsCounter.increment()));
                hFacts.revalidate();
                hFacts.repaint();
                hFacts.pack();//so our frame resizes to compensate for new components
            }
        });
    }
}
