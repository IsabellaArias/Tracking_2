package Exercise14;

import javax.swing.*;

public class Main_Exe14 {
    public static void main(String[] args) {
        Exercise_14 exercise14=new Exercise_14();
        exercise14.setTable_number(Integer.parseInt(JOptionPane.showInputDialog("Enter the multiplication table number you want to print: ")));
        exercise14.Print_Table();
    }
}
