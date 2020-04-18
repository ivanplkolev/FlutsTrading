package main;

import main.market_analyzer.MarketComputer;
import main.product.Flut;
import main.product.ProductPile;
import main.product.Schuur;
import main.profit_calculator.FlutProductProfitCalculator;
import main.result.ComplexSchuurResult;

import java.util.Scanner;

public class Main {

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

            MarketComputer marketComputer = new MarketComputer(new FlutProductProfitCalculator());

            ComplexSchuurResult result = marketComputer.calculateTotalProfit(schuurs);

            System.out.println(result);

            numberOfShuurs = s.nextInt();
        }
    }


}
