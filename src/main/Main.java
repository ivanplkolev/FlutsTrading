package main;

import main.market_analyzer.MarketAnalyzer;
import main.product.Flut;
import main.product.ProductPile;
import main.product.Schuur;
import main.profit_calculator.FlutProfitCalculator;
import main.result.ComplexSchuurResult;

import java.util.Scanner;

public class Main {


    /**
     * Here We create the MarketAnalyzer object
     * and inject the Profit calculator
     */
    private static MarketAnalyzer marketAnalyzer = new MarketAnalyzer(new FlutProfitCalculator());

    public static void main(String... args) {

        Scanner s = new Scanner(System.in);
        int numberOfShuurs = s.nextInt();


        while (numberOfShuurs > 0) {
            ProductPile[] schuurs = new ProductPile[numberOfShuurs];

            for (int i = 0; i < numberOfShuurs; i++) {
                int flootsNumber = s.nextInt();
                Schuur schuur = new Schuur();
                for (int j = 0; j < flootsNumber; j++) {
                    int flutPrice = s.nextInt();
                    Flut flut = new Flut(flutPrice);
                    schuur.addProduct(flut);
                }
                schuurs[i] = schuur;
            }

            ComplexSchuurResult result = marketAnalyzer.calculateTotalProfit(schuurs);

            System.out.println(result);

            numberOfShuurs = s.nextInt();
        }
    }


}
