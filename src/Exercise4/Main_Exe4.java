package Exercise4;
import javax.swing.*;
public class Main_Exe4 {
    public static void main(String[] args) {
        Exercise_4 exercise4=new Exercise_4();
        exercise4.setType_of_service(Integer.parseInt(JOptionPane.showInputDialog(("What service you want: 1) Washing 2) Ironing"))));
        exercise4.setQuantity_of_Garments(Integer.parseInt(JOptionPane.showInputDialog(("How many clothes?"))));
        exercise4.Services();
    }
}