package Exercise9;
import javax.swing.*;
public class Main_Exe9 {
    public static void main(String[] args) {
        Exercise_9 exercise9=new Exercise_9();
        exercise9.Show_message();
        exercise9.setQuestion_1(Boolean.parseBoolean(JOptionPane.showInputDialog("SHARED IS AN ANDROID APPLICATION THAT SERVES TO ACCESS YOUR ACCOUNT, INCLUDING PHOTOS, MUSIC, ETC?")));
        exercise9.setQuestion_2(Boolean.parseBoolean(JOptionPane.showInputDialog("IS OPERA MINI BROWSER AN APP THAT GIVES YOU A FAST BROWSING EXPERIENCE?")));
        exercise9.setQuestion_3(Boolean.parseBoolean(JOptionPane.showInputDialog("IS NETFLIX AN APPLICATION TO DOWNLOAD MUSIC?")));
        exercise9.setQuestion_4(Boolean.parseBoolean(JOptionPane.showInputDialog("CAN FREE SOFTWARE BE RUN, COPIED, OR DISTRIBUTED?")));
        exercise9.setQuestion_5(Boolean.parseBoolean(JOptionPane.showInputDialog("IS TRAF-O-DATA FORMED BY BILL GATES, AND PAUL ALLEN?")));

        exercise9.exam();
    }
}
