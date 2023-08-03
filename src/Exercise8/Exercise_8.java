package Exercise8;
import javax.swing.*;
public class Exercise_8 {
    private float side_A;
    private float side_B;
    private float side_c;

    public float getSide_A() {
        return side_A;
    }

    public void setSide_A(float side_A) {
        this.side_A = side_A;
    }

    public float getSide_B() {
        return side_B;
    }

    public void setSide_B(float side_B) {
        this.side_B = side_B;
    }

    public float getSide_c() {
        return side_c;
    }

    public void setSide_c(float side_c) {
        this.side_c = side_c;
    }

    public void triangle_check() {
        if (side_A == side_B && side_B == side_c) {
            JOptionPane.showMessageDialog(null, "The triangle is equilateral");
        } else {
            JOptionPane.showMessageDialog(null, "The triangle is not equilateral");
        }
    }
}
