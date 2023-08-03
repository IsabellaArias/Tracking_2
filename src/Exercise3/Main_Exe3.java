package Exercise3;
import javax.swing.*;
public class Main_Exe3 {

    public static void main(String[] args) {
        Exercise_3 exercise_3= new Exercise_3();
        exercise_3.setCost_of_the_house (Float.parseFloat(JOptionPane.showInputDialog("Enter the cost of the house:")));
        exercise_3.setType_of_property (Integer.parseInt(JOptionPane.showInputDialog("Enter the type of property (1. Used 2. New)")));
        exercise_3.calculate_the_commission();
        exercise_3.Show_money_that_the_user_receives();
    }
}
