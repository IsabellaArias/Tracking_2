package Exercise1;
import javax.swing.*;

public class Main_Exe1 {
    public static void main(String[] args) {
        Exercise_1 exercise_1 = new Exercise_1();
        exercise_1.setStart(2);
        exercise_1.setFinish(10);
        exercise_1.setTo_execute((Integer.parseInt(JOptionPane.showInputDialog("If you want the cycle to run enter \"1\" otherwise it will not run"))));
        exercise_1.execute();
    }
}