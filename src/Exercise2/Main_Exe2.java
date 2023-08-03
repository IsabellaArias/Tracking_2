package Exercise2;
import Exercise1.Exercise_1;

import javax.swing.*;
public class Main_Exe2 {
    public static void main(String[] args) {
        Exercise_2 exercise_2 = new Exercise_2();
        exercise_2.setStart(2);
        exercise_2.setFinish(10);
        exercise_2.setTo_execute((Integer.parseInt(JOptionPane.showInputDialog("If you want the cycle to run enter \"1\" otherwise it will not run"))));
        exercise_2.execute();
    }
    }

