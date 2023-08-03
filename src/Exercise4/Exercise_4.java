package Exercise4;
import javax.swing.*;
public class Exercise_4 {
    private int type_of_service;
    private int Quantity_of_Garments;
    private int Types_of_washing;
    private int home=3000;
    private int total_payable;

    public int getType_of_service() {
        return type_of_service;
    }

    public void setType_of_service(int type_of_service) {
        this.type_of_service = type_of_service;
    }

    public int getQuantity_of_Garments() {
        return Quantity_of_Garments;
    }

    public void setQuantity_of_Garments(int quantity_of_Garments) {
        Quantity_of_Garments = quantity_of_Garments;
    }

    public int getTypes_of_washing() {
        return Types_of_washing;
    }

    public void setTypes_of_washing(int types_of_washing) {
        Types_of_washing = types_of_washing;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getTotal_payable() {
        return total_payable;
    }

    public void setTotal_payable(int total_payable) {
        this.total_payable = total_payable;
    }

    public void Services(){
        if (type_of_service==1){
            Show_Types_of_washing();
        }else if (type_of_service==2){
            total_payable=Quantity_of_Garments*1800+home;
            System.out.println("must pay $"+ total_payable);
        }
    }
    public void Show_Types_of_washing(){
        Types_of_washing=(Integer.parseInt(JOptionPane.showInputDialog("Washing: 1) Dry 2) Normal")));
        if(Types_of_washing==1){
            total_payable=Quantity_of_Garments * 2000;
            System.out.println("must pay $"+ total_payable);
        }else if(Types_of_washing==2){
            total_payable=Quantity_of_Garments * 1500;
            System.out.println("must pay $"+ total_payable);
        }else{
            System.out.println("invalid option");
        }
    }
}
