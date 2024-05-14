package praktikumgui;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class noSatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JOptionPane box = new JOptionPane();
        String inputan;
        
        int pilihan;

        do {
            inputan = JOptionPane.showInputDialog("TUTOR");
            JOptionPane.showMessageDialog(box, inputan);
            pilihan = JOptionPane.showConfirmDialog(null, inputan);
        } while (pilihan == 0);
        
        

    }

}
