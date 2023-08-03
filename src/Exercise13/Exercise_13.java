package Exercise13;

public class Exercise_13 {
    private int brand;
    private int reference;

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public void Information_and_Features(){
        if (brand == 1){
            System.out.println("Chevrolet Captiva is a spacious and comfortable SUV.");
            System.out.println("Chevrolet Tracker is a compact and versatile SUV.");
        }else if (brand == 2){
            System.out.println("Mazda3 is a sports sedan with style and advanced technology.");
            System.out.println("Mazda CX-5 is a stylish SUV with excellent performance.");
        }else if (brand == 3){
            System.out.println("Renault Sandero is a practical and economical hatchback.");
            System.out.println("Renault Duster is a robust and adventurous SUV.");
        }
    }
}
