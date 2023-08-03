package Exercise7;

public class Exercise_7 {
    private int action;
    private int days_of_delay;
    private int Return_of_books_or_magazines;
    private int amount;
    private int Late_payment;
    private int Payment_for_loss;

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public int getDays_of_delay() {
        return days_of_delay;
    }

    public void setDays_of_delay(int days_of_delay) {
        this.days_of_delay = days_of_delay;
    }

    public int getReturn_of_books_or_magazines() {
        return Return_of_books_or_magazines;
    }

    public void setReturn_of_books_or_magazines(int return_of_books_or_magazines) {
        Return_of_books_or_magazines = return_of_books_or_magazines;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getLate_payment() {
        return Late_payment;
    }

    public void setLate_payment(int late_payment) {
        Late_payment = late_payment;
    }

    public int getPayment_for_loss() {
        return Payment_for_loss;
    }

    public void setPayment_for_loss(int payment_for_loss) {
        Payment_for_loss = payment_for_loss;
    }

    public int Payment_at_the_bookstore() {
        if (action == 1) {
            if (Return_of_books_or_magazines == 1) {
                Late_payment = amount * days_of_delay * 600;
                return Late_payment;
            } else if (Return_of_books_or_magazines == 2) {
                Late_payment = amount * days_of_delay * 500;
                return Late_payment;
            }
        } else if (action == 2) {
            Payment_for_loss = amount * 10000;
            return Payment_for_loss;
        }
        return 0;
    }
}
