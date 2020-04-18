package product;

import main.product.Flut;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlutTest {


    @Test
    public void testFlut() {
        int price = 100;
        Flut flut = new Flut(price);
        assertEquals(price, flut.getPrice());
    }


}
