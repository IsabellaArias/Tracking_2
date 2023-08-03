package Exercise1;

public class Exercise_1 {
        private int start;
        private int finish;
        private int to_execute;

    public int getTo_execute() {
        return to_execute;
    }

    public void setTo_execute(int to_execute) {
        this.to_execute = to_execute;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public void ShowCycle(){
        for (int x= start; x<= finish; x++){
                System.out.println(x);
        }
    }

    public void execute(){
        if (to_execute==1){
            ShowCycle();
        } else{
        System.out.println("Understood, the cycle will not run");
        }
    }
}
