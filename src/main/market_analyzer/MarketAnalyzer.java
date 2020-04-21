package main.market_analyzer;

import main.product.ProductPile;
import main.profit_calculator.ProfitCalculator;
import main.result.ComplexSchuurResult;
import main.result.SingleSchuurResult;

public class MarketAnalyzer {


    /**
     * This calculator is injected via the constructor
     */
    private ProfitCalculator calculator;


    public MarketAnalyzer(ProfitCalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Calculates the profit for buying from all Schuurs from the island.
     * It is agregating method for calculateSingleSchuurProfit
     *
     * @param schuurs represents all schuurs in Timboektoe
     * @return the result for computation the maximum profit
     */
    public ComplexSchuurResult calculateTotalProfit(ProductPile[] schuurs) {
        ComplexSchuurResult result = new ComplexSchuurResult();
        for (ProductPile schuur : schuurs) {
            SingleSchuurResult schuurResult = calculateSingleSchuurProfit(schuur);
            result.addSchuur(schuurResult);
        }
        return result;
    }

    /**
     * Calculates the profit from buying from a single Schuur
     *
     * @param schuur represents a single pile of Fluts (Schuur)
     * @return the result of computing the best profit for buying Fluts from that Schuur
     */
    public SingleSchuurResult calculateSingleSchuurProfit(ProductPile schuur) {

        SingleSchuurResult bestResult = SingleSchuurResult.createEmpty();
        SingleSchuurResult totalResult = SingleSchuurResult.createEmpty();

        int boughtFluts = 0;
        while (schuur.hasMoreProducts()) {
            boughtFluts++;
            int tmpProfit = calculator.getProfit(schuur.getProduct());
            totalResult = new SingleSchuurResult(totalResult.getProfit() + tmpProfit, boughtFluts);
            if (totalResult.isBetterThan(bestResult)) {
                bestResult = totalResult;
            } else if (totalResult.isTheSameProfit(bestResult)) {
                bestResult.addBoughtFluts(boughtFluts);
            }
        }

        return bestResult;
    }
}
