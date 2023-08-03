package Exercise9;
import javax.swing.*;
public class Exercise_9 {
    private int totalPoints = 0;
    private boolean question_1;
    private boolean question_2;
    private boolean question_3;
    private boolean question_4;
    private boolean question_5;

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public boolean isQuestion_1() {
        return question_1;
    }

    public void setQuestion_1(boolean question_1) {
        this.question_1 = question_1;
    }

    public boolean isQuestion_2() {
        return question_2;
    }

    public void setQuestion_2(boolean question_2) {
        this.question_2 = question_2;
    }

    public boolean isQuestion_3() {
        return question_3;
    }

    public void setQuestion_3(boolean question_3) {
        this.question_3 = question_3;
    }

    public boolean isQuestion_4() {
        return question_4;
    }

    public void setQuestion_4(boolean question_4) {
        this.question_4 = question_4;
    }

    public boolean isQuestion_5() {
        return question_5;
    }

    public void setQuestion_5(boolean question_5) {
        this.question_5 = question_5;
    }

    public void Show_message(){
        JOptionPane.showMessageDialog(null,"Answer false or True according to the appropriate");
    }
    public void exam(){

        if (question_1 == true){
            System.out.println("¡correct answer!");
            totalPoints += 10;
        } else{
            System.out.println("incorrect answer");
        }
        if (question_2 == true){
            System.out.println("¡correct answer!");
            totalPoints += 10;
        } else{
            System.out.println("incorrect answer");
        }
        if (question_3 == false){
            System.out.println("¡correct answer!");
            totalPoints += 10;
        } else{
            System.out.println("incorrect answer");
        }
        if (question_4 == true){
            System.out.println("¡correct answer!");
            totalPoints += 10;
        } else{
            System.out.println("incorrect answer");
        }
        if (question_5 == false){
            System.out.println("¡correct answer!");
            totalPoints += 10;
        } else{
            System.out.println("incorrect answer");
        }

        JOptionPane.showMessageDialog(null,"Total points obtained: " + totalPoints);
    }
}
