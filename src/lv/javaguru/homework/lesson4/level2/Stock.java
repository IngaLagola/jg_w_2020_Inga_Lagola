package lv.javaguru.homework.lesson4.level2;

//OK
public class Stock{

    private String company;
    private double currentValue;
    private double max;
    private double min;

    Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        this.max = currentValue;
        this.min = currentValue;
    }

    public String getCompany() {
        return company;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public void updatePrice(double currentValue) {
        this.currentValue = currentValue;
        if (currentValue < min) {
            min = currentValue;
        }
        if (currentValue > max) {
            max = currentValue;
        }
    }

    public void printInformation() {
        System.out.println("Company name = " + company);
        System.out.println("Current value = " + currentValue);
        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);

    }

}
