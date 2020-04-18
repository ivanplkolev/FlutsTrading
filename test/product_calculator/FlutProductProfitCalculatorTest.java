package product_calculator;

import main.product.Flut;
import main.profit_calculator.FlutProductProfitCalculator;
import main.profit_calculator.ProfitCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlutProductProfitCalculatorTest {


    @Test
    public void testGetProfit() {

        Flut flut1 = new Flut(1);
        Flut flut2 = new Flut(5);
        Flut flut3 = new Flut(10);
        Flut flut4 = new Flut(30);

        ProfitCalculator profitCalculator = new FlutProductProfitCalculator();

        assertEquals(9, profitCalculator.getProfit(flut1));
        assertEquals(5, profitCalculator.getProfit(flut2));
        assertEquals(0, profitCalculator.getProfit(flut3));
        assertEquals(-20, profitCalculator.getProfit(flut4));
    }
}

