package Exercise5;
import javax.swing.*;
public class Main_Exe5 {
    public static void main(String[] args) {
        Exercise_5 exercise5 = new Exercise_5(
                Integer.parseInt(JOptionPane.showInputDialog("Select the size of the stickers: 1) Small 2) Large")),
                Integer.parseInt(JOptionPane.showInputDialog("Indicate the number of stickers you want")));

        exercise5.Calculate_the_cost_of_stikers();
    }
}
