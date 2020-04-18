package hackerrank_style;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This is very fast and effective solution.
 * Used in the Hackerrank style tasks
 * <p>
 * It is debuggable but not testable
 */
public class Main {

    public static void main(String... args) {

        Scanner s = new Scanner(System.in);
        int shoorsNumber = s.nextInt();
        while (shoorsNumber > 0) {
            int[][] schuurs = new int[shoorsNumber][];
            for (int i = 0; i < shoorsNumber; i++) {
                int flootsNumber = s.nextInt();
                schuurs[i] = new int[flootsNumber];
                for (int j = 0; j < flootsNumber; j++) {
                    schuurs[i][j] = s.nextInt();
                }
            }

            calculateFlutsProfit(schuurs);

            shoorsNumber = s.nextInt();
        }
    }


    private static void calculateFlutsProfit(int[][] schuurs) {

        int maxProfit = 0;

        Set<Integer> totalFlutsNumber = new HashSet<>();
        totalFlutsNumber.add(0);

        for (int[] schuur : schuurs) {
            int localMaxProfit = 0;
            Set<Integer> localFlutsNumber = new HashSet<>();
            localFlutsNumber.add(0);
            int localProfit = 0;

            for (int j = 0; j < schuur.length; j++) {
                int flutPrice = schuur[j];
                localProfit = localProfit + 10 - flutPrice;

                if (localProfit > localMaxProfit) {
                    localMaxProfit = localProfit;
                    localFlutsNumber.clear();
                    localFlutsNumber.add(j + 1);
                } else if (localProfit == localMaxProfit) {
                    localFlutsNumber.add(j + 1);
                }
            }

            maxProfit += localMaxProfit;
            totalFlutsNumber = totalFlutsNumber.stream()
                    .flatMap(a -> localFlutsNumber.stream().map(b -> a + b))
                    .collect(Collectors.toSet());
        }

        System.out.printf("schuurs %d\n", schuurs.length);
        System.out.printf("Maximum profit is %d.\n", maxProfit);
        System.out.printf("Number of fluts to buy: %s\n",
                String.join(" ", totalFlutsNumber.stream()
                        .sorted()
                        .map(String::valueOf)
                        .collect(Collectors.toList())));
    }

}
