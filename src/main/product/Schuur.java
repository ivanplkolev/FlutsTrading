package main.product;

import java.util.LinkedList;
import java.util.Queue;


public class Schuur implements ProductPile<Flut> {

    /*
    * As the Schuur is a FIFO structure
    * since the 1st read Flut from the input is actually at the top of the pile
    * and this is also the 1st bought flut
    * Queue structure is used
    *
    **/
    private Queue<Flut> fluts = new LinkedList<>();

    @Override
    public void addProduct(Flut f) {
        fluts.add(f);
    }

    /*
    * The check of the proces of the fluts will destroy the structure
    * because of that if no destroy is needed use a shallow copy of the Schuur object
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
