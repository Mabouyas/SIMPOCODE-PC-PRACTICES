package OBJET_ORIENTED_PROGRAMMING.CustomClass_01;

public class Car {
    String brandName;
    String modelName;
    int yearName;
    double priceAmount;

    //Constructor parameterized
    public Car(String brand, String model, int year, double price) {
        this.brandName = brand;
        this.modelName = model;
        this.yearName = year;
        this.priceAmount = price;
    }

    //Print data
    public String printData() {
        String result = yearName +" "+modelName+" "+brandName+" "+priceAmount;
        return result;
    }

}
