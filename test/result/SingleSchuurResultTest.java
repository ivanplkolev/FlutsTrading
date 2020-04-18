package result;

import main.result.SingleSchuurResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleSchuurResultTest {

    SingleSchuurResult result1 = new SingleSchuurResult(1, 8);
    SingleSchuurResult result2 = new SingleSchuurResult(5, 4);
    SingleSchuurResult result3 = new SingleSchuurResult(10, 2);
    SingleSchuurResult result4 = new SingleSchuurResult(20, 9);
    SingleSchuurResult result5 = new SingleSchuurResult(20, 12);


    @Test
    public void testSameProfitEquals() {
        assertEquals(result5.isTheSameProfit(result4), true);
    }

    @Test
    public void testSameProfitNotEquals() {
        assertEquals(result1.isTheSameProfit(result3), false);
    }

    @Test
    public void testBetterProfitTrue() {
        assertEquals(result4.isBetterThan(result3), true);
    }

    @Test
    public void testBetterProfitFalse() {
        assertEquals(result1.isBetterThan(result2), false);
    }


}

