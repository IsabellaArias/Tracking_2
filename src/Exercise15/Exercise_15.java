package Exercise15;

public class Exercise_15 {
    private int rows;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void generatePattern() {
        for (int i = 0; i < rows ; i++) {
            printAsterisks();
            System.out.println("==================================");
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("==================================");
        }
    }
    public void printAsterisks() {
        for (int j = 0; j < 5; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
