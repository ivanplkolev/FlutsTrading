package main.result;


import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * This class represnts the result of computation the profit from a single schuur
 */
public class SingleSchuurResult {

    private int profit;
    private Set<Integer> numberOfFluts;

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public Set<Integer> getNumberOfFluts() {
        return numberOfFluts;
    }

    public void setNumberOfFluts(Set<Integer> numberOfFluts) {
        this.numberOfFluts = numberOfFluts;
    }

    public void addBoughtFluts(int number) {
        getNumberOfFluts().add(number);
    }

    public boolean isBetterThan(SingleSchuurResult other) {
        return this.profit > other.profit;
    }

    public boolean isTheSameProfit(SingleSchuurResult other) {
        return this.profit == other.profit;
    }


    public SingleSchuurResult(int profit, int productsBought) {
        this.profit = profit;
        numberOfFluts = Stream.of(productsBought).collect(Collectors.toSet());
    }

    public static SingleSchuurResult createEmpty() {
        return new SingleSchuurResult(0, 0);
    }
}
