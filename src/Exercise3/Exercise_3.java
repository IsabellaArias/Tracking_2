package Exercise3;

public class Exercise_3 {

    private float cost_of_the_house;
    private int type_of_property;
    private float Real_Estate_Commission;
    private float Money_received_by_the_user;

    public float getCost_of_the_house() {
        return cost_of_the_house;
    }

    public void setCost_of_the_house(float cost_of_the_house) {
        this.cost_of_the_house = cost_of_the_house;
    }

    public int getType_of_property() {
        return type_of_property;
    }

    public void setType_of_property(int type_of_property) {
        this.type_of_property = type_of_property;
    }

    public float getReal_Estate_Commission() {
        return Real_Estate_Commission;
    }

    public void setReal_Estate_Commission(float real_Estate_Commission) {
        Real_Estate_Commission = real_Estate_Commission;
    }

    public float getMoney_received_by_the_user() {
        return Money_received_by_the_user;
    }

    public void setMoney_received_by_the_user(float money_received_by_the_user) {
        Money_received_by_the_user = money_received_by_the_user;
    }

    public void calculate_the_commission() {
        if (type_of_property == 1) {
            Real_Estate_Commission = cost_of_the_house * 0.10f;
        } else if (type_of_property == 2) {
            Real_Estate_Commission = cost_of_the_house * 0.12f;
        } else {
            System.out.println("Invalid option");
        }
    }

    public void Show_money_that_the_user_receives() {
        Money_received_by_the_user = cost_of_the_house - Real_Estate_Commission;
        System.out.println("The commission of the real estate is: $" + Real_Estate_Commission);
        System.out.println("Money received by the user: $" + Money_received_by_the_user);
    }
}