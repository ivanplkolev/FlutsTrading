package main.profit_calculator;


import main.product.Product;

/**
 * This is a Profict calculator for products.
 * Low level interface for products
 * This provides skeleton algorith for calculating the profit
 * Here is used the Template method design pattern
 */
public abstract class ProductProfitCalculator<T extends Product>
        implements ProfitCalculator {


    /**
     * Template method, calculates the profit
     * adding the value of the selling price
     * and substracting the cost of the product before selling it
     *
     * @param product the product we want to sell
     * @return int the profit of the selling that product
     */
    @Override
    public int getTotalCost(Product product) {
        return getSellingPrice((T) product);
    }

    @Override
    public int getExpenseCost(Product product) {
        return getShippingFees((T) product) + product.getPrice();
    }


    public abstract int getShippingFees(T f);

    public abstract int getSellingPrice(T f);
}
