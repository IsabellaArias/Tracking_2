package Exercise6;

public class Exercise_6 {
    private int menu;
    private int total_payable;
    private int Amount_you_want;
    private int sauce;

    private int no_sauce;

    public Exercise_6(int menu, int amount_you_want, int sauce) {
        this.menu = menu;
        Amount_you_want = amount_you_want;
        this.sauce = sauce;
    }

    public void Pizza_Options_Menu() {
        if (menu == 1) {
            no_sauce = 7000 * Amount_you_want;
        } else if (menu == 2) {
            no_sauce = 5000 * Amount_you_want;
        } else if (menu == 3) {
            no_sauce = 15000 * Amount_you_want;
        }

        if (sauce == 1) {
            total_payable = no_sauce + 3000;
            System.out.println("Must pay $" + total_payable);
        } else {
            System.out.println("Must pay $" + no_sauce);
        }
    }
}
