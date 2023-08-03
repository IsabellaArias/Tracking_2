package Exercise5;

public class Exercise_5 {
    private int Size_of_the_Stikers;
    private int Number_of_Stikers;
    private int total_at_pay;

    public Exercise_5(int size_of_the_Stikers, int number_of_Stikers) {
        Size_of_the_Stikers = size_of_the_Stikers;
        Number_of_Stikers = number_of_Stikers;
    }

    public void Calculate_the_cost_of_stikers(){
        if (Size_of_the_Stikers==1 & Number_of_Stikers >=10){
            total_at_pay=Number_of_Stikers * 4000;
            System.out.println("must pay $"+ total_at_pay);
        }else if (Size_of_the_Stikers==2 & Number_of_Stikers >=10){
            total_at_pay=Number_of_Stikers * 6000;
            System.out.println("must pay $"+ total_at_pay);
        }else{
            System.out.println("Invalid option must be more than 10");
        }
    }
}
