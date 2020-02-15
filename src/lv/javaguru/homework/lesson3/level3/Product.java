package lv.javaguru.homework.lesson3.level3;

public class Product{

    private String name;
    private double regularPrice;
    private double discount;

    public void printInformation(){
        System.out.println("name " + name);
        System.out.println("regularPrice " + regularPrice);
        System.out.println("discount " + discount);
        System.out.println("actualPrice " + calculateActualPrice());
    }
    public double calculateActualPrice(){
        return regularPrice - (regularPrice * discount) / 100;
    }
        public void setBread(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    public double getRegularPrice(){
        return regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getDiscount(){
        return discount;
    }
}

