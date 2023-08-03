package Exercise14;

public class Exercise_14 {
    private int table_number;
    private int result;

    public int getTable_number() {
        return table_number;
    }

    public void setTable_number(int table_number) {
        this.table_number = table_number;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public  void Print_Table() {
        for (int i = 1; i <= 10; i++) {
            result = table_number * i;
            System.out.println(table_number + " x " + i + " = " + result);
        }
    }
}
