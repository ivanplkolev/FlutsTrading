package result;

import main.result.ComplexSchuurResult;
import main.result.SingleSchuurResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexSchuurResultTest {

    ComplexSchuurResult result = new ComplexSchuurResult();

    SingleSchuurResult singleSchuurResult1 = new SingleSchuurResult(20, 9);
    SingleSchuurResult singleSchuurResult2 = new SingleSchuurResult(20, 12);

    @Test
    public void testAddSchuur() {
        result.addSchuur(singleSchuurResult1);


        assertEquals(1, result.getSchuursNumber());
        assertEquals(singleSchuurResult1.getProfit(), result.getProfit());
        assertEquals(singleSchuurResult1.getNumberOfFluts(), result.getNumberOfFluts());
    }

    @Test
    public void testAddTwoSchuurs() {
        result.addSchuur(singleSchuurResult1);
        result.addSchuur(singleSchuurResult2);

        assertEquals(result.getSchuursNumber(), 2);
        assertEquals(singleSchuurResult1.getProfit() + singleSchuurResult2.getProfit(), result.getProfit());
        assertEquals(singleSchuurResult1.getNumberOfFluts().size()
                * singleSchuurResult2.getNumberOfFluts().size(), result.getNumberOfFluts().size());
    }

}
