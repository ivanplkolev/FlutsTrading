package product;

import main.product.Flut;
import main.product.Schuur;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchuurTest {

    @Test
    public void testAddGetOrder() {

        Flut flut1 = new Flut(10);
        Flut flut2 = new Flut(20);
        Flut flut3 = new Flut(30);
        Flut flut4 = new Flut(40);

        Schuur schuur = new Schuur();

        schuur.addProduct(flut1);
        schuur.addProduct(flut2);
        schuur.addProduct(flut3);
        schuur.addProduct(flut4);

        assertEquals(flut1, schuur.getProduct());
        assertEquals(flut2, schuur.getProduct());
        assertEquals(flut3, schuur.getProduct());
        assertEquals(flut4, schuur.getProduct());
        assertEquals(false, schuur.hasMoreProducts());
    }
}
