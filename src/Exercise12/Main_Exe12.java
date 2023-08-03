package Exercise12;

import javax.swing.*;

public class Main_Exe12 {
    public static void main(String[] args) {
        Exercise_12 exercise12=new Exercise_12();
        exercise12.setTeam_name_1(JOptionPane.showInputDialog("Enter a name for the first team: "));
        exercise12.setScoreboard_1(Integer.parseInt(JOptionPane.showInputDialog("Enter a marker for the first team: ")));
        exercise12.setTeam_name_2(JOptionPane.showInputDialog("Enter a name for the second team: "));
        exercise12.setScoreboard_2(Integer.parseInt(JOptionPane.showInputDialog("Enter a marker for the second team: ")));
        exercise12.setDate_1(JOptionPane.showInputDialog("Enter date number 1: "));
        exercise12.setDate_2(JOptionPane.showInputDialog("Enter date number 2: "));
        exercise12.setDate_3(JOptionPane.showInputDialog("Enter date number 3: "));
        exercise12.calculate_Ranking();
        exercise12.dates();
        exercise12.show_Ranking();
    }
}
