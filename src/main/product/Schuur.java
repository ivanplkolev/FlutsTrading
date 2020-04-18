package main.product;

import java.util.LinkedList;
import java.util.Queue;


public class Schuur implements ProductPile<Flut> {

    /*
    * As the Schuur is a FIFO structure I am using Stack
    *
    **/
    private Queue<Flut> fluts = new LinkedList<>();

    @Override
    public void addProduct(Flut f) {
        fluts.add(f);
    }

    /*
    * The check of the proces of the fluts will restroy the order od the fluts
    * because of that I am checking a shallow copu of the schuur
    *
    **/
    @Override
    public Flut getProduct() {
        return fluts.remove();
    }

    @Override
    public boolean hasMoreProducts() {
        return !fluts.isEmpty();
    }


}
