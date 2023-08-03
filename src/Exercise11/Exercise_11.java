package Exercise11;

public class Exercise_11 {
    private int payment_Type;
    private int currency_Value;
    private int cost_Of_Service = 500;
    private int difference;

    public int getPayment_Type() {
        return payment_Type;
    }

    public void setPayment_Type(int payment_Type) {
        this.payment_Type = payment_Type;
    }

    public int getCurrency_Value() {
        return currency_Value;
    }

    public void setCurrency_Value(int currency_Value) {
        this.currency_Value = currency_Value;
    }

    public int getCost_Of_Service() {
        return cost_Of_Service;
    }

    public void setCost_Of_Service(int cost_Of_Service) {
        this.cost_Of_Service = cost_Of_Service;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public String process_For_Using_Pesa() {
        difference = currency_Value - cost_Of_Service;

        if (payment_Type == 1) {
            if (currency_Value == 500 || currency_Value == 1000) {
                display_Result();
            } else {
                System.out.println("Invalid coin value.");
            }
        } else if (payment_Type == 2) {
            if (currency_Value == 2000 || currency_Value == 5000) {
                display_Result();
            } else {
                System.out.println("Invalid banknote value.");
            }
        } else {
            System.out.println("Invalid payment type.");
        }
        return null;
    }

    public String display_Result() {
        if (difference == 0) {
            System.out.println("Thank you for your payment. Have a nice day!");
        } else if (difference > 0) {
            System.out.println("Thank you for your payment. Your change is " + difference + " pesos. Have a nice day!");
        } else {
            System.out.println("Insufficient payment. You are missing " + Math.abs(difference) + " pesos.");
        }
        return null;
    }
}
