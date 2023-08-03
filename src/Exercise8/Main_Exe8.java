package Exercise8;
import  javax.swing.*;
public class Main_Exe8 {
    public static void main(String[] args) {
        Exercise_8 exercise8=new Exercise_8();
        exercise8.setSide_A(Float.parseFloat(JOptionPane.showInputDialog("Type side A:")));
        exercise8.setSide_B(Float.parseFloat(JOptionPane.showInputDialog("Type side B:")));
        exercise8.setSide_c(Float.parseFloat(JOptionPane.showInputDialog("Type side C:")));
        exercise8.triangle_check();
    }
}
