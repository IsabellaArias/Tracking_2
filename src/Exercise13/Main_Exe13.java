package Exercise13;

import javax.swing.*;

public class Main_Exe13 {
    public static void main(String[] args) {
        Exercise_13 exercise13=new Exercise_13();
        exercise13.setBrand(Integer.parseInt(JOptionPane.showInputDialog("you must enter a car brand between: 1) Chevrolet 2) Mazda and 3) Renault.")));
        exercise13.Information_and_Features();
    }
}
