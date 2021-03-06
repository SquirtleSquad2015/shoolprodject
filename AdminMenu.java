package shoolprodject;

import shoolprodject.DatabasePackage.Database;
import shoolprodject.DatabasePackage.DatabaseConnection;

import javax.swing.*;
import javax.swing.border.Border;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminMenu extends JFrame {
    private String username;
    private String email;
    private String tlf;
    private String centerName;
    private String shopName;
    JButton Users = new JButton("View Users");
    JButton newCenter = new JButton("New Center");
    JButton editCenter = new JButton("Edit Center and Store, new Store");
    JButton deleteCenter = new JButton("Delete Center");
    JButton changeAccountInfo = new JButton("Change account information");
    JButton exit = new JButton("Exit");

    public AdminMenu(String username){
        super("ShopManager - " + username);
        this.username = username;
        setTitle("Admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LayoutManager layout = new GridLayout(6, 1, 3, 3);
        setLayout(layout);
        add(Users);
        add(newCenter);
        add(deleteCenter);
        add(editCenter);
        add(changeAccountInfo);
        add(exit);
        pack();

        Action action = new Action();
        Users.addActionListener(action);
        newCenter.addActionListener(action);
        editCenter.addActionListener(action);
        deleteCenter.addActionListener(action);
        changeAccountInfo.addActionListener(action);
        exit.addActionListener(action);
        
        AutomatiskOppdatering lytteren = new AutomatiskOppdatering();
        int delay = 100; //milliseconds
        Timer timer = new Timer(delay, lytteren);
        timer.start();
        timer.setRepeats(false);
        
    }
    private class Action extends DatabaseConnection implements ActionListener{
        public void actionPerformed(ActionEvent source) {
            JButton check = (JButton)source.getSource();

            if (check == Users) {
                AdminUserView userView = new AdminUserView();
                userView.setLocationRelativeTo(null);
                userView.setVisible(true);
            }
            if (check ==newCenter){
                newCenter center = new newCenter();
                center.setLocationRelativeTo(null);
                center.setVisible(true);
            }
            if (check ==editCenter){
                AdminCenterView centerView = new AdminCenterView();
                centerView.setLocationRelativeTo(null);
                centerView.setVisible(true);
            }
            if(check==deleteCenter){
                deleteCenter delete = new deleteCenter();
                delete.setLocationRelativeTo(null);
                delete.setVisible(true);
            }
            
            if (check ==changeAccountInfo){
                ChangeAccountInfo accountInfo = new ChangeAccountInfo(username, email, tlf);
                accountInfo.setLocationRelativeTo(null);
                accountInfo.setVisible(true);
            }
            if (check ==exit){
                System.exit(0);
            }
            
        }
    }
    class AutomatiskOppdatering extends DatabaseConnection implements ActionListener {
        public void actionPerformed(ActionEvent hendelse) {
            try{
                openConnection();
                email=getEmail(username);
                tlf=getPhoneNumber(username);
                closeConnection();
            }
            catch (Exception e){
                Database.printMesssage(e, "getCenters");
            }
            
        }
    } 
}