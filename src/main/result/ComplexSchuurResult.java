package main.result;

import java.util.stream.Collectors;


/**
 * This class the result of merging the results from some schuurs
 * it has the same properties as the single results, as it accomulates some single results
 * in addition this class remains the count of the schuurs it has merged
 */
public class ComplexSchuurResult extends SingleSchuurResult {

    int schuursNumber;

    public ComplexSchuurResult() {
        super(0, 0);
        schuursNumber = 0;
    }


    public int getSchuursNumber() {
        return schuursNumber;
    }


    /**
     * This is the merging method
     * It accomulates the single results from some schuurs
     *
     * @param other the merged SingleSchuurResult
     */
    public void addSchuur(SingleSchuurResult other) {
        schuursNumber++;
        setProfit(getProfit() + other.getProfit());

        setNumberOfFluts(getNumberOfFluts().stream()
                .flatMap(a -> other.getNumberOfFluts().stream().map(b -> a + b))
                .collect(Collectors.toSet()));
    }


    @Override
    public String toString() {
        return String.format("schuurs %d\n", schuursNumber)
                + String.format("Maximum profit is %d.\n", getProfit())
                + String.format("Number of fluts to buy: %s\n",
                String.join(" ", getNumberOfFluts().stream()
                        .sorted()
                        .map(String::valueOf)
                        .collect(Collectors.toList())));
    }


}
