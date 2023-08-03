package Exercise6;
import javax.swing.*;
public class Main_Exe6 {
    public static void main(String[] args) {
        Exercise_6 exercise6=new Exercise_6((Integer.parseInt(JOptionPane.showInputDialog(("Menu: 1) Pizza 2) Sandwiches 3) Salads")))),
                                            (Integer.parseInt(JOptionPane.showInputDialog(("Amount you want to order:")))),
                                            (Integer.parseInt(JOptionPane.showInputDialog(("Want sauce: 1) Yes 2) No")))));
        exercise6.Pizza_Options_Menu();
    }
}
