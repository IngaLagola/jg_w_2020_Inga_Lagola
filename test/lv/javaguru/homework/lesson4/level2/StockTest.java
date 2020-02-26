package lv.javaguru.homework.lesson4.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest{
    @Test
    void shouldGetCompanyName() {
        String company = "Test";
        Stock stock = new Stock(company,100);
        assertEquals(company,stock.getCompany());
    }

    @Test
    void shouldGetCurrentValue() {
        double currentValue = 100;
        Stock stock = new Stock("Test",100 );
        assertEquals(currentValue,stock.getCurrentValue());
    }

    @Test
    void shouldUpdatePrice() {
        double currentValue = 100;
        double newPrice = 10;
        Stock stock = new Stock("Test",100 );
        stock.updatePrice(newPrice);
        assertEquals(newPrice,stock.getCurrentValue());
    }

    @Test
    void shouldPrintInformation() {
        Stock stock = new Stock("Test", 100);
        stock.printInformation();
    }
}