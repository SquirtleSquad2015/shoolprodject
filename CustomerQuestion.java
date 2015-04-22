package shoolprodject;

import javax.swing.*;
import java.awt.*;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by Andreas on 22.04.2015.
 */
public class CustomerQuestion extends JFrame{

        private JLabel ledetekst1 = new JLabel("Select shopping center  ",JLabel.CENTER);
        private JLabel ledetekst2 = new JLabel("Subject  ",JLabel.CENTER);
        private JTextArea textArea = new JTextArea(10,10);

        private JButton knapp4 = new JButton("Back");
        private JButton knapp3 = new JButton("Submit");

        private JTextField subject = new JTextField(30);


        private JPanel panel1 = new JPanel();
        private JPanel panel2 = new JPanel();
        private JPanel panel3 = new JPanel();
        private JPanel masterPanel = new JPanel();

    private ArrayList<String> list;
    private String[] centerListe = new String[100];

    private JComboBox centerValg = new JComboBox();


        public CustomerQuestion() {
            setTitle("Ask Customer Support");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(300,400);

            LayoutManager layout1 = new GridLayout(1, 2, 3, 3);
            panel1.setLayout(layout1);
            LayoutManager layout2 = new GridLayout(3, 2, 3, 3);
            panel2.setLayout(layout2);
            LayoutManager layout3 = new GridLayout(1, 0, 3, 3);
            panel3.setLayout(layout3);
            LayoutManager masterLayout = new BorderLayout();
            masterPanel.setLayout(masterLayout);

            panel2.add(knapp3);
            panel2.add(knapp4);

            panel2.add(ledetekst1);
            panel2.add(centerValg);
            panel2.add(ledetekst2);
            panel2.add(subject);

            textArea.setLineWrap(true);
            panel3.add(textArea);

            masterPanel.add(panel1, BorderLayout.NORTH);
            masterPanel.add(panel2, BorderLayout.CENTER);
            masterPanel.add(panel3, BorderLayout.SOUTH);

            add(masterPanel);
            pack();

            AutomatiskOppdatering lytteren6 = new AutomatiskOppdatering();
            int delay = 100; //milliseconds
            Timer timer = new Timer(delay, lytteren6);
            timer.start();
            timer.setRepeats(false);

            Knappelytter10 knappelytter10 = new Knappelytter10();
            knapp3.addActionListener(knappelytter10);
            Knappelytter11 knappelytter11 = new Knappelytter11();
            knapp4.addActionListener(knappelytter11);

        }

    class Knappelytter11 implements ActionListener {
        public void actionPerformed(ActionEvent hendelse) {
            JButton knapp4 = (JButton) hendelse.getSource();
            System.out.println("Back");
            dispose();

        }
    }

    class Knappelytter10 extends shoolprodject.DatabasePackage.DatabaseConnection implements ActionListener {
        public void actionPerformed(ActionEvent hendelse) {
            JButton knapp3 = (JButton) hendelse.getSource();
            String centeret = centerValg.getSelectedItem().toString();
            String subjectInput = subject.getText();
            String question = textArea.getText();
            boolean ok = false;
            boolean feil = false;

            if (subjectInput.isEmpty() && question.isEmpty()) {
                feil = true;
                JOptionPane.showMessageDialog(null, "Please enter a subject and question");
            }

            if (subjectInput.isEmpty() && !feil) {
                JOptionPane.showMessageDialog(null, "Please enter a subject");
            }

            if (question.isEmpty() && !feil) {
                JOptionPane.showMessageDialog(null, "Please provide a question");
            }

            if (!feil) {
                try {
                    openConnection();
                    ok = RegisterCustomerQuestion(centeret, subjectInput, question);

                    closeConnection();
                    if (ok) {
                        JOptionPane.showMessageDialog(null, "Thank you for submitting your question");
                        dispose();
                    }
                } catch (Exception e) {
                    shoolprodject.DatabasePackage.Database.printMesssage(e, "getCenters");
                }


            }
        }
    }



    //automatisk oppdattering
    class AutomatiskOppdatering extends shoolprodject.DatabasePackage.DatabaseConnection implements ActionListener {
        public void actionPerformed(ActionEvent hendelse) {
            try{
                openConnection();
                list = getCenters("");
                //defaultListModel.clear();
                for(int i = 0; i < list.size(); i++){
                    centerListe[i] = list.get(i).toString();
                    centerValg.addItem(centerListe[i]);
                }
                closeConnection();
            }
            catch (Exception e){
                shoolprodject.DatabasePackage.Database.printMesssage(e, "getCenters");
            }

        }
    }

}
