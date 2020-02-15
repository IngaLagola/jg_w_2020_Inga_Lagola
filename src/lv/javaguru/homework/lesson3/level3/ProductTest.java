package lv.javaguru.homework.lesson3.level3;

public class ProductTest{

    public static void main(String[] args) {

        Product myProduct = new Product();

        String name = "Whole grain bread";
        double regularPrice = 1.15;
        double discount = 10;

        myProduct.setBread(name);
        myProduct.setRegularPrice(regularPrice);
        myProduct.setDiscount(discount);
        myProduct.printInformation();
    }

}


