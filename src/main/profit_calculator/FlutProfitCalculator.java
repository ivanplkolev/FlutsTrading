package main.profit_calculator;

import main.product.Flut;


/**
 * The exact implementation for calcultaing the profit of selling Fluts
 * It has some hardcoded values which will not be the same for all products
 */
public class FlutProfitCalculator extends ProductProfitCalculator<Flut> {

    private final static int SELLING_PRICE = 10;
    private final static int SHIPPING_FEE = 0;

    @Override
    public int getSellingPrice(Flut flut) {
        return SELLING_PRICE;
    }


    @Override
    public int getShippingFees(Flut flut) {
        return SHIPPING_FEE;
    }


}
