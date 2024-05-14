package praktikumgui;

import javax.swing.JFrame;
import javax.swing.JButton;

public class nomorDua {
    public static void main(String[] args) {
        JFrame kotak = new JFrame();
        JButton tambahan = new JButton();
        kotak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kotak.setSize(1000, 1000);
        tambahan.setBounds(10, 10, 50, 50);
        tambahan.setSize(10, 10);
        
        
        kotak.add(tambahan);
        tambahan.setText("aa");
        tambahan.setVisible(true);
        kotak.setVisible(true);
        
        
    }
}
