package Exercise10;

import javax.swing.*;

public class Main_Exe10 {
    public static void main(String[] args) {
        Exersice_10 exersice10=new Exersice_10();
        exersice10.collect_Votes();
        String result_end= exersice10.show_Results();
        JOptionPane.showMessageDialog(null,"Result:"+ result_end );
    }

}
