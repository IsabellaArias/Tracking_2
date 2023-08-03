package Exercise11;
import javax.swing.*;
public class Main_Exe11 {
    public static void main(String[] args) {
        Exercise_11 exercise11=new Exercise_11();
        exercise11.setPayment_Type(Integer.parseInt(JOptionPane.showInputDialog("Enter the payment type \n1) for coin \n 2) for banknote: ")));
        exercise11.setCurrency_Value(Integer.parseInt(JOptionPane.showInputDialog("Enter the payment value: ")));
        String show_end=exercise11.process_For_Using_Pesa();

    }
}
