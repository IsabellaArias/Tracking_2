package Exercise7;
import javax.swing.*;
public class Main_Exe7 {
    public static void main(String[] args) {
        Exercise_7 exercise7=new Exercise_7();
        exercise7.setAction(Integer.parseInt(JOptionPane.showInputDialog("You want to: 1) Return book 2) Report loss")));

        if (exercise7.getAction() == 1) {
            exercise7.setDays_of_delay(Integer.parseInt(JOptionPane.showInputDialog("How many days of delay you have:")));
            exercise7.setReturn_of_books_or_magazines(Integer.parseInt(JOptionPane.showInputDialog("You want to: 1) Return book 2) Report loss")));
            exercise7.setAmount(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of books or magazines to return:")));

            int payment = exercise7.Payment_at_the_bookstore();
            JOptionPane.showMessageDialog(null, "Late payment amount: " + payment);
        } else if (exercise7.getAction() == 2) {
            exercise7.setAmount(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of books or magazines to report loss:")));

            int payment = exercise7.Payment_at_the_bookstore();
            JOptionPane.showMessageDialog(null, "Payment for loss amount: " + payment);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice! Please select 1 or 2.");
        }
    }
    }