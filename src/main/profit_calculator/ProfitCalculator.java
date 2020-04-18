package main.profit_calculator;


import main.product.Product;

/**
 * This is a high level interface for calculating the profit of an product
 * <p>
 * it provides default interface for calculating
 * the profit as substraction between the final cost and the expence cost
 */
public interface ProfitCalculator<T extends Product> {


    /**
     * This is the template method for calculating the profit
     * The used design pattern is Template
     *
     * @param p -  the product which profit we need to calculate
     * @return the amount of the profit
     */
    default int getProfit(T p) {
        return getTotalCost(p) - getExpenseCost(p);
    }

    int getTotalCost(T p);

    int getExpenseCost(T p);
}
