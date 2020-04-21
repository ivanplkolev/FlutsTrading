package main.profit_calculator;


import main.product.Product;

/**
 * This is a Profict calculator for products.
 * Low level interface for products
 * This provides skeleton algorithm for calculating the profit
 * Here is used the Template method design pattern
 */
public abstract class ProductProfitCalculator<T extends Product>
        implements ProfitCalculator<T> {


    @Override
    public int getTotalCost(T product) {
        return getSellingPrice(product);
    }

    @Override
    public int getExpenseCost(T product) {
        return getShippingFees(product) + product.getPrice();
    }


    public abstract int getShippingFees(T product);

    public abstract int getSellingPrice(T product);
}
