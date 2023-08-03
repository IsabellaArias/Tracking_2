package Exercise15;

import javax.swing.*;

public class Main_Exe15 {
    public static void main(String[] args) {
        Exercise_15 exercise15=new Exercise_15();
        exercise15.setRows(Integer.parseInt(JOptionPane.showInputDialog("Enter the number 9 or choose another but the result varies: ")));
        exercise15.generatePattern();
    }
}
