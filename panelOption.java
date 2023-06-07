package com.stunnedjava;
// comment here
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class panelOption extends WindowAdapter {
    JFrame f;
    panelOption() {
         f = new JFrame();
        f.setSize(450, 450);
        f.addWindowListener(this);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e){
        int a = JOptionPane.showConfirmDialog(f,"are you sure ?");
        if (a == JOptionPane.YES_OPTION)
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
