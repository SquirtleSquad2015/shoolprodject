package shoolprodject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;

class HovedVindu  extends JFrame{
    private JLabel ledetekst = new JLabel("MENY",JLabel.CENTER);
    private JButton bildeKnapp = new JButton("");
    private JButton knapp1 = new JButton("Customer");
    private JButton knapp2 = new JButton("Login");
    private JButton knapp3 = new JButton("Close");
    private JButton knapp4 = new JButton("testinloggin meny");
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel masterPanel = new JPanel();
    //test


    public HovedVindu() throws IOException {

        setTitle("SCHMIDT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,600);
        
        LayoutManager layout1 = new GridLayout(1, 2, 3, 3);
        panel1.setLayout(layout1);
        LayoutManager layout2 = new GridLayout(7, 2, 3, 3);
        panel2.setLayout(layout2);
        LayoutManager masterLayout = new BorderLayout();
        masterPanel.setLayout(masterLayout);


        panel1.add(bildeKnapp);
        
        Image img = ImageIO.read(getClass().getResource("bilde/bilde.png"));
        bildeKnapp.setIcon(new ImageIcon(img));
        bildeKnapp.setSize(300, 200);
        
          
        panel2.add(knapp1);
        knapp1.setSize(300, 100);
        panel2.add(knapp2);
        panel2.add(knapp3);
        panel2.add(knapp4);
        
        masterPanel.add(panel1, BorderLayout.NORTH);
        masterPanel.add(panel2, BorderLayout.SOUTH);
        add(masterPanel);
        
        

        Knappelytter1 lytteren = new Knappelytter1();
        knapp1.addActionListener(lytteren);  // knytter lytteren til knappen

        Knappelytter2 lytteren2 = new Knappelytter2();
        knapp2.addActionListener(lytteren2);

        Knappelytter3 lytteren3 = new Knappelytter3();
        knapp3.addActionListener(lytteren3);

        Knappelytter4 lytteren4 = new Knappelytter4();
        knapp4.addActionListener(lytteren4);
    }



    class Knappelytter1 extends JFrame implements ActionListener {
        public void actionPerformed(ActionEvent hendelse) {
            JButton knapp1 = (JButton) hendelse.getSource();
            setVisible(false);
            Costumer CostumerVindu = new Costumer();
            CostumerVindu.setLocationRelativeTo(null);
            CostumerVindu.setVisible(true);
        }
    }

    class Knappelytter2 extends JFrame implements ActionListener {
        public void actionPerformed(ActionEvent hendelse) {
            JButton knapp2 = (JButton) hendelse.getSource();
            getContentPane().setVisible(false);

            Login LogInVindu = new Login();
            LogInVindu.setLocationRelativeTo(null);
            LogInVindu.setVisible(true);
            

        }
    }

    class Knappelytter3 extends JFrame implements ActionListener {
        public void actionPerformed(ActionEvent hendelse) {
            JButton knapp3 = (JButton) hendelse.getSource();
            System.out.println("Close");
            System.exit(0);

        }
    }

    class Knappelytter4 extends JFrame implements ActionListener {
        public void actionPerformed(ActionEvent hendelse) {
            JButton knapp4 = (JButton) hendelse.getSource();
            setVisible(false);
            InloggedMeny inloggedMeny  = new InloggedMeny();
            inloggedMeny.setLocationRelativeTo(null);
            inloggedMeny.setVisible(true);
        }
    }
}